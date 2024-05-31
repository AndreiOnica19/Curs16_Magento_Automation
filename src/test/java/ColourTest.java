import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ColourTest extends BaseTest {
    @Test
    public void verifyPanelWrapperReturnsGreyTest() {
        Wait.waitInSeconds(3);
        String actualColour = driver.findElement(By.cssSelector(".panel.wrapper")).getCssValue("background-color");
        Assert.assertEquals(actualColour, Constants.GREY_COLOUR);
    }

    @Test
    public void verifyFooterColourReturnsGreyTest() {
        Wait.waitInSeconds(3);
        String actualColour = driver.findElement(By.xpath("//small[@class='copyright']")).getCssValue("background-color");
        Assert.assertEquals(actualColour, Constants.GREY_COLOUR);
    }

    @Test
    public void verifyContentBarReturnsOrangeTest() {
        Wait.waitInSeconds(3);
        String actualColour = driver.findElement(By.xpath("//div[@class='message global demo']")).getCssValue("background");
        Assert.assertEquals(actualColour, Constants.ORANGE_COLOUR);
    }
}
