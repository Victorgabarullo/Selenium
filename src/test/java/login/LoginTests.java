package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    /*El nombre del metodo es lo que se va a probar: testearCorrectoLogin */
    public void testSuccessfullLogin(){
        LogInPage login = homePage.clickOnFormAuth();
        login.setUsername("tomsmith");
        login.setPass("SuperSecretPassword!");
        SecureAreaPage secure = login.clickOnLogIn();
        assertTrue(secure.getAlertText().
                        contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
