package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HepsiburadaSolutionCenterProductInfoPage {


    public WebElement isProductOriginal;

    public WebElement callMeNow;

    public HepsiburadaSolutionCenterProductInfoPage(WebDriver driver) {

        isProductOriginal = driver.findElement(By.xpath("//*[@id=\"collapsible-188\"]/div/div/span"));

    }

    public WebElement getCallMeNow(WebDriver driver) {

        callMeNow = driver.findElement(By.xpath("//*[@id=\"faq-detail-188\"]/div/div[2]/div[1]/a/button/span"));
        return callMeNow;
    }


}
