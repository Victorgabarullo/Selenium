package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String format = ".//a[contains(text(), '%s')]";
    private By exampleOne = By.xpath(String.format(format, "Example 1"));
    private By exampleTwo = By.xpath(String.format(format, "Example 2"));


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickOnExampleOne(){
        driver.findElement(exampleOne).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickOnExampleTwo(){
        driver.findElement(exampleTwo).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page rightClickOnExampleTwo(){
        driver.findElement(exampleTwo).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }

}
