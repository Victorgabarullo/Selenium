package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollToTable(){
        homePage.clickOnLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testInfiniteScroll(){
        homePage.clickOnInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testConvertToMultiple(){
        var js = homePage.clickOnDropdown();
        js.convertToMultiple();

        var optionsToSelect = List.of("Option 1","Option 2");
        optionsToSelect.forEach(js::selectFromDropdown);

        var selectedOptions = js.getSelectedItem();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");

    }

}
