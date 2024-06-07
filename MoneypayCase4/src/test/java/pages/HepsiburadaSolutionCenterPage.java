package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HepsiburadaSolutionCenterPage {

    public String solutionCenter;

    public WebElement productInfo;

    public HepsiburadaSolutionCenterPage(WebDriver driver) {

        solutionCenter = driver.findElement(By.xpath("//*[@id=\"solution-center\"]/div[2]/div[1]/div/div[2]/div[1]")).getText();

        productInfo = driver.findElement(By.xpath("//*[@id=\"solution-center\"]/div[2]/div[1]/div/div[2]/div[2]/div/div/div"));

    }




}
