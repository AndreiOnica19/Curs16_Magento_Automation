package pages;
import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@title='Email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmationPasswordField;

    @FindBy(xpath = "//button[@class='action submit primary']")
    WebElement createAccountButton;

    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement successMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstNameField.sendKeys(Constants.FIRST_NAME);
    }

    public void inputLastName() {
        lastNameField.sendKeys(Constants.LAST_NAME);
    }

    public void inputEmail() {
        emailField.sendKeys(Constants.EMAIL);
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void inputConfirmationPassword() {
        confirmationPasswordField.sendKeys(Constants.PASSWORD);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
