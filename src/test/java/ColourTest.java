import data.Constants;
import data.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ColourTest extends BaseTest {
    @Test
    public void verifyPanelWrapperReturnsGreyTest() {
        Wait.waitInSeconds(3);
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findPanelWrapperColour();
        Assert.assertEquals(actualColour, Constants.GREY_COLOUR);
    }

    @Test
    public void verifyFooterColourReturnsGreyTest() {
        Wait.waitInSeconds(3);
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findFooterColour();
        Assert.assertEquals(actualColour, Constants.GREY_COLOUR);
    }

    @Test
    public void verifyContentBarReturnsOrangeTest() {
        Wait.waitInSeconds(3);
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.findContentBarColour();
        Assert.assertEquals(actualColour, Constants.ORANGE_COLOUR);
    }
}
