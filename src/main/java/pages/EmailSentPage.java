package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    WebDriver driver;
    private By headerText = By.tagName("h1");
    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHeaderText(){
        return driver.findElement(headerText).getText();
    }
}
