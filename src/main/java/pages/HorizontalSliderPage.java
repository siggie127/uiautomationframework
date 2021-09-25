package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    WebDriver driver;
    //private By slider = By.className("sliderContainer");
    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");
    HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSlider(String value){
        while (!getSliderValue().equals(value))
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }

}
