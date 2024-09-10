package tests;

import data.Colours;

import lombok.extern.log4j.Log4j2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import test.utils.Retry;

@Log4j2
public class ColourTest extends TestBase {

    @Test
    public void verifyPanelWrapperReturnsGreyTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findPanelWrapperColour();
        Assert.assertEquals(actualColour, Colours.GREY_COLOUR.getValue());
    }

    @Test(retryAnalyzer = Retry.class)
    public void verifyFooterColourReturnsGreyTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findFooterColour();
        Assert.assertEquals(actualColour, Colours.ORANGE_COLOUR.getValue());
    }

    @Test
    public void verifyContentBarReturnsOrangeTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findContentBarColour();
        Assert.assertEquals(actualColour, Colours.ORANGE_COLOUR.getValue());
    }

    @Test
    public void findHotSellersElement() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.findHotSellersTitle());
    }

    @Test
    public void findBackPackElement() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.findBackPackPhoto());
        log.info("The backpack image was found.");
        driver.quit();
    }
}