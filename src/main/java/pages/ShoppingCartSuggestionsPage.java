package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSuggestionsPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='cart-page-wrap']/div[@id='huc-page-container']" +
            "/div[@id='huc-v2-order-row-with-divider']/div[@id='huc-v2-order-row-container']/div[1]/div[1]/div[3]/" +
            "div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]")
    private WebElement cartSubTotal;

    @FindBy(id = "hlb-ptc-btn-native")
    private WebElement proceedToCheckoutButton;

    public ShoppingCartSuggestionsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAtShoppingCartSuggestionsPage() {
        return driver.getCurrentUrl().contains("/gp/huc/");
    }

    public String getCartSubTotal() {
        return cartSubTotal.getText();
    }

    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }
}
