import data.Colours;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ColourTest extends BaseTest {
    @Test
    public void verifyPanelWrapperReturnsGreyTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findPanelWrapperColour();
        Assert.assertEquals(actualColour, Colours.GREY_COLOUR.getValue());
    }

    @Test
    public void verifyFooterColourReturnsGreyTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findFooterColour();
        Assert.assertEquals(actualColour, Colours.GREY_COLOUR.getValue());
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
    }
}