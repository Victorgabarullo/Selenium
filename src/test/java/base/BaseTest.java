package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "fuentes/chromedriver.exe");
        driver = new ChromeDriver();
        //con este get buscamos la url
        driver.get("https://the-internet.herokuapp.com/");

        //con esta sentencia estoy maximizando la pantalla.
        driver.manage().window().maximize();

        //con full screen la pone en pantalla completa
        //driver.manage().window().fullscreen();

        //con esta estoy seteando el tamaño de la pantalla
        //driver.manage().window().setSize(new Dimension(360, 640));

        System.out.println(driver.getTitle());

        //esta es la forma de encontrar un elemento, singular. (Trae el primero)

        WebElement inputsLink  = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();


        //Esta es la forma de tarer una lista de elementos. Se deben almanecnar en una lista
        //de WebElements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //close cierra la pestaña pero quit cierra toda la ventana
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
