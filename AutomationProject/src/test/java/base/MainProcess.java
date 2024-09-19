package base;


import java.io.IOException;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.fasterxml.jackson.databind.ObjectMapper;


public class MainProcess {

    public String url;
    public Response response;
    public String responseCode;
    public String pathParameters;
    public String queryParameters;
    public String headers = "{\"Content-Type\":\"application/json\",\"Accept\":\"*/*\"}";
    public String body;
    RequestSpecification request = RestAssured.given();

    public String getUrl(){
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Response getResponse(){
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getHeaders(){
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getResponseCode(){
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void controlContent(String contentControl) throws IOException {

        if(!contentControl.contains("{")){
            if(response.asString().equals(contentControl)){

            }else{
                throw new AssertionError(response.asString()+ " is not equal to " + contentControl);
            }

        } else if (true) {

            ObjectMapper mapper = new ObjectMapper();
            try {
                Map<String, Object> mappedControl = mapper.readValue(contentControl, Map.class);
                for (String key : mappedControl.keySet()) {
                    response.then().assertThat().body(key, equalTo(mappedControl.get(key)));
                }
            } catch (Exception e) {
                throw new IOException("Failed to parse JSON content: " + e.getMessage(), e);
            }
        }

    }

    public void callService(String methodType) throws IOException {

        ObjectMapper mapHeader = new ObjectMapper();
        Map<String, Object> mappedHeader = mapHeader.readValue(headers, Map.class);
        request.headers(mappedHeader);

        switch (methodType){
            case "GET":
                callGETService();
                break;
            case "POST":
                callPOSTService();
                break;
            case "PUT":
                callPUTService();
                break;
            case "DELETE":
                callDELETEService();
                break;
            default:
                throw new IllegalArgumentException("Wrong Type");

        }

    }

    public void callGETService() {
        response = request.relaxedHTTPSValidation("TLS").get(url); //body(body)
    }

    public void callPOSTService() {
        response = request.relaxedHTTPSValidation("TLS").body(body).post(url);
    }

    public void callPUTService() {
        response = request.relaxedHTTPSValidation("TLS").body(body).put(url);
    }

    public void callDELETEService() {
        response = request.relaxedHTTPSValidation("TLS").body(body).delete(url);
    }

    public void testResponseStatus(){
        response.then().assertThat().statusCode(Integer.parseInt(responseCode));
    }

}


