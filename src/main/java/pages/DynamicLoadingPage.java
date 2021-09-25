package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By link1 =By.linkText("Example 1: Element on page that is hidden");
    private By link2 =By.linkText("Example 2: Element rendered after the fact");
    private By startButton = By.xpath("//button[contains(text(),'Start')] ");
    private By loader = By.xpath("//div[@id='loading']");
    private By statusText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnLink1(){
        driver.findElement(link1).click();
        waitForElement(startButton);
            }

    public void rightClickOnLink2(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(link2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        //switchToTab();
        //action.sendKeys(Keys.CONTROL, Keys.TAB).perform();
        //driver.switchTo().window().

    }
    public boolean checkStartButton(){
//        Actions action2 = new Actions(driver);
//        action2.sendKeys(Keys.CONTROL, Keys.TAB).perform();
//        waitForElement(startButton);
        return driver.findElement(startButton).isDisplayed();

    }

    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    public void clickOnStartButton(){
        driver.findElement(startButton).click();
        fluentWait(loader);
    }

    public String getStatus(){
        return driver.findElement(statusText).getText();
    }

    public void fluentWait(By by){
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    }

}
