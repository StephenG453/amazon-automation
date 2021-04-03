package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.SearchResultsPage;

public class SearchResultsPageStepDefinitions extends BaseTest {

    private SearchResultsPage searchResultsPage;

    private Injector injector;

    private WebDriver driver;

    public SearchResultsPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @And("user is at search results page")
    public void isAtSearchResultsPage() {
        driver = injector.getDriver();
        searchResultsPage = new SearchResultsPage(driver);

        Assertions.assertTrue(searchResultsPage.isAtResultsPage());
    }
}
