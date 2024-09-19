package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZiraatCalculationToolDepositYieldCalculationPage {

    public String welcomeScreen;

    public ZiraatCalculationToolDepositYieldCalculationPage(WebDriver driver) {

        welcomeScreen = driver.findElement(By.xpath("//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")).getText();

    }

    public WebElement currencyDropdown(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[2]/div[1]/div/span/span[1]/span/span[2]/b"));
    }

    public WebElement currencyUsd(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"dovizCinsi\"]/option[2]"));
    }

    public WebElement time(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"deposit-calc-vade\"]"));
    }

    public WebElement amount(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"tutar\"]"));
    }

    public WebElement calculateButton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[3]/div/a"));
    }

    public String maturityAmount(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[4]/div[2]/div[1]/span")).getText();
    }

    public String interestRate(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[4]/div[2]/div[2]/span")).getText();
    }




}