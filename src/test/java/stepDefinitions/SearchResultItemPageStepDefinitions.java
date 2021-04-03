package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.SearchResultItemPage;

public class SearchResultItemPageStepDefinitions extends BaseTest {

    private SearchResultItemPage searchResultItemPage;

    private Injector injector;

    private WebDriver driver;

    public SearchResultItemPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @And("user is at search results item page")
    public void isAtSearchResultsPage() {
        driver = injector.getDriver();
        searchResultItemPage = new SearchResultItemPage(driver);

        Assertions.assertTrue(searchResultItemPage.isAtSearchResultItemPage());
    }

    @And("user validates price of a new item")
    public void validatePriceOfNewItem() {
        Assertions.assertEquals("$47.49", searchResultItemPage.getPriceOfNewItem());
    }

    @And("user clicks add to cart button")
    public void clickAddToCartButton() {
        searchResultItemPage.clickAddToCartButton();
    }
}
