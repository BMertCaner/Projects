package testcases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class HepsiburadaSolutionCenterTest extends MainPage {

    @When("I click solution center button")
    public void iClickSolutionCenterButton() throws InterruptedException {

        Thread.sleep(4000);
        HepsiburadaHomePage myHepsiburadaHomePage = new HepsiburadaHomePage(driver);
        MainPage.clickButton(myHepsiburadaHomePage.solutionCenter);
    }

    @Then("I verify that solution center is presented on the page")
    public void iVerifyThatSolutionCenterIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(10000);
        HepsiburadaSolutionCenterPage myHepsiburadaSolutionCenterPage = new HepsiburadaSolutionCenterPage(driver);
        Assert.assertEquals("Merak edilenler", myHepsiburadaSolutionCenterPage.solutionCenter);
    }

    @When("I click that product info on the page")
    public void iClickThatProductInfoOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        HepsiburadaSolutionCenterPage myHepsiburadaSolutionCenterPage = new HepsiburadaSolutionCenterPage(driver);
        MainPage.clickButton(myHepsiburadaSolutionCenterPage.productInfo);
    }

    @When("I click that is it original on the page")
    public void iClickThatIsItOriginalOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        HepsiburadaSolutionCenterProductInfoPage myHepsiburadaSolutionCenterProductInfoPage = new HepsiburadaSolutionCenterProductInfoPage(driver);
        MainPage.clickButton(myHepsiburadaSolutionCenterProductInfoPage.isProductOriginal);
    }

    @When("I click that call me now on the page")
    public void iClickThatCallMeNowOnThePage() throws InterruptedException {

        Thread.sleep(4000);
        HepsiburadaSolutionCenterProductInfoPage myHepsiburadaSolutionCenterProductInfoPage = new HepsiburadaSolutionCenterProductInfoPage(driver);
        MainPage.clickButton(myHepsiburadaSolutionCenterProductInfoPage.getCallMeNow(driver));
    }

}
