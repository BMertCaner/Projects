package testcases;

import pages.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.After;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class MigrosPetShopLowSortTest extends MainPage{

    @Given("^I launch \"([^\"]*)\" browser with migros$")
    public void iLaunchChromeBrowserWithMigros(String arg0) {

        driver.navigate().to("https://www.migros.com.tr/");
        MainPage.MaximizeScreen(driver);

    }

    @Then("I verify that the migros web site is presented on the page")
    public void iVerifyThatTheMigrosWebSiteIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(5000);
        //HomePage myHomePage = new HomePage(driver);
        //Assert.assertEquals("Süper Fiyat, Süper Teklif",myHomePage.welcomeScreen);
    }

    @When("I click warning")
    public void iClickWarning() throws InterruptedException {

        Thread.sleep(4000);
        MigrosWarningPage myMigrosWarningPage = new MigrosWarningPage(driver);
        MainPage.clickButton(myMigrosWarningPage.warning);

    }

    @When("I click pet shop products")
    public void iClickPetShopProducts() throws InterruptedException {

        Thread.sleep(4000);
        MigrosHomePage myMigrosHomePage = new MigrosHomePage(driver);
        MainPage.moveToElement(driver,myMigrosHomePage.petShop);
        MainPage.clickButton(myMigrosHomePage.petShop);

    }

    @Then("I verify that pet shop products is presented on the page")
    public void iVerifyThatPetShopProductsIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        MigrosPetshopPage myMigrosPetshopPage = new MigrosPetshopPage(driver);
        Assert.assertEquals("Pet Shop",myMigrosPetshopPage.petShopScreen);
    }

    @When("I click low price sort button on the page")
    public void iClickLowPriceSortButtonOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        MigrosPetshopPage myMigrosPetshopPage = new MigrosPetshopPage(driver);
        MainPage.clickButton(myMigrosPetshopPage.lowPriceSort(driver));

        Thread.sleep(4000);
        MainPage.clickButton(myMigrosPetshopPage.lowPriceSortSort(driver));

    }

    @Then("I verify that low price is sorted on the page")
    public void iVerifyThatLowPriceIsSortedOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        MigrosPetshopPage myMigrosPetshopPage = new MigrosPetshopPage(driver);
        Assert.assertTrue(myMigrosPetshopPage.isSortedMethod(driver));

    }

    @Before("@chrome and @migros")
    public void beforeFirstChrome() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("chrome");
        System.out.println("This will run only before the chrome Scenario");
    }

    @Before("@firefox and @migros")
    public void beforeFirstFirefox() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("firefox");
        System.out.println("This will run only before the firefox Scenario");
    }

    @After("@migros")
    public void beforeAfter(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String testName = scenario.getName();
            scenario.attach(screenshot, "image/png", "Petshop hata");

        }

        MainPage.closeBrowser(driver);

    }

}
