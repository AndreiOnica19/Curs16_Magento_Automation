import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class End2EndTest extends BaseTest {

    @Test
    public void makeOrderTest() throws InterruptedException {
        driver.findElement(By.xpath("(//span[contains (text(), 'Men')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Jackets')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("2");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//span[contains (text(), 'Gear')])")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Bags')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[8]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("3");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//span[contains (text(), 'Women')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Tees')])")).click();
        driver.findElement(By.xpath("(//a[@class='product-item-link'])[12]")).click();
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("5");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        Wait.waitInSeconds(5);
        driver.findElement(By.cssSelector(".action.showcart")).click();
        driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
        Wait.waitInSeconds(4);
        driver.findElement(By.xpath("(//input[@id='customer-email'])[1]")).sendKeys(Constants.EMAIL);
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(Constants.COMPANY);
        driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys(Constants.ADDRESS);
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(Constants.CITY);
        Wait.waitInSeconds(3);
        driver.findElement(By.xpath("(//select[@class='select'])[2]")).sendKeys(Constants.COUNTRY);
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//select[@name='region_id']")).sendKeys(Constants.STATE);
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("(//input[@class='input-text'])[12]")).sendKeys(Constants.POSTCODE);
        driver.findElement(By.xpath("(//input[@class='input-text'])[13]")).sendKeys(Constants.PHONE);
        Wait.waitInSeconds(2);
        driver.findElement(By.xpath("//button[@data-role='opc-continue']")).submit();
        Wait.waitInSeconds(7);
        driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();
    }
}
