package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    WebDriver driver;
    private By jsAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By jsConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By alertResult = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickjsAlert(){
        driver.findElement(jsAlert).click();
    }

    public String acceptAlert(){
        driver.switchTo().alert().accept();
        return driver.findElement(alertResult).getText();
    }

    public void clickjsConfirm(){
        driver.findElement(jsConfirm).click();
    }
    public String dismissAlert(){
        driver.switchTo().alert().dismiss();
        return driver.findElement(alertResult).getText();
    }

    public void clickjsPrompt(){
        driver.findElement(jsPrompt).click();
    }

    public String setPromtText(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return driver.findElement(alertResult).getText();
    }


}
