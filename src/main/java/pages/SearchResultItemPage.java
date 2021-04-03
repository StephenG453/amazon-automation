package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultItemPage extends BasePage {

    @FindBy(id = "newBuyBoxPrice")
    private WebElement newItemPrice;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public SearchResultItemPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAtSearchResultItemPage() {
        return driver.getCurrentUrl().contains("/dp/");
    }

    public String getPriceOfNewItem() {
        return newItemPrice.getText();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}
