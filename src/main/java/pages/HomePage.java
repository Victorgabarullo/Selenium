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

    public HoverPage clickOnHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressPage clickOnKeyPress(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public HorizontalSliderPage clickOnHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertPage clickOnAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickOnFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickOnContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygPage clickOnWysiwyg(){
        clickLink("WYSIWYG Editor");
        return new WysiwygPage(driver);
    }

    public FramesPage clickOnFramesLink(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

}
