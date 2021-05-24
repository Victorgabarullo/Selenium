package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygPage {

    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentButton = By.cssSelector("button[title='Increase indent']");

    public WysiwygPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchtoEditArea(){
        driver.switchTo().frame(editorIFrameID);
    }

    public void clearTextArea(){
        switchtoEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text){
        switchtoEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndention(){
        driver.findElement(indentButton).click();
    }

    public String getTextFromField(){
        switchtoEditArea();
        String textFromArea = driver.findElement(textArea).getText();
        switchToMainArea();
        return textFromArea;
    }


}
