package pages;
import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(xpath = "(//input[@id='pass'])[1]")
    private WebElement passwordField;

    @FindBy(xpath = "(//button[@id='send2'])[1]")
    private WebElement signInButton;

    @FindBy(css = "#email-error")
    private WebElement missingEmailAddressError;

    @FindBy(xpath = "//div[@class='message-error error message']")
    private WebElement accountError;

    @FindBy(css = ".message-error.error.message")
    private WebElement errorMessage;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        emailField.sendKeys(Data.EMAIL.getValue());
    }

    public void inputPassword() {
        passwordField.sendKeys(Data.PASSWORD.getValue());
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
