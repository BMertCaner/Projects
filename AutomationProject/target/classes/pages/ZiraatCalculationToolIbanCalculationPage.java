package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZiraatCalculationToolIbanCalculationPage {

    public String welcomeScreen;

    public ZiraatCalculationToolIbanCalculationPage(WebDriver driver) {

        welcomeScreen = driver.findElement(By.xpath("//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")).getText();

    }

    public WebElement sortByCode(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e695900_fa27_4b93_9f42_078763fb2ef5\"]/div/div[2]/div[1]/div/span"));
    }

    public WebElement branch(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e695900_fa27_4b93_9f42_078763fb2ef5\"]/div/div[3]/div[1]/div/span/span[1]/span/span[2]/b"));
    }

    public WebElement branchText(WebDriver driver){
        return driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
    }

    public WebElement customerNo(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"musteriNo\"]"));
    }

    public WebElement annexNo(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ekNo\"]"));
    }

    public WebElement calculateButton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e695900_fa27_4b93_9f42_078763fb2ef5\"]/div/div[4]/div/a"));
    }

    public String ibanNo(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_5e695900_fa27_4b93_9f42_078763fb2ef5\"]/div/div[6]/div[2]/div/span")).getText();
    }




}