package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By submitButton = By.id("file-submit");
    private By uploadedfile = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fileUpload(String path){
        driver.findElement(chooseFileButton).sendKeys(path);
        clickSubmit();

    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public String checkUpdate(){
        return driver.findElement(uploadedfile).getText();
    }


}
