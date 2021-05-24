package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption1(){
        var dropDownPage = homePage.clickOnDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var SelectedOpions = dropDownPage.getSelectedItem();
        assertEquals(SelectedOpions.size(), 1,"Incorrect number of selections");
        assertTrue(SelectedOpions.contains(option),"Option not selected!!");
    }

}
