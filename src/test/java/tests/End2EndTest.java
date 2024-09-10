package tests;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;

public class End2EndTest extends TestBase {

    @Test
    public void makeOrderTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenCategoryButton();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickJacketsLink();
        productPage.selectJupiterAllWeatherTrainer();
        productPage.selectSizeL();
        productPage.selectBlueColour();
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickGearLink();
        homePage.clickBagsCategoryButton();
        productPage.selectImpulseDuffle();
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        headerPage.clickWomenLink();
        homePage.clickTeesCategoryButton();
        productPage.selectGabrielleMicroSleeveTop();
        productPage.selectSizeL();
        productPage.selectColourGreen();
        productPage.clickQuantityField();
        productPage.clearQuantityField();
        productPage.inputQuantity();
        productPage.clickAddToCartButton();
        headerPage.clickCartButton();
        headerPage.clickProceedToCheckOutButton();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.inputEmail();
        checkOutPage.inputFirstName();
        checkOutPage.inputLastName();
        checkOutPage.inputCompany();
        checkOutPage.inputAddress();
        checkOutPage.inputCity();
        checkOutPage.inputCountry();
        checkOutPage.inputState();
        checkOutPage.inputPostCode();
        checkOutPage.inputPhone();
        checkOutPage.clickNextButton();
        checkOutPage.clickPlaceOrderButton();
        driver.quit();
    }
}