package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZiraatCalculationToolConsumerCreditPage {

    public String welcomeScreen;

    public ZiraatCalculationToolConsumerCreditPage(WebDriver driver) {

        welcomeScreen = driver.findElement(By.xpath("//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")).getText();

    }

    public WebElement amount(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"calc-tutar\"]"));
    }

    public WebElement time(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"calc-vade\"]"));
    }

    public WebElement rate(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"faiz-orani\"]"));
    }

    public WebElement calculateButton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[2]/div[2]/a"));
    }

    public String installmentAmount(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[3]/div[2]/div[1]/span")).getText();
    }

    public String interestRate(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[3]/div[2]/div[2]/span")).getText();
    }

    public String totalCostRate(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[3]/div[2]/div[3]/span")).getText();
    }


}