package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerAletButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmAlertButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By promptAlertButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    /*Buttons Actions*/

    public void clickOnJSAlert(){
        driver.findElement(triggerAletButton).click();
    }

    public void clickOnConfirmButton(){
        driver.findElement(confirmAlertButton).click();
    }

    public void clickOnPromptButton(){
        driver.findElement(promptAlertButton).click();
    }

    /*Alert Actions*/

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String AlertGetText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    /*Results Actions*/

    public String getResult(){
        return driver.findElement(result).getText();
    }





}
