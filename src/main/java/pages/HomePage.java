package pages;

import lombok.extern.log4j.Log4j2;
import utils.Scroll;
import utils.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class HomePage extends BasePage {

    @FindBy(xpath = "(//span[contains (text(), 'Men')])[1]")
    private WebElement menCategoryButton;

    @FindBy(xpath = "(//a[contains(text(),'Bags')])")
    private WebElement bagsCategoryButton;

    @FindBy(xpath = "(//a[contains(text(),'Tees')])")
    private WebElement teesCategoryButton;

    @FindBy(css = ".panel.wrapper")
    private WebElement panelWrapper;

    @FindBy(xpath = "//small[@class='copyright']")
    private WebElement footer;

    @FindBy(css = ".message.global.demo")
    private WebElement contentBar;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    private WebElement signInLink;

    @FindBy(xpath = "//h2[contains(text(), 'Hot Sellers')]")
    private WebElement hotSellersTitle;

    @FindBy(xpath = "(//span[@class='product-image-wrapper'])[6]")
    private WebElement backpackPhoto;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenCategoryButton() {
        menCategoryButton.click();
        Wait.waitUntilElementIsVisible(panelWrapper, driver);
        log.info("Clicked men category button");
    }

    public void clickBagsCategoryButton() {
        bagsCategoryButton.click();
        log.info("Clicked bags category button");
    }

    public void clickTeesCategoryButton() {
        teesCategoryButton.click();
        log.info("Clicked tees category button");
    }

    public String findPanelWrapperColour() {
        Wait.waitUntilElementIsVisible(panelWrapper, driver);
        log.info("Found panel wrapper colour");
        return panelWrapper.getCssValue("background-color");
    }

    public String findFooterColour() {
        Wait.waitUntilElementIsVisible(footer, driver);
        Scroll.scrollDown(driver, 2500);
        Wait.waitInSeconds(1);
        Scroll.scrollUp(driver, 2500);
        log.info("Found footer colour");
        return footer.getCssValue("background-color");
    }

    public boolean findHotSellersTitle() {
        Scroll.scrollToElementUsingJs(hotSellersTitle, driver);
        log.info("Found hot-seller title");
        return hotSellersTitle.isDisplayed();
    }

    public boolean findBackPackPhoto() {
        Scroll.scrollToElementUsingJs(backpackPhoto, driver);
        log.info("Found backpack photo");
        return backpackPhoto.isDisplayed();
    }

    public String findContentBarColour() {
        log.info("Found content bar colour");
        return contentBar.getCssValue("background");
    }

    public void clickSignInLink() {
        signInLink.click();
        log.info("Clicked sign in button");
    }
}