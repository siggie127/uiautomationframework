package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
    //private By modal = By.xpath("//div[contains(@id,'modal')]");
    private By modalTitle = By.xpath(".//h3[contains(text(), 'This is a modal window')]");
    private By close = By.xpath(".//p[contains(text(),\"Close\")]");
    private By enable = By.linkText("click here");

    EntryAdPage(WebDriver driver){
        this.driver= driver;
            }
    public String getModalTitle(){
        if(!driver.findElement(modalTitle).isDisplayed()) {
            enableModal();
            }
        //String text;
        return driver.findElement(modalTitle).getText();
        //System.out.println(text);
        //return text;
    }

    public void closeModal(){
        driver.findElement(close).click();
        //enableModal();
    }

    public void enableModal(){
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(enable)).doubleClick().perform();
        driver.findElement(enable).click();
        WebDriverWait wait = new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalTitle)));

    }




}
