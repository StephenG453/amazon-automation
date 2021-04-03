package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MainToolBar;

public class MainToolBarStepDefinitions {

    private MainToolBar mainToolBar;

    private Injector injector;

    private WebDriver driver;

    public MainToolBarStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @When("user inputs {string} into the search bar")
    public void inputTextIntoSearchBar(String text) {
        driver = injector.getDriver();

        mainToolBar = new MainToolBar(driver);
        mainToolBar.inputTextIntoTextBox(text);
    }

    @And("user clicks the search button")
    public void clickSearchButton() {
        mainToolBar.clickSearchButton();
    }

}
