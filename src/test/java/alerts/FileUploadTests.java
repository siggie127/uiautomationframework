package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void fileUploadTest(){
        String path = "C:\\ShashikaG\\Projetcs\\Australian Project\\Automation\\Webdriver_Java\\resources\\chromedriver.exe";
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.fileUpload(path);
        Assert.assertEquals(fileUploadPage.checkUpdate(), "chromedriver.exe", "invalid file");
    }
}
