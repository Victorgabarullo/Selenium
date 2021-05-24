package dynamicsloading;

import base.BaseTest;
import org.openqa.selenium.interactions.Actions;
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

    @Test
    public void testWaitUntilAppears_NewTab(){
        var loading = homePage.clickOnDynamicLoading().rightClickOnExampleTwo();
        getWindowManager().switchToNextTab();
        loading.clickOnStart();
        assertEquals(loading.getLoadedText(),"Hello World!","Wrong text. Actual text: "+loading.getLoadedText());
    }



}
