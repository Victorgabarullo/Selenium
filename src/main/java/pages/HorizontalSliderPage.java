package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.sql.Time;

public class HorizontalSliderPage {
    WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSlider(){
        driver.findElement(this.slider).click();
    }

    public String getNumber(){
        var result = driver.findElement(this.result);
        return result.getText();
    }

    /*Esto puede mejorar*/
    public void sendArrows(float numberVerify){
        clickOnSlider();
        for(int i = 0; i < numberVerify; i++){
            driver.findElement(slider).sendKeys(Keys.RIGHT);
        }
        driver.findElement(slider).sendKeys(Keys.LEFT);

    }

}
