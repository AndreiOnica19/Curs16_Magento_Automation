package pages;

import data.Data;
import utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    }

    public void inputFirstName() {
        Wait.waitUntilElementIsVisible(firstNameField, driver);
        firstNameField.sendKeys(Data.FIRST_NAME.getValue());
    }

    public void inputLastName() {
        lastNameField.sendKeys(Data.LAST_NAME.getValue());
    }

    public void inputCompany() {
        companyField.sendKeys(Data.COMPANY.getValue());
    }

    public void inputAddress() {
        addressField.sendKeys(Data.ADDRESS.getValue());
    }

    public void inputCity() {
        Wait.waitUntilElementIsVisible(cityField, driver);
        cityField.sendKeys(Data.CITY.getValue());
    }

    public void inputCountry() {
        Wait.waitUntilElementIsVisible(countryField, driver);
        countryField.sendKeys(Data.COUNTRY.getValue());
    }

    public void inputState() {
        Wait.waitUntilElementIsVisible(stateField, driver);
        stateField.sendKeys(Data.STATE.getValue());
    }

    public void inputPostCode() {
        Wait.waitUntilElementIsVisible(postCodeField, driver);
        postCodeField.sendKeys(Data.POSTCODE.getValue());
    }

    public void inputPhone() {
        Wait.waitUntilElementIsVisible(phoneField, driver);
        phoneField.sendKeys(Data.PHONE.getValue());
    }

    public void clickNextButton() {
        Wait.waitUntilElementIsVisible(nextButton, driver);
        nextButton.click();
    }

    public void clickPlaceOrderButton() {
        Wait.waitUntilElementIsVisible(placeOrderButton, driver);
        placeOrderButton.click();
    }
}
