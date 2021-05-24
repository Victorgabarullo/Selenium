package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.WindowsManager;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigation(){
        homePage.clickOnDynamicLoading().clickOnExampleOne();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickOnMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
