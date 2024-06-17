import data.Constants;
import data.ErrorMessage;
import data.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail();
        signInPage.inputPassword();
        signInPage.clickSignInButton();
    }

    @Test
    public void loginErrorWhenUserNameIsMissingTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        Wait.waitInSeconds(2);
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputShortPassword();
        signInPage.clickSignInButton();
        String message = signInPage.getEmailError();
        Assert.assertEquals(message, ErrorMessage.REQUIRED_FIELD_ERROR_MESSAGE);
    }

    @Test
    public void loginErrorWithInvalidDataTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail();
        signInPage.inputShortPassword();
        signInPage.clickSignInButton();
        Wait.waitInSeconds(2);
        String message = signInPage.getAccountError();
        Assert.assertEquals(message, ErrorMessage.ACCOUNT_ERROR);
    }

    @Test
    public void loginErrorWhenPasswordIsMissing() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail();
        signInPage.clickSignInButton();
        Wait.waitInSeconds(2);
        String message = signInPage.getAccountError();
        String actualColour = signInPage.getErrorMessageColour();
        Assert.assertEquals(message, ErrorMessage.MISSING_PASSWORD_ERROR);
        Assert.assertEquals(actualColour, Constants.ERROR_RED_COLOUR);
    }
}
