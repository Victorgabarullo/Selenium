package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alert = homePage.clickOnAlertPage();
        alert.clickOnJSAlert();
        alert.alert_clickToAccept();
        assertEquals(alert.getResult(),"You successfully clicked an alert","Error in message. Actual Message: "+alert.getResult());
    }

    @Test
    public void testGetTextFromAlert(){
        var alert = homePage.clickOnAlertPage();
        alert.clickOnConfirmButton();
        String alertText = alert.AlertGetText();
        assertEquals(alertText,"I am a JS Confirm","Alert Text Incorrect. Actual message: "+alert.AlertGetText());
        alert.alert_clickDismiss();
    }

    @Test
    public void testInputTextToAlert(){
        var alert = homePage.clickOnAlertPage();
        String text = "Automation Test :)";
        alert.clickOnPromptButton();
        alert.alert_setInput(text);
        alert.alert_clickToAccept();
        assertEquals(alert.getResult(),"You entered: "+text,"Wrong result!. Actual result: "+alert.getResult());
    }

}



