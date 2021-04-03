package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultItemPage extends BasePage {

//    private WebDriver driver;

    @FindBy(id = "newBuyBoxPrice")
    private WebElement newItemPrice;

    public SearchResultItemPage(WebDriver driver) {
        super(driver);
//        this.driver = driver;
    }

    public boolean isAtSearchResultItemPage() {
        return driver.getCurrentUrl().contains("/dp/");
    }

    public String getPriceOfNewItem() {
        return newItemPrice.getText();
    }
}
