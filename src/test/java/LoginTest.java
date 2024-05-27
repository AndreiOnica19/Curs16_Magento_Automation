import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys(Constants.VALID_EMAIL);
        driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
    }

    @Test
    public void loginErrorWhenUserNameIsMissingTest() {
        driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("abc");
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
        String message = driver.findElement(By.cssSelector("#email-error")).getText();
        Assert.assertEquals(message, ErrorMessage.REQUIRED_FIELD_ERROR_MESSAGE);
    }

    @Test
    public void loginErrorWithInvalidDataTest() {
        driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Constants.EMAIL);
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("abc");
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
        Wait.waitInSeconds(2);
        String message = driver.findElement(By.xpath("//div[@class='message-error error message']")).getText();
        Assert.assertEquals(message, "The account sign-in was incorrect or your account is disabled temporarily. " +
                "Please wait and try again later.");
    }

    @Test
    public void loginErrorWhenPasswordIsMissing() {
        driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Constants.EMAIL);
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
        Wait.waitInSeconds(2);
        String message = driver.findElement(By.xpath("//div[@class='message-error error message']")).getText();
        String actualColour = driver.findElement(By.cssSelector(".message-error.error.message")).getCssValue("color");
        Assert.assertEquals(message, "A login and a password are required.");
        Assert.assertEquals(actualColour, Constants.ERROR_RED_COLOUR);
    }
}
