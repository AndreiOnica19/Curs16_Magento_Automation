package pages;
import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@title='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    private WebElement confirmationPasswordField;

    @FindBy(xpath = "//button[@class='action submit primary']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//div[@class='message-success success message']")
    private WebElement successMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstNameField.sendKeys(Data.FIRST_NAME.getValue());
    }

    public void inputLastName() {
        lastNameField.sendKeys(Data.LAST_NAME.getValue());
    }

    public void inputEmail() {
        emailField.sendKeys(Data.EMAIL.getValue());
    }

    public void inputPassword() {
        passwordField.sendKeys(Data.PASSWORD.getValue());
    }

    public void inputConfirmationPassword() {
        confirmationPasswordField.sendKeys(Data.PASSWORD.getValue());
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
