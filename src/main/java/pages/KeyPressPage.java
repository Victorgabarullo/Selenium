package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {

    private WebDriver driver;
    private By textField = By.id("target");
    private By textMessage = By.id("result");

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultText(){
        return driver.findElement(textMessage).getText();
    }

    public void enterKeys(String text){
        driver.findElement(textField).sendKeys(text);
    }

    public void enterAt(){
        /*Chord mete las teclas al mismo tiempo*/
        enterKeys(Keys.chord(Keys.ALT, Keys.CONTROL,"q"));

    }

}
