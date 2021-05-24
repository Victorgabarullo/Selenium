package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class Dropdown {
    private WebDriver driver;
    private By dropdownOption = By.id("dropdown");

    public Dropdown(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedItem(){
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        /*Dentro del map es una expresion que devuelve los elementos en un String y los mete en una nueva lista: getSelectedItem*/
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdownOption));
    }

    public void convertToMultiple(){
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script, findDropdownElement());
    }






}
