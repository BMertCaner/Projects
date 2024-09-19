package testcases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MainPage;
import pages.ZiraatCalculationToolIbanCalculationPage;
import pages.ZiraatCalculationToolPage;

import static org.openqa.selenium.Keys.*;

public class ZiraatCalculationToolIbanCalculationTest extends MainPage{


    @When("I click iban calculation page")
    public void iClickIbanCalculationPage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolPage myZiraatCalculationToolPage = new ZiraatCalculationToolPage(driver);
        //MainPage.moveToElement(driver,myZiraatCalculationToolPage.consumerCredit);
        MainPage.clickButton(myZiraatCalculationToolPage.ibanCalculation(driver));

    }

    @Then("I verify that iban calculation is presented on the page")
    public void iVerifyThatIbanCalculationIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolIbanCalculationPage myZiraatCalculationToolIbanCalculationPage = new ZiraatCalculationToolIbanCalculationPage(driver);
        Assert.assertEquals("IBAN Hesaplama",myZiraatCalculationToolIbanCalculationPage.welcomeScreen);
    }

    @Then("I fill the form and click calculation button for iban calculation on the page {string}{string}{string}")
    public void iFillTheFormAndClickCalculationButtonForIbanCalculationOnThePage(String branch, String customerNo, String annexNo) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolIbanCalculationPage myZiraatCalculationToolIbanCalculationPage = new ZiraatCalculationToolIbanCalculationPage(driver);
        MainPage.clickButton(myZiraatCalculationToolIbanCalculationPage.sortByCode(driver));
        MainPage.clickButton(myZiraatCalculationToolIbanCalculationPage.branch(driver));
        MainPage.sendKey(myZiraatCalculationToolIbanCalculationPage.branchText(driver),branch);
        MainPage.sendKeyboard(myZiraatCalculationToolIbanCalculationPage.branchText(driver), ENTER);
        MainPage.sendKey(myZiraatCalculationToolIbanCalculationPage.customerNo(driver),customerNo);
        MainPage.sendKey(myZiraatCalculationToolIbanCalculationPage.annexNo(driver),annexNo);
        MainPage.clickButton(myZiraatCalculationToolIbanCalculationPage.calculateButton(driver));
    }

    @Then("I verify that deposit yield calculation result is showed on the page {string}")
    public void iVerifyThatDepositYieldCalculationResultIsShowedOnThePage(String ibanNo) throws InterruptedException {

        Thread.sleep(4000);
        ZiraatCalculationToolIbanCalculationPage myZiraatCalculationToolIbanCalculationPage = new ZiraatCalculationToolIbanCalculationPage(driver);
        Assert.assertEquals(ibanNo,myZiraatCalculationToolIbanCalculationPage.ibanNo(driver));
    }



}
