package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    private By statusAlert = By.id("flash");
    private By logoutButton = By.className("button secondary radius");

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    public LoginPage logOut(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
