import data.Constants;
import data.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {
    @Test
    public void createAccountTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCreateAccountLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputFirstName();
        signUpPage.inputLastName();
        signUpPage.inputEmail();
        signUpPage.inputPassword();
        signUpPage.inputConfirmationPassword();
        signUpPage.clickCreateAccountButton();
        Wait.waitInSeconds(2);
        String message = signUpPage.getSuccessMessage();
        Assert.assertEquals(message, Constants.EXPECTED_SUCCESS_MESSAGE);
    }
}
