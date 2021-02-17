package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "fuentes/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.quit();
    }

    public void exercise(){
        System.setProperty("webdriver.chrome.driver", "fuentes/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement link1 = driver.findElement(By.linkText("Shifting Content"));
        link1.click();
        WebElement link2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        link2.click();
        List<WebElement> lista = driver.findElements(By.tagName("li"));
        System.out.println(lista.size());
        driver.quit();

    }


    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.exercise();
    }

}
