package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwyg(){
        var editor = homePage.clickOnWysiwyg();
        String text1 = "Hello ";
        String text2 = "World.";
        editor.clearTextArea();
        editor.setTextArea(text1);
        editor.decreaseIndention();
        editor.setTextArea(text2);
        assertEquals(editor.getTextFromField(),text1+text2,"Wrong text. Actual text:"+editor.getTextFromField());
    }

    @Test
    public void testLeftAndBottomFrames(){
        var frames = homePage.clickOnFramesLink().clickOnNestedFrames();
        String left = frames.getFrameText(frames.TOP_FRAME_NAME,frames.LEFT_FRAME_NAME);
        String bottom = frames.getFrameText(frames.BOTTOM_FRAME_NAME);
        assertEquals(left,"LEFT","WRONG!");
        assertEquals(bottom,"BOTTOM","WRONG!");
    }
}
