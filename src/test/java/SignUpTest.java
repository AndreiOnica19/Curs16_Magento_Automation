import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    @Test
    public void createAccountTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        driver.findElement(By.xpath("(//a[contains(text(), 'Create an Account')])[1]")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.xpath("//input[@title='Email']")).sendKeys(Constants.EMAIL);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//div[@class='message-success success message']")).getText();
        Assert.assertEquals(message, Constants.EXPECTED_SUCCESS_MESSAGE);
    }
}
