import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class End2EndTest {
    //intri pe site, te logezi, selectezi produse, le bagi in cos si faci toate formalitatile pana la final.

    @Test
    public void makeOrderTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        driver.findElement(By.xpath("(//span[contains (text(), 'Men')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Jackets')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("2");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains (text(), 'Gear')])")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Bags')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[8]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("3");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains (text(), 'Women')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Tees')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[12]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("5");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
        driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input[@id='customer-email'])[1]")).sendKeys(Constants.EMAIL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(Constants.COMPANY);
        driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys(Constants.ADDRESS);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(Constants.CITY);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//select[@class='select'])[2]")).sendKeys(Constants.COUNTRY);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='region_id']")).sendKeys(Constants.STATE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='input-text'])[12]")).sendKeys(Constants.POSTCODE);
        driver.findElement(By.xpath("(//input[@class='input-text'])[13]")).sendKeys(Constants.PHONE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-role='opc-continue']")).submit();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();

    }
}
