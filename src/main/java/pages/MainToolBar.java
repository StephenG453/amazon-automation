package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainToolBar extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement textBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public MainToolBar(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputTextIntoTextBox(String text) {
        textBox.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
