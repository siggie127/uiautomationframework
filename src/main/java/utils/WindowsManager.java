package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver) {
        this.driver = driver;
        this.navigate =driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refresh(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchTab(String tab){
        var windows = driver.getWindowHandles();
        System.out.println("number of tabs:"+windows.size());
        for(String window:windows){
            System.out.println("switching to window:"+window);
            driver.switchTo().window(window);
            System.out.println("tab title:"+driver.getTitle());
            if(driver.getTitle().equals(tab)){
                break;
            }

        }
    }

    public void switchToNewTab(){
        var tabs=driver.getWindowHandles();
        for(String tab :tabs){
            driver.switchTo().window(tab);
        }
    }
}
