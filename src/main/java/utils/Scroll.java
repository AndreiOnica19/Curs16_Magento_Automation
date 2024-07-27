package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
    public static void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ")", "");
    }

    public static void scrollUp(WebDriver driver, int pixelsUp) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixelsUp * -1 + ")", "");
    }

    public static void scrollLeft(WebDriver driver, int pixelsLeft) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(" + pixelsLeft * -1 + ", 0)", "");
    }

    public static void scrollRight(WebDriver driver, int pixelsRight) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(" + pixelsRight + ", 0)","");
    }

    public static void scrollToElementUsingJs(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }

    public static void scrollToElementUsingActions(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        Wait.waitInSeconds(1);
        actions.scrollToElement(element);
        actions.perform();
    }
}
