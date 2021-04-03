package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ShoppingCartSuggestionsPage;

public class ShoppingCartSuggestionsStepDefinitions {

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

        Assert.assertTrue(shoppingCartSuggestionsPage.isAtShoppingCartSuggestionsPage());
    }

    @And("user validates cart subtotal is {string}")
    public void validatePriceOfNewItem(String text) {
        Assert.assertEquals(text, shoppingCartSuggestionsPage.getCartSubTotal());
    }

    @And("user clicks proceed to checkout button")
    public void clickProceedToCheckoutButton() {
        shoppingCartSuggestionsPage.clickProceedToCheckoutButton();
    }
}
