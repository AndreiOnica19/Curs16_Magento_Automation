package pages;

import data.Data;

import lombok.extern.log4j.Log4j2;

import utils.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CheckOutPage extends BasePage {

    @FindBy(xpath = "(//input[@id='customer-email'])[1]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='company']")
    private WebElement companyField;

    @FindBy(xpath = "//input[@name='street[0]']")
    private WebElement addressField;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityField;

    @FindBy(xpath = "(//select[@class='select'])[2]")
    private WebElement countryField;

    @FindBy(xpath = "//select[@name='region_id']")
    private WebElement stateField;

    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    private WebElement postCodeField;

    @FindBy(xpath = "(//input[@class='input-text'])[13]")
    private WebElement phoneField;

    @FindBy(xpath = "//button[@data-role='opc-continue']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    private WebElement placeOrderButton;


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        Wait.waitUntilElementIsVisible(emailField, driver);
        emailField.sendKeys(Data.EMAIL.getValue());
        log.info("Email entered");
    }

    public void inputFirstName() {
        Wait.waitUntilElementIsVisible(firstNameField, driver);
        firstNameField.sendKeys(Data.FIRST_NAME.getValue());
        log.info("First name entered");
    }

    public void inputLastName() {
        lastNameField.sendKeys(Data.LAST_NAME.getValue());
        log.info("Last name entered");
    }

    public void inputCompany() {
        companyField.sendKeys(Data.COMPANY.getValue());
        log.info("Company entered");
    }

    public void inputAddress() {
        addressField.sendKeys(Data.ADDRESS.getValue());
        log.info("Address entered");
    }

    public void inputCity() {
        Wait.waitUntilElementIsVisible(cityField, driver);
        cityField.sendKeys(Data.CITY.getValue());
        log.info("City entered");
    }

    public void inputCountry() {
        Wait.waitUntilElementIsVisible(countryField, driver);
        countryField.sendKeys(Data.COUNTRY.getValue());
        log.info("Country entered");
    }

    public void inputState() {
        Wait.waitUntilElementIsVisible(stateField, driver);
        stateField.sendKeys(Data.STATE.getValue());
        log.info("State entered");
    }

    public void inputPostCode() {
        Wait.waitUntilElementIsVisible(postCodeField, driver);
        postCodeField.sendKeys(Data.POSTCODE.getValue());
        log.info("Postcode entered");
    }

    public void inputPhone() {
        Wait.waitUntilElementIsVisible(phoneField, driver);
        phoneField.sendKeys(Data.PHONE.getValue());
        log.info("Phone entered");
    }

    public void clickNextButton() {
        Wait.waitInSeconds(4);
        try {
            nextButton.click();
            log.info("The NextButton was clicked.");
        } catch (Exception e) {
            log.error("The NextButton is not clicked.");
        }
    }

    public void clickPlaceOrderButton() {
        Wait.waitUntilElementIsVisible(placeOrderButton, driver);
        Wait.waitInSeconds(2);
        placeOrderButton.click();
        log.info("The PlaceOrderButton was clicked.");
    }
}