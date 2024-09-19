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
import pages.ZiraatCalculationToolConsumerCreditPage;
import pages.ZiraatCalculationToolPage;

import java.io.IOException;

public class ZiraatCalculationToolCreditCalculationTest extends MainPage{


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
        Assert.assertEquals("Tüketici Kredisi",myZiraatCalculationToolConsumerCreditPage.welcomeScreen);
    }

    @Then("I fill the form and click calculation button for consumer credit on the page {string}{string}{string}")
    public void iFillTheFormAndClickCalculationButtonForConsumerCreditOnThePage(String amount, String time, String rate) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolConsumerCreditPage myZiraatCalculationToolConsumerCreditPage = new ZiraatCalculationToolConsumerCreditPage(driver);
        MainPage.clearText(myZiraatCalculationToolConsumerCreditPage.amount(driver));
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.amount(driver),amount);
        MainPage.clearText(myZiraatCalculationToolConsumerCreditPage.time(driver));
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.time(driver),time);
        MainPage.sendKey(myZiraatCalculationToolConsumerCreditPage.rate(driver),rate);
        MainPage.clickButton(myZiraatCalculationToolConsumerCreditPage.calculateButton(driver));
    }

    @Then("I verify that consumer credit result is showed on the page {string}{string}{string}")
    public void iVerifyThatConsumerCreditResultIsShowedOnThePage(String installmentAmount, String interestRate, String totalCostRate) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolConsumerCreditPage myZiraatCalculationToolConsumerCreditPage = new ZiraatCalculationToolConsumerCreditPage(driver);
        Assert.assertEquals(installmentAmount,myZiraatCalculationToolConsumerCreditPage.installmentAmount(driver));
        Assert.assertEquals(interestRate,myZiraatCalculationToolConsumerCreditPage.interestRate(driver));
        Assert.assertEquals(totalCostRate,myZiraatCalculationToolConsumerCreditPage.totalCostRate(driver));
    }



}
