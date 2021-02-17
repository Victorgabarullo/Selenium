package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage clickOnFormAuth(){
        clickLink("Form Authentication");
        return new LogInPage(driver);
    }

    public Dropdown clickOnDropdown(){
        clickLink("Dropdown");
        return new Dropdown(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public ForgotPassPage clickOnForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassPage(driver);
    }

}
