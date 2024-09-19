package testcases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.MainPage;
import pages.ZiraatCalculationToolPage;
import pages.ZiraatCalculationToolConsumerCreditPage;

import java.io.IOException;

public class ZiraatCalculationToolTest extends MainPage{

    @Given("^I launch \"([^\"]*)\" browser with ziraat$")
    public void iLaunchChromeBrowserWithZiraat(String arg0) {

        driver.navigate().to("https://www.ziraatbank.com.tr/tr/hesaplama-araclari");
        MainPage.MaximizeScreen(driver);

    }

    @Then("I verify that the calculation tool web site is presented on the page")
    public void iVerifyThatTheCalculationToolWebSiteIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(5000);
        ZiraatCalculationToolPage myZiraatCalculationToolPage = new ZiraatCalculationToolPage(driver);
        Assert.assertEquals("Hesaplama Araçları",myZiraatCalculationToolPage.welcomeScreen);
    }

    @When("I click consumer credit page")
    public void iClickConsumerCreditPage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolPage myZiraatCalculationToolPage = new ZiraatCalculationToolPage(driver);
        //MainPage.moveToElement(driver,myZiraatCalculationToolPage.consumerCredit);
        MainPage.clickButton(myZiraatCalculationToolPage.consumerCredit(driver));

    }

    @Then("I verify that consumer credit is presented on the page")
    public void iVerifyThatConsumerCreditIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolConsumerCreditPage myZiraatCalculationToolConsumerCreditPage = new ZiraatCalculationToolConsumerCreditPage(driver);
        Assert.assertEquals(" Tüketici Kredisi",myZiraatCalculationToolConsumerCreditPage.welcomeScreen);
    }

    @Then("I fill the form and click calculation button on the page {string}{string}{string}")
    public void iFillTheFormAndClickCalculationButtonOnThePage(String amount, String time, String rate) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolConsumerCreditPage myZiraatCalculationToolConsumerCreditPage = new ZiraatCalculationToolConsumerCreditPage(driver);
        MainPage.clearText(myZiraatCalculationToolConsumerCreditPage.amount(driver));
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.amount(driver),amount);
        MainPage.clearText(myZiraatCalculationToolConsumerCreditPage.time(driver));
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.time(driver),time);
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.rate(driver),rate);
        MainPage.clickButton(myZiraatCalculationToolConsumerCreditPage.calculateButton(driver));
    }

    @Then("I verify that interest calculation result is showed on the page {string}{string}{string}")
    public void iVerifyThatInterestCalculationResultIsShowedOnThePage(String installmentAmount, String interestRate, String totalCostRate) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolConsumerCreditPage myZiraatCalculationToolConsumerCreditPage = new ZiraatCalculationToolConsumerCreditPage(driver);
        Assert.assertEquals(installmentAmount,myZiraatCalculationToolConsumerCreditPage.installmentAmount(driver));
        Assert.assertEquals(interestRate,myZiraatCalculationToolConsumerCreditPage.interestRate(driver));
        Assert.assertEquals(totalCostRate,myZiraatCalculationToolConsumerCreditPage.totalCostRate(driver));
    }

    @Before("@chrome and @ziraat")
    public void beforeFirstChrome() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("chrome");
        System.out.println("This will run only before the chrome Scenario");
    }

    @Before("@firefox and @ziraat")
    public void beforeFirstFirefox() throws IOException {
        //Log.startLog("Start of Test cases ");
        driver = MainPage.openBrowser("firefox");
        System.out.println("This will run only before the firefox Scenario");
    }

    @After("@ziraat")
    public void beforeAfter(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String testName = scenario.getName();
            scenario.attach(screenshot, "image/png", "Ziraat Error");

        }

        MainPage.closeBrowser(driver);

    }

}
