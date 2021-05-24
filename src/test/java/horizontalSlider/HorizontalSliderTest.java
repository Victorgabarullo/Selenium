package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testFourSlider(){
        var slider = homePage.clickOnHorizontalSlider();
        slider.sendArrows(4);
        assertEquals(slider.getNumber(),"4","Wrong! Actual result: "+slider.getNumber());
    }
}

