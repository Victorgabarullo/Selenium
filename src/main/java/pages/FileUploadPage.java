package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By uploadOption = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By result = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param file its the path of the file to upload
     */
    public void uploadFile(String file){
        driver.findElement(uploadOption).sendKeys(file);
        clickOnLoad();
    }

    public void clickOnLoad(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFile(){
        return driver.findElement(result).getText();
    }


}
