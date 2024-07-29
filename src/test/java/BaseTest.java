import data.Data;
import utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.get(Data.BASE_URL.getValue());
    }

    @AfterTest
    public void closeDriver() {
        Wait.waitInSeconds(3);
        //driver.close();
    }
}
