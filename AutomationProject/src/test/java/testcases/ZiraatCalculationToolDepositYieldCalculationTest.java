package testcases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import pages.ZiraatCalculationToolDepositYieldCalculationPage;
import pages.ZiraatCalculationToolPage;

public class ZiraatCalculationToolDepositYieldCalculationTest extends MainPage{


    @When("I click deposit yield calculation page")
    public void iClickDepositYieldCalculationPage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolPage myZiraatCalculationToolPage = new ZiraatCalculationToolPage(driver);
        //MainPage.moveToElement(driver,myZiraatCalculationToolPage.consumerCredit);
        MainPage.clickButton(myZiraatCalculationToolPage.depositYieldCalculation(driver));

    }

    @Then("I verify that deposit yield calculation is presented on the page")
    public void iVerifyThatDepositYieldCalculationIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolDepositYieldCalculationPage myZiraatCalculationToolDepositYieldCalculationPage = new ZiraatCalculationToolDepositYieldCalculationPage(driver);
        Assert.assertEquals("Mevduat Getirisi Hesaplama",myZiraatCalculationToolDepositYieldCalculationPage.welcomeScreen);
    }

    @Then("I fill the form and click calculation button for usd deposit yield calculation on the page {string}{string}")
    public void iFillTheFormAndClickCalculationButtonForDepositYieldCalculationOnThePage(String time, String amount) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolDepositYieldCalculationPage myZiraatCalculationToolDepositYieldCalculationPage = new ZiraatCalculationToolDepositYieldCalculationPage(driver);
        MainPage.clickButton(myZiraatCalculationToolDepositYieldCalculationPage.currencyUsd(driver));
        MainPage.clearText(myZiraatCalculationToolDepositYieldCalculationPage.time(driver));
        MainPage.sendKey(myZiraatCalculationToolDepositYieldCalculationPage.time(driver),time);
        MainPage.sendKey(myZiraatCalculationToolDepositYieldCalculationPage.amount(driver),amount);
        MainPage.clickButton(myZiraatCalculationToolDepositYieldCalculationPage.calculateButton(driver));
    }

    @Then("I verify that deposit yield calculation result is showed on the page {string}{string}")
    public void iVerifyThatConsumerCreditResultIsShowedOnThePage(String maturityAmount, String interestRate) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolDepositYieldCalculationPage myZiraatCalculationToolDepositYieldCalculationPage = new ZiraatCalculationToolDepositYieldCalculationPage(driver);
        Assert.assertEquals(maturityAmount,myZiraatCalculationToolDepositYieldCalculationPage.maturityAmount(driver));
        Assert.assertEquals(interestRate,myZiraatCalculationToolDepositYieldCalculationPage.interestRate(driver));
    }



}
