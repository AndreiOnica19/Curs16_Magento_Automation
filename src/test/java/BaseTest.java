import data.Constants;
import data.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

    @AfterTest
    public void closeDriver() {
        Wait.waitInSeconds(3);
        //driver.close();
    }
}
