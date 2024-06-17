package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//span[contains (text(), 'Men')])[1]")
    WebElement menCategoryButton;

    @FindBy(xpath = "(//a[contains(text(),'Bags')])")
    WebElement bagsCategoryButton;

    @FindBy(xpath = "(//a[contains(text(),'Tees')])")
    WebElement teesCategoryButton;

    @FindBy(css = ".panel.wrapper")
    WebElement panelWrapper;

    @FindBy(xpath = "//small[@class='copyright']")
    WebElement footer;

    @FindBy(xpath = "//div[@class='message global demo']")
    WebElement contentBar;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement signInLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenCategoryButton() {
        menCategoryButton.click();
    }

    public void clickBagsCategoryButton() {
        bagsCategoryButton.click();
    }

    public void clickTeesCategoryButton() {
        teesCategoryButton.click();
    }

    public String findPanelWrapperColour() {
        return panelWrapper.getCssValue("background-color");
    }

    public String findFooterColour() {
        return footer.getCssValue("background-color");
    }

    public String findContentBarColour() {
        return contentBar.getCssValue("background");
    }

    public void clickSignInLink() {
        signInLink.click();
    }

}
