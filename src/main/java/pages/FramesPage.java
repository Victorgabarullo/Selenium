package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    public String LEFT_FRAME_NAME = "frame-left";
    public String BOTTOM_FRAME_NAME = "frame-bottom";
    public String TOP_FRAME_NAME = "frame-top";
    private By bodyContent = By.tagName("body");
    private By nestedLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public FramesPage clickOnNestedFrames(){
        driver.findElement(nestedLink).click();
        return new FramesPage(driver);
    }

    private void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }

    private void switchToMain(){
        driver.switchTo().parentFrame();
    }

    public String getFrameText(String frame){
        switchToFrame(frame);
        String bodyText = driver.findElement(bodyContent).getText();
        switchToMain();
        return bodyText;
    }

    public String getFrameText(String frameParent, String frame){
        switchToFrame(frameParent);
        switchToFrame(frame);
        String bodyText = driver.findElement(bodyContent).getText();
        switchToMain();
        driver.switchTo().defaultContent();
        return bodyText;
    }


}
