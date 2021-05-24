package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scrolls until paragraph with specifed index is in view
     * @param index the index of paragraph. Starts in 1
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";

        var jsExecutor = (JavascriptExecutor)driver;

        while(getNumberOfParagraph() < index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraph(){
        return driver.findElements(textBlocks).size();
    }
}
