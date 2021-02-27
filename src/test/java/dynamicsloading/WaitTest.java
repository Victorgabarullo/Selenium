package dynamicsloading;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickOnDynamicLoading().clickOnExampleOne();
        loadingPage.clickOnStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","Wrong text. Actual text: "+loadingPage.getLoadedText());
    }

    @Test
    public void testWaitUntilAppears(){
        var loadingPage = homePage.clickOnDynamicLoading().clickOnExampleTwo();
        loadingPage.clickOnStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","Wrong text. Actual text: "+loadingPage.getLoadedText());
    }


}
