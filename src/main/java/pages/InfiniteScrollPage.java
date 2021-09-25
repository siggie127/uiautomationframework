package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By para = By.className("jscroll-added");


    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){
        String script = "arguments[0].scrollInToView();";
    }


}
