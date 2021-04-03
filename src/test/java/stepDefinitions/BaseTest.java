package stepDefinitions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;

    public void initialize() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void cleanUp() {
        driver.close();
        driver.quit();
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
