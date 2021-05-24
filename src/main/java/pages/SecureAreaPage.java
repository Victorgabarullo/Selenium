package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By alertMessage = By.id("flash");
    private By logOutButton = By.className("button secondary radius");


    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(alertMessage).getText();
    }

    public LogInPage clickOnLogOut(){
        driver.findElement(logOutButton).click();
        return new LogInPage(driver);
    }
}
