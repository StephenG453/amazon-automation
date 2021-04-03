package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.SearchResultsPage;
import pages.ShoppingCartSuggestionsPage;

public class ShoppingCartSuggestionsStepDefinitions extends BaseTest {

    private ShoppingCartSuggestionsPage shoppingCartSuggestionsPage;

    private Injector injector;

    private WebDriver driver;

    public ShoppingCartSuggestionsStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @And("user is at shopping cart suggestions page")
    public void isAtShoppingCartSuggestionsPage() {
        driver = injector.getDriver();
        shoppingCartSuggestionsPage = new ShoppingCartSuggestionsPage(driver);

        Assertions.assertTrue(shoppingCartSuggestionsPage.isAtShoppingCartSuggestionsPage());
    }
}
