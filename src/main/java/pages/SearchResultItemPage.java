package pages;

import org.openqa.selenium.WebDriver;

public class SearchResultItemPage extends BasePage {

    private WebDriver driver;

    public SearchResultItemPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isAtSearchResultItemPage() {
        return driver.getCurrentUrl().contains("/dp/");
    }
}
