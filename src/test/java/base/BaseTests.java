package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    //private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        gotoHome();
        //setCookie();
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        homePage = new HomePage(driver);


    }
    @BeforeMethod
    public void gotoHome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
//
//    public static void main (String args[]){
//        BaseTests baseTests = new BaseTests();
//        baseTests.setUp();
//    }
    @AfterMethod
    public void recordFailures(ITestResult result){
        if(ITestResult.FAILURE ==result.getStatus()){
            TakesScreenshot screenCapture = (TakesScreenshot)driver;
            File screenshot = screenCapture.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public WindowsManager windowsManager(){
         return new WindowsManager(driver);
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setHeadless(true);

        return new ChromeOptions();
    }

    public void setCookie(){
        Cookie cookie = new Cookie.Builder("Shashika","127")
                .domain("https://the-internet.herokuapp.com/")
                .build();
        driver.manage().addCookie(cookie);
    }

}
