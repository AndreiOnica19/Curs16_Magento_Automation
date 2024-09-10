package pages;

import data.Data;

import lombok.extern.log4j.Log4j2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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
        log.info("First name entered");
    }

    public void inputLastName() {
        lastNameField.sendKeys(Data.LAST_NAME.getValue());
        log.info("Last name entered");
    }

    public void inputEmail() {
        emailField.sendKeys(Data.EMAIL.getValue());
        log.info("Email entered");
    }

    public void inputPassword() {
        passwordField.sendKeys(Data.PASSWORD.getValue());
        log.info("Password entered");
    }

    public void inputConfirmationPassword() {
        confirmationPasswordField.sendKeys(Data.PASSWORD.getValue());
        log.info("Confirmation password entered");
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
        log.info("Create account button clicked");
    }

    public String getSuccessMessage() {
        log.info("Get success message");
        return successMessage.getText();
    }
}