package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WisiwygPage {
    private WebDriver driver;
    //private By iframe1 = By.id("mce_0_ifr");
    private String iframe1 = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    //private By textArea = By.xpath("//body[@id='tinymce']");
    private By boldButton = By.xpath("//button[@title='Bold']");

    public WisiwygPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToIframe(){
        //driver.switchTo().frame(driver.findElement(iframe1));
        driver.switchTo().frame(iframe1);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearText(){
        switchToIframe();
        driver.findElement(textArea).clear();
        implicitWait(textArea,"");
        switchToMainArea();

    }

    public void clickBoldButton(){
        driver.findElement(boldButton).click();
    }
    public void enterText(String text){
        switchToIframe();
        //implicitWait(textArea);
        System.out.println("enter text before:"+driver.findElement(textArea).getText());
        driver.findElement(textArea).sendKeys(text);
        System.out.println("enter text after:"+driver.findElement(textArea).getText());
        switchToMainArea();
            }

    public String getText(){
        String text;
        switchToIframe();
        //implicitWait(textArea);
        text = driver.findElement(textArea).getText();
        System.out.println("get text:"+text);
        switchToMainArea();
        return text;
    }

    public void implicitWait(By by, String string){
        WebDriverWait wait = new WebDriverWait(driver,3);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        System.out.println("wait text"+driver.findElement(by).getText());
        System.out.println(driver.findElement(textArea).getText().length());
        //wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(by),string));
        //wait.until(driver.findElement(textArea).getText().length()==0);
    }
}
