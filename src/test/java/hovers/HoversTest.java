package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTest {

    @Test
    public void testFigureOne(){
        var hover = homePage.clickOnHover();
        var caption = hover.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Is not displayed");
        assertEquals(caption.getTitle(),"name: user1","Title is different");
        assertEquals(caption.getLinkText(),"View profile","LinkText is different");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
