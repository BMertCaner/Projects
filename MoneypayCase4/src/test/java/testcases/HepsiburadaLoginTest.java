package testcases;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class HepsiburadaLoginTest extends MainPage {

    @Then("I verify that login page is presented on the page")
    public void iVerifyThatLoginPageIsPresentedOnThePage() throws InterruptedException {

        Thread.sleep(5000);
        HepsiburadaLoginPage myHepsiburadaLoginPage = new HepsiburadaLoginPage(driver);
        Assert.assertEquals("Sosyal hesap ile giriş yap", myHepsiburadaLoginPage.loginScreen);

    }

    @When("^I use \"([^\"]*)\" to login page$")
    public void iUseUsernameToLoginPage(String arg0) throws InterruptedException {

        Thread.sleep(5000);
        HepsiburadaLoginPage myHepsiburadaLoginPage = new HepsiburadaLoginPage(driver);
        MainPage.sendKey(myHepsiburadaLoginPage.getUsername(driver),arg0);
        MainPage.clickButton(myHepsiburadaLoginPage.getLoginButtonFirst(driver));
        Thread.sleep(5000);

    }

    @When("^I use \"([^\"]*)\" to login pass page$")
    public void iUseAndToLoginPassPage(String arg1) throws InterruptedException {

        Thread.sleep(5000);
        HepsiburadaLoginPage myHepsiburadaLoginPage = new HepsiburadaLoginPage(driver);
        MainPage.sendKey(myHepsiburadaLoginPage.getPassword(driver),arg1);
        MainPage.clickButton(myHepsiburadaLoginPage.getLoginButtonSecond(driver));
        Thread.sleep(5000);

    }

}



