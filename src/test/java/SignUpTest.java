import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {
    @Test
    public void createAccountTest() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(), 'Create an Account')])[1]")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.xpath("//input[@title='Email']")).sendKeys(Constants.EMAIL);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
        Wait.waitInSeconds(2);
        String message = driver.findElement(By.xpath("//div[@class='message-success success message']")).getText();
        Assert.assertEquals(message, Constants.EXPECTED_SUCCESS_MESSAGE);
    }
}
