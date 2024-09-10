package pages;

import data.Data;

import lombok.extern.log4j.Log4j2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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
        log.info("Email entered");
    }

    public void inputPassword() {
        passwordField.sendKeys(Data.PASSWORD.getValue());
        log.info("Password entered");
    }

    public void inputShortPassword() {
        passwordField.sendKeys("abc");
        log.info("Dummy password entered");
    }

    public void clickSignInButton() {
        signInButton.click();
        log.info("Sign in button clicked");
    }

    public String getEmailError() {
        log.info("Email Error");
        return missingEmailAddressError.getText();
    }

    public String getAccountError() {
        log.info("Account Error");
        return accountError.getText();
    }

    public String getErrorMessageColour() {
        log.info("Color Error Message");
        return errorMessage.getCssValue("color");
    }
}