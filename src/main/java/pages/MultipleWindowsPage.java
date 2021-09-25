package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    public By link =By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(){
        driver.findElement(link).click();
    }

    public String getTabTitle(){
        return driver.getTitle();
    }


}
