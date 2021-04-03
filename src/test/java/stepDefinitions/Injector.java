package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class Injector {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}