package stepDefinitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SignInPageStepDefinitions {

    protected WebDriver driver;

    private BaseTest baseTest;

    private Injector injector;

    public SignInPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Then("sign in page is displayed")
    public void signInPageIsDisplayed() {
        driver = injector.driver;
        baseTest = new BaseTest();
        baseTest.setDriver(driver);
        baseTest.cleanUp();
    }
}
