package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPassTest extends BaseTest {

    @Test
    public void testRetrieveMessage(){
        var forgotPass = homePage.clickOnForgotPassword();
        forgotPass.setEmail("victor@example.com");
        var emailsend = forgotPass.clickOnRetrieve();
        assertTrue(emailsend.getSuccessfulMessage().
                contains("Your e-mail's been sent!"),"Message wrong!!");
    }

}
