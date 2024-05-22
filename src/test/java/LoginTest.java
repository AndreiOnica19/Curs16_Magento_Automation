import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTest(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Constants.VALID_EMAIL);
        driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
    }
}
