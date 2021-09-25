package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;
    private String topFrameSet = "frame-top";
    private String middleFrameSet = "frameset-middle";
    private String frameLeft = "frame-left";
    private String frameBottom ="frame-bottom";
    private By leftFrameBody = By.xpath("//body[contains(text(),'LEFT')]");
    private By bottomFrameBody = By.xpath("//body[contains(text(),'BOTTOM')]");



    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToTopFrameSet(){
        driver.switchTo().frame(topFrameSet);

    }
    public void switchToMiddleFrameSet(){
        driver.switchTo().frame(middleFrameSet);

    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(frameLeft);
    }

    public String getLeftFrameText(){
        switchToTopFrameSet();
        //switchToMiddleFrameSet();
        switchToLeftFrame();
        String text = driver.findElement(leftFrameBody).getText();
        switchToMainArea();
        return text;
    }


    public void switchToBottomFrame(){
        driver.switchTo().frame(frameBottom);
    }

    public String getBottomFrameText(){
        switchToBottomFrame();
        String text = driver.findElement(bottomFrameBody).getText();
        switchToMainArea();
        return text;
    }

    public void switchToMainArea(){
        driver.switchTo().defaultContent();

    }
}
