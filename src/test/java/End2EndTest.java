import data.Wait;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;

public class End2EndTest extends BaseTest {

    @Test
    public void makeOrderTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenCategoryButton();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickJacketsLink();
        productPage.selectJupiterAllWeatherTrainer();
        Wait.waitInSeconds(2);
        productPage.selectSizeL();
        productPage.selectBlueColour();
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(2);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickGearLink();
        homePage.clickBagsCategoryButton();
        productPage.selectImpulseDuffle();
        Wait.waitInSeconds(2);
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(2);
        headerPage.clickWomenLink();
        homePage.clickTeesCategoryButton();
        productPage.selectGabrielleMicroSleeveTop();
        Wait.waitInSeconds(2);
        productPage.selectSizeL();
        productPage.selectColourGreen();
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        Wait.waitInSeconds(5);
        headerPage.clickCartButton();
        headerPage.clickProceedToCheckOutButton();
        Wait.waitInSeconds(4);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.inputEmail();
        Wait.waitInSeconds(2);
        checkOutPage.inputFirstName();
        checkOutPage.inputLastName();
        checkOutPage.inputCompany();
        checkOutPage.inputAddress();
        Wait.waitInSeconds(2);
        checkOutPage.inputCity();
        Wait.waitInSeconds(3);
        checkOutPage.inputCountry();
        Wait.waitInSeconds(2);
        checkOutPage.inputState();
        Wait.waitInSeconds(2);
        checkOutPage.inputPostCode();
        Wait.waitInSeconds(2);
        checkOutPage.inputPhone();
        Wait.waitInSeconds(2);
        checkOutPage.clickNextButton();
        Wait.waitInSeconds(7);
        checkOutPage.clickPlaceOrderButton();
    }
}
