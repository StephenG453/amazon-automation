package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.MainToolBar;

public class MainToolBarStepDefinitions extends BaseTest {

    private MainToolBar mainToolBar;

    private BaseTest baseTest;

    @When("user inputs text into the search bar")
    public void inputTextIntoSearchBar() {
        driver = baseTest.driver;
        mainToolBar.inputTextIntoTextBox("qa testing for beginners");
    }

    @And("user clicks the search button")
    public void clickSearchButton() {
        mainToolBar.clickSearchButton();
    }
}
