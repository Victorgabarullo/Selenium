package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSendPage {
    private WebDriver driver;
    private By message = By.id("content");

    public EmailSendPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessfulMessage(){
        return driver.findElement(message).getText();
    }
}
