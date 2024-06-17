package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    WebElement createAccountLink;

    @FindBy(xpath = "(//span[contains (text(), 'Gear')])")
    WebElement gearLink;

    @FindBy(xpath = "(//span[contains (text(), 'Women')])[1]")
    WebElement womenLink;

    @FindBy(css = ".action.showcart")
    WebElement cartButton;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement proceedToCheckOutButton;


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
    }


}
