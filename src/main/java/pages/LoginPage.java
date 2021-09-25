package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private String userName;
    private String passWord;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.className("radius");

    public void setUserName(String userName) {
        driver.findElement(username).sendKeys(userName);        ;
    }
    public void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }
    public SecureAreaPage clickOnLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
