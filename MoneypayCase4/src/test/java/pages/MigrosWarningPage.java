package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MigrosWarningPage {

    public String welcomeScreen;

    public WebElement warning;

    public MigrosWarningPage(WebDriver driver) {

        // welcomeScreen = driver.findElement(By.xpath("//*[@id=\"DealOfTheDay_db5fec40-7132-4b28-12b8-3b61bb71ecf4\"]/div/div/div[1]/h2")).getText();

        warning = driver.findElement(By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/fe-product-try-ai-popup/div/button"));

    }



}