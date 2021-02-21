package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retireveButton = By.id("form_submit");


    ForgotPassPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSendPage clickOnRetrieve(){
        driver.findElement(retireveButton).click();
        return new EmailSendPage(driver);
    }
}
