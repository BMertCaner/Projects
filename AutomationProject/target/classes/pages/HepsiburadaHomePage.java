package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HepsiburadaHomePage {

    public String welcomeScreen;
    public WebElement solutionCenter;


    public HepsiburadaHomePage(WebDriver driver) {

        // welcomeScreen = driver.findElement(By.xpath("//*[@id=\"DealOfTheDay_db5fec40-7132-4b28-12b8-3b61bb71ecf4\"]/div/div/div[1]/h2")).getText();

        solutionCenter = driver.findElement(By.xpath("//a[@href='https://www.hepsiburada.com/cozummerkezi']"));

    }

}