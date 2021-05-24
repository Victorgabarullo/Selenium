package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By square = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickOnSquare(){
        Actions s = new Actions(driver);
        s.contextClick(driver.findElement(this.square)).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptMessage(){
        driver.switchTo().alert().accept();
    }


}
