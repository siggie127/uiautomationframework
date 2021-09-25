package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver;
    private By figureBox = By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOver(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions hover = new Actions(driver);
        hover.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
        }

    public class FigureCaption{
        WebElement caption;
        FigureCaption(WebElement caption){
            this.caption = caption;
            }

        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getHeaderText(){
            return caption.findElement(header).getText();
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }


        }
    }




