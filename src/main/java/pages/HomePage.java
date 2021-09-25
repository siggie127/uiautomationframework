package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
         this.driver = driver;
    }

    //private By formAuthentication = By.linkText("Form Authentication");

    public LoginPage clickformAuthentication() {
        //driver.findElement(formAuthentication).click();
        linkClick("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownList clickDropDownList(){
        linkClick("Dropdown");
        return new DropDownList(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        linkClick("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        linkClick("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        linkClick("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        linkClick("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        linkClick("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        linkClick("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd(){
        linkClick("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        linkClick("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WisiwygPage clickWisiwygLink(){
        linkClick("WYSIWYG Editor");
        return new WisiwygPage(driver);

    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        linkClick("Dynamic Loading");
        return new DynamicLoadingPage(driver);

    }

    public NestedFramesPage clickNestedFramesLink(){
        linkClick("Nested Frames");
        return new NestedFramesPage(driver);

    }

    public DeepDomPage clickDeepDomPageLink(){
        linkClick("Large & Deep DOM");
        return new DeepDomPage(driver);

    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        linkClick("Infinite Scroll");
        return new InfiniteScrollPage(driver);

    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        linkClick("Multiple Windows");
        return new MultipleWindowsPage(driver);

    }


    private void linkClick(String link){
        driver.findElement(By.linkText(link)).click();

        }

    }

