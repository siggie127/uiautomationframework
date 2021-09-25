package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;
    private By textField = By.id("target");
    private By resultText = By.id("result");

    KeyPressesPage(WebDriver driver){
        this.driver = driver;

    }

    public void enterKeys(String keys){
        driver.findElement(textField).sendKeys(keys);
    }

    public void enterPi(){
        driver.findElement(textField).sendKeys(Keys.chord(Keys.ALT,"227"));
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

}
