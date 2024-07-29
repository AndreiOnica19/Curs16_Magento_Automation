package pages;
import utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    private WebElement createAccountLink;

    @FindBy(xpath = "(//span[contains (text(), 'Gear')])")
    private WebElement gearLink;

    @FindBy(xpath = "(//span[contains (text(), 'Women')])[1]")
    private WebElement womenLink;

    @FindBy(css = ".action.showcart")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//span[contains(text(), 'Order Summary')]")
    private WebElement orderSummaryText;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccountLink() {
        createAccountLink.click();
    }

    public void clickGearLink() {
        gearLink.click();
    }

    public void clickWomenLink() {
        womenLink.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickProceedToCheckOutButton() {
        proceedToCheckOutButton.click();
        Wait.waitUntilElementIsVisible(orderSummaryText, driver);
    }
}