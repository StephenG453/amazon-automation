package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class HomePageStepDefinitions extends BaseTest {

    protected WebDriver driver;

    private BaseTest baseTest;

    private HomePage homePage;

    @Given("user loads amazon home page")
    public void loadHomePage() throws InterruptedException {
        baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        homePage = new HomePage(driver);

        Thread.sleep(5000);
    }
}
