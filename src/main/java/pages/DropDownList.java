package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownList {
    private WebDriver driver;
    public DropDownList(WebDriver driver) {
        this.driver = driver;
    }
    //Select dropDown =S
    private By dropDown = By.id("dropdown");

    public void selectFromDropDown(String option){
        //Select DropDownElements = new Select(driver.findElement(dropDown));
        //DropDownElements.selectByVisibleText(option);
        selectDropDown().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
            List<WebElement> selectedElements = selectDropDown().getAllSelectedOptions();
            return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select selectDropDown(){
        return new Select(driver.findElement(dropDown));
    }

}
