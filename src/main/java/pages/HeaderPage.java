package pages;
import lombok.extern.log4j.Log4j2;

import utils.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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
        log.info("Clicked Create Account Link");
    }

    public void clickGearLink() {
        gearLink.click();
        log.info("Clicked Gear Link");
    }

    public void clickWomenLink() {
        womenLink.click();
        log.info("Clicked Women Link");
    }

    public void clickCartButton() {
        cartButton.click();
        log.info("Clicked Cart Button");
    }

    public void clickProceedToCheckOutButton() {
        proceedToCheckOutButton.click();
        Wait.waitUntilElementIsVisible(orderSummaryText, driver);
        log.info("Clicked Proceed To Check Out Button");
    }
}