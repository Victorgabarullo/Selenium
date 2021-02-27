package pages;

import jdk.jfr.FlightRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By result = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStart(){
        driver.findElement(startButton).click();

        /*WebDriver Wait*/

        //WebDriverWait wait = new WebDriverWait(driver, 5);

        /*Fluent Wait*/
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        /*Con esto va a esperar a que desaparezca la barra o hasta que pasen 5 segundos*/
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
    }

    public String getLoadedText(){
        return driver.findElement(result).getText();
    }




}
