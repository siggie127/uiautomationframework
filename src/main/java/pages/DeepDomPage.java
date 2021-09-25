package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeepDomPage {
    private WebDriver driver;
    private By tableElement = By.id("large-table");

    public DeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement table = driver.findElement(tableElement);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,table);
    }
}
