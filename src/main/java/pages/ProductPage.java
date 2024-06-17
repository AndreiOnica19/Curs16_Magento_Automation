package pages;
import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Jackets')])")
    WebElement jacketsLink;

    @FindBy(xpath = "(//a[@class='product-item-link'])[3]")
    WebElement jupiterAllWeatherTrainer;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    WebElement sizeLSelect;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
    WebElement colourBlue;

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityField;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @FindBy(xpath = "(//a[@class='product-item-link'])[8]")
    WebElement impulseDuffle;

    @FindBy(xpath = "(//a[@class='product-item-link'])[12]")
    WebElement gabrielleMicroSleeveTop;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-53']")
    WebElement colourGreen;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickJacketsLink() {
        jacketsLink.click();
    }

    public void selectJupiterAllWeatherTrainer() {
        jupiterAllWeatherTrainer.click();
    }

    public void selectSizeL() {
        sizeLSelect.click();
    }

    public void selectBlueColour() {
        colourBlue.click();
    }

    public void clickQuantityField() {
        quantityField.click();
    }

    public void clearQuantityField() {
        quantityField.clear();
    }

    public void inputQuantity() {
        quantityField.sendKeys(Constants.generateQuantity());
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void selectImpulseDuffle() {
        impulseDuffle.click();
    }

    public void selectGabrielleMicroSleeveTop() {
        gabrielleMicroSleeveTop.click();
    }

    public void selectColourGreen() {
        colourGreen.click();
    }

}
