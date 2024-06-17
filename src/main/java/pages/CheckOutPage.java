package pages;
import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    @FindBy(xpath = "(//input[@id='customer-email'])[1]")
    WebElement emailField;

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name='company']")
    WebElement companyField;

    @FindBy(xpath = "//input[@name='street[0]']")
    WebElement addressField;

    @FindBy(xpath = "//input[@name='city']")
    WebElement cityField;

    @FindBy(xpath = "(//select[@class='select'])[2]")
    WebElement countryField;

    @FindBy(xpath = "//select[@name='region_id']")
    WebElement stateField;

    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    WebElement postCodeField;

    @FindBy(xpath = "(//input[@class='input-text'])[13]")
    WebElement phoneField;

    @FindBy(xpath = "//button[@data-role='opc-continue']")
    WebElement nextButton;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    WebElement placeOrderButton;


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        emailField.sendKeys(Constants.EMAIL);
    }

    public void inputFirstName() {
        firstNameField.sendKeys(Constants.FIRST_NAME);
    }

    public void inputLastName() {
        lastNameField.sendKeys(Constants.LAST_NAME);
    }

    public void inputCompany() {
        companyField.sendKeys(Constants.COMPANY);
    }

    public void inputAddress() {
        addressField.sendKeys(Constants.ADDRESS);
    }

    public void inputCity() {
        cityField.sendKeys(Constants.CITY);
    }

    public void inputCountry() {
        countryField.sendKeys(Constants.COUNTRY);
    }

    public void inputState() {
        stateField.sendKeys(Constants.STATE);
    }

    public void inputPostCode() {
        postCodeField.sendKeys(Constants.POSTCODE);
    }

    public void inputPhone() {
        phoneField.sendKeys(Constants.PHONE);
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void clickPlaceOrderButton() {
        placeOrderButton.click();
    }
}
