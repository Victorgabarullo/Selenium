package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testUploadFile(){
        var uplopad = homePage.clickOnFileUpload();
        uplopad.uploadFile("D:\\Selenium\\fuentes\\chromedriver.exe");
        assertEquals(uplopad.getUploadedFile(),"chromedriver.exe","Invalid file. Actual File: "+uplopad.getUploadedFile());
    }
}
