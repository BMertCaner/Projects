package testcases;

import base.MainProcess;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

import pages.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;

public  class MigrosServiceTest {

    public MainProcess process = new MainProcess();

    @Given("I set the service url with {string}")
    public void iSetTheServiceUrlWith(String url) throws InterruptedException {

        Thread.sleep(1000);
        process.setUrl(url);

    }

    @When("I call the service with type {string}{string}")
    public void iCallTheServiceWithType(String body, String serviceType) throws IOException, InterruptedException {

        Thread.sleep(1000);
        process.setBody(body);
        process.callService(serviceType);

    }

    @Then("I verify that the response code {string} is correct")
    public void iVerifyThatTheResponseCodeIsCorrect(String responseCode) throws InterruptedException {

        Thread.sleep(1000);
        process.setResponseCode(responseCode);
        process.testResponseStatus();

    }

    @Then("I verify that the response body {string} is correct")
    public void iVerifyThatTheResponseBodyIsCorrect(String body) throws InterruptedException, IOException {

        Thread.sleep(1000);
        process.controlContent(body);

    }



}
