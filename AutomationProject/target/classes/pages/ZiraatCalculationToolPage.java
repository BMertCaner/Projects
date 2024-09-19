package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZiraatCalculationToolPage {

    public String welcomeScreen;

    public ZiraatCalculationToolPage(WebDriver driver) {

        welcomeScreen = driver.findElement(By.xpath("//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")).getText();

    }

    public WebElement consumerCredit(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"landingNav\"]/div[2]/div/div/div/div/div[1]/ul/li[1]/a"));
    }

    public WebElement depositYieldCalculation(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"landingNav\"]/div[3]/div[2]/div/h2/a"));
    }

    public WebElement ibanCalculation(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"landingNav\"]/div[3]/div[3]/div/h2/a"));
    }




}