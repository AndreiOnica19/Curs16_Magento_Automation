import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void goToWebsiteTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get(Constants.BASE_URL);
        driver.close();
    }
}
