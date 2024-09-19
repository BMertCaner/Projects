package pages;

//import io.cucumber.java.BeforeAll;
import base.MainFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import runner.TestRunner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
//import cucumber.annotation;
//import cucumber.annotation.Before;
//import cucumber.api.java.After;

public class MainPage {

    public static WebDriver driver  = null;

    public static WebDriver openBrowser(String browserName) throws IOException {

        if(browserName.equalsIgnoreCase("chrome")){

            /*
            ChromeOptions chromeOptions = new ChromeOptions();
            Capabilities capabilities = DesiredCapabilities.chrome();
            Map<String,Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("profile.default_content_setting_values.cookies", 2);
            prefs.put("network.cookie.cookieBehavior", 2);
            prefs.put("profile.block_third_party_cookies", true);
            chromeOptions.setExperimentalOption("prefs", prefs);
            chromeOptions.addArguments("--kiosk");
            chromeOptions.addArguments("--disable--notifications");
            System.setProperty("webdriver.chrome.driver", "src//driver//chromedriver.exe");
            chromeOptions.merge(capabilities);
            driver = new ChromeDriver(chromeOptions);
            */

            driver = createChromeDriver();

            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mert\\Desktop\\driver\\chromedriver.exe");
            //driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")){

            driver = createFirefoxDriver();

            //System.setProperty("webdriver.gecko.driver", "C:\\Users\\mert\\Desktop\\driver\\geckodriver.exe");
            //System.setProperty("webdriver.gecko.driver", "src//driver//geckodriver.exe");
            //driver = new FirefoxDriver();

        }

        return driver;
    }

    public static WebDriver createChromeDriver() throws IOException {
        ClassLoader classLoader = MainPage.class.getClassLoader();
        URL resource = classLoader.getResource("chromedriver.exe");
        File f = new File("drivers");
        if (!f.exists()) {
            f.mkdirs();
        }
        File chromeDriver = new File("drivers" + File.separator + "chromedriver.exe");
        if (!chromeDriver.exists()) {
            chromeDriver.createNewFile();
            org.apache.commons.io.FileUtils.copyURLToFile(resource, chromeDriver);
        }

        String a = chromeDriver.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        driver = new ChromeDriver();
        return driver;

    }

    public static WebDriver createFirefoxDriver() throws IOException {
        ClassLoader classLoader = MainPage.class.getClassLoader();
        URL resource = classLoader.getResource("geckodriver.exe");
        File f = new File("drivers");
        if (!f.exists()) {
            f.mkdirs();
        }
        File geckoDriver = new File("drivers" + File.separator + "geckodriver.exe");
        if (!geckoDriver.exists()) {
            geckoDriver.createNewFile();
            org.apache.commons.io.FileUtils.copyURLToFile(resource, geckoDriver);
        }

        String a = geckoDriver.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", geckoDriver.getAbsolutePath());
        driver = new FirefoxDriver();
        return driver;

    }
    public static void closeBrowser(WebDriver driver) {driver.close();}
    public static void MaximizeScreen(WebDriver driver){
        driver.manage().window().maximize();
    }

    public static void clickButton(WebElement element) {
        element.click();
    }

    public static void clearText(WebElement element) {
        element.clear();
    }


    public static void moveToElement(WebDriver driver,WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }

    public static void sendKey(WebElement element,String key){
        element.sendKeys(key);
    }

    public static void sendKeyboard(WebElement element,Keys key){
        //element.sendKeys(Keys.ENTER);
        element.sendKeys(key);
    }

}
