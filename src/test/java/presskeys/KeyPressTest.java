package presskeys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressTest extends BaseTest {
    @Test
    public void testBakspace(){
        var keyPage = homePage.clickOnKeyPress();
        keyPage.enterKeys("F" + Keys.BACK_SPACE );
        assertEquals(keyPage.getResultText(),"You entered: BACK_SPACE","Is not the expected result");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickOnKeyPress();
        keyPage.enterAt();
        assertEquals(keyPage.getResultText(),"You entered: Q","Not expected result");
    }

}
