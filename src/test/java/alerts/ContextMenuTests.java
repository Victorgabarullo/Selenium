package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testRightClickOnSquare(){
        var square = homePage.clickOnContextMenu();
        square.rightClickOnSquare();
        assertEquals(square.getAlertText(),"You selected a context menu","Wrong Message");
        square.acceptMessage();
    }
}
