package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MainToolBar;

public class MainToolBarStepDefinitions extends BaseTest {

    private MainToolBar mainToolBar;

//    private BaseTest baseTest;

    private Injector injector;

    private WebDriver driver;

    public MainToolBarStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @When("user inputs text into the search bar")
    public void inputTextIntoSearchBar() {
        driver = injector.getDriver();

        mainToolBar = new MainToolBar(driver);
        mainToolBar.inputTextIntoTextBox("qa testing for beginners");
    }

    @And("user clicks the search button")
    public void clickSearchButton() {
        mainToolBar.clickSearchButton();
    }
}
