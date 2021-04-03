package pages;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isAtResultsPage() {
        return driver.getCurrentUrl().contains("s?k");
    }
}
