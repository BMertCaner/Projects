package testcases;

//import pages.HepsiburadaHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.*;

import java.io.IOException;

public class HepsiburadaLaunchTest extends MainPage{

    @Given("^I launch \"([^\"]*)\" browser with hepsiburada$")
    public void iLaunchChromeBrowserWithHepsiburada(String arg0) {

        driver.navigate().to("https://www.hepsiburada.com/");
        MainPage.MaximizeScreen(driver);

    }

    @Then("I verify that the web site is presented on the page")
    public void iVerifyThatTheWebSiteIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(5000);
        HepsiburadaHomePage myHepsiburadaHomePage = new HepsiburadaHomePage(driver);
        Assert.assertEquals("Süper Fiyat, Süper Teklif", myHepsiburadaHomePage.welcomeScreen);
    }



    @Before("@chrome and @hepsiburada")
    public void beforeFirstChrome() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("chrome");
        System.out.println("This will run only before the chrome Scenario");
    }

    @Before("@firefox and @hepsiburada")
    public void beforeFirstFirefox() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("firefox");
        System.out.println("This will run only before the chrome Scenario");
    }

    @After("@hepsiburada")
    public void beforeAfter(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String testName = scenario.getName();
            scenario.attach(screenshot, "image/png", "Petshop hata");

        }

        //MainPage.closeBrowser(driver);

    }

}
