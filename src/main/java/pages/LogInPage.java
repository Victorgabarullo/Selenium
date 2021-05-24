package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    private WebDriver driver;
    private By user = By.id("username");
    private By pass = By.id("password");
    private By loginButt = By.cssSelector("#login button");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String user){
        driver.findElement(this.user).sendKeys(user);
    }

    public void setPass(String pass){
        driver.findElement(this.pass).sendKeys(pass);
    }

    public SecureAreaPage clickOnLogIn(){
        driver.findElement(loginButt).click();
        return new SecureAreaPage(driver);
    }



}
