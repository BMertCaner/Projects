package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HepsiburadaLoginPage {

    public String loginScreen;
    public WebElement username;
    public WebElement loginButtonFirst;
    public WebElement password;
    public WebElement loginButtonSecond;

    public HepsiburadaLoginPage(WebDriver driver) {

        loginScreen = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div[1]")).getText();

    }

    public WebElement getUsername(WebDriver driver) {

        username = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/form/div/div[1]/input"));
        return username;
    }

    public WebElement getLoginButtonFirst(WebDriver driver){

        loginButtonFirst = driver.findElement(By.id("btnLogin"));
        return loginButtonFirst;
    }
    public WebElement getPassword(WebDriver driver) {

        password = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/form/div/div/input"));
        return password;
    }

    public WebElement getLoginButtonSecond(WebDriver driver){

        loginButtonSecond = driver.findElement(By.xpath("//*[@id=\"btnEmailSelect\"]"));
        return loginButtonSecond;
    }

}
