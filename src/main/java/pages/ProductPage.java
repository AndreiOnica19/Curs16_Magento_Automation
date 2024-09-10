package pages;

import data.Data;

import lombok.extern.log4j.Log4j2;

import utils.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class ProductPage extends BasePage {

    @FindBy(xpath = "(//a[contains(text(),'Jackets')])")
    private WebElement jacketsLink;

    @FindBy(xpath = "(//a[@class='product-item-link'])[3]")
    private WebElement jupiterAllWeatherTrainer;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    private WebElement sizeLSelect;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
    private WebElement colourBlue;

    @FindBy(xpath = "//input[@id='qty']")
    private WebElement quantityField;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[@class='product-item-link'])[8]")
    private WebElement impulseDuffle;

    @FindBy(xpath = "(//a[@class='product-item-link'])[12]")
    private WebElement gabrielleMicroSleeveTop;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-53']")
    private WebElement colourGreen;

    @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[2]")
    private WebElement colourOptions;

    @FindBy(xpath = "//div[@class='message-success success message']")
    private WebElement successMessage;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickJacketsLink() {
        jacketsLink.click();
        log.info("Jackets link clicked");
    }

    public void selectJupiterAllWeatherTrainer() {
        Wait.waitUntilElementIsVisible(colourOptions, driver);
        jupiterAllWeatherTrainer.click();
        log.info("Jupiter all weather trainer clicked");
    }

    public void selectSizeL() {
        Wait.waitUntilElementIsVisible(sizeLSelect, driver);
        sizeLSelect.click();
        log.info("Size L clicked");
    }

    public void selectBlueColour() {
        colourBlue.click();
        log.info("Blue colour clicked");
    }

    public void clickQuantityField() {
        quantityField.click();
        log.info("Quantity field clicked");
    }

    public void clearQuantityField() {
        quantityField.clear();
        log.info("Quantity field cleared");
    }

    public void inputQuantity() {
        quantityField.sendKeys(Data.generateQuantity());
        log.info("Quantity field sent");
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
        Wait.waitUntilElementIsVisible(successMessage, driver);
        log.info("Add to cart button clicked");
    }

    public void selectImpulseDuffle() {
        impulseDuffle.click();
        log.info("Impulse duffle clicked");
    }

    public void selectGabrielleMicroSleeveTop() {
        gabrielleMicroSleeveTop.click();
        Wait.waitUntilElementIsVisible(colourOptions, driver);
        log.info("Gabrielle microSleeveTop clicked");
    }

    public void selectColourGreen() {
        colourGreen.click();
        log.info("Colour green clicked");
    }
}