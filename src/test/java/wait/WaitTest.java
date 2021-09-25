package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTests {

    @Test
    public void waitTest(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.clickOnLink1();
        dynamicLoadingPage.clickOnStartButton();
        Assert.assertEquals(dynamicLoadingPage.getStatus(),"Hello World!", "Invalid Status");
    }
}
