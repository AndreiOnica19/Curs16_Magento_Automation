package pages;
import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(xpath = "(//input[@id='pass'])[1]")
    WebElement passwordField;

    @FindBy(xpath = "(//button[@id='send2'])[1]")
    WebElement signInButton;

    @FindBy(css = "#email-error")
    WebElement missingEmailAddressError;

    @FindBy(xpath = "//div[@class='message-error error message']")
    WebElement accountError;

    @FindBy(css = ".message-error.error.message")
    WebElement errorMessage;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        emailField.sendKeys(Constants.EMAIL);
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void inputShortPassword() {
        passwordField.sendKeys("abc");
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getEmailError() {
        return missingEmailAddressError.getText();
    }

    public String getAccountError() {
        return accountError.getText();
    }

    public String getErrorMessageColour() {
        return errorMessage.getCssValue("color");
    }
}
