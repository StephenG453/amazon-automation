package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]" +
            "/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]")
    private WebElement firstItem;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isAtResultsPage() {
        return driver.getCurrentUrl().contains("s?k");
    }

    public void clickFirstItem() {
        firstItem.click();
    }
}
