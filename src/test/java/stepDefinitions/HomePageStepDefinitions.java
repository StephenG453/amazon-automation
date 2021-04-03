package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageStepDefinitions extends BaseTest {

    protected WebDriver driver;

    private Injector injector;

    private BaseTest baseTest;

    private HomePage homePage;

    public HomePageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Given("user loads amazon home page")
    public void loadHomePage() {
        baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        injector.setDriver(driver);
        homePage = new HomePage(driver);
    }
}
