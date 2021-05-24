package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String newTabName){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: "+windows.size());
        System.out.println("Windows Handles: \\n");
        windows.forEach(System.out::println);

        for(String window: windows){
            System.out.println("Switching to: "+window);
            driver.switchTo().window(window);

            System.out.println("Current window: "+driver.getTitle());

            if(newTabName.equals(driver.getTitle())){
                break;
            }
        }
    }

    /**
     * Will switch to the next tab. Use when you have only two tabs
     */
    public void switchToNextTab(){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: "+windows.size());
        System.out.println("Windows Handles: \\n");
        windows.forEach(System.out::println);

        for(String window: windows){
            System.out.println("Switching to: "+window);
            driver.switchTo().window(window);
            System.out.println("Current window: "+driver.getTitle());
        }
    }
}