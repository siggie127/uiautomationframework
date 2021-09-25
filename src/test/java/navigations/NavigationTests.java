package navigations;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigationTests extends BaseTests{
    @Test
    public void navigationTests(){
        homePage.clickDynamicLoadingLink().clickOnLink1();
        windowsManager().goBack();
        windowsManager().goForward();
        windowsManager().refresh();
        windowsManager().goTo("http://www.google.com");
    }

    @Test
    public void switchTabsTest(){
        var multipleWindowsPage =homePage.clickMultipleWindowsLink();
        multipleWindowsPage.clickLink();
        windowsManager().switchTab("New Window");
        Assert.assertEquals(multipleWindowsPage.getTabTitle(),"New Window","Invalid Tab");
    }

    @Test
    public void rightClickTest(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.rightClickOnLink2();
        windowsManager().switchToNewTab();
        Assert.assertTrue(dynamicLoadingPage.checkStartButton(),"Start button not loaded");

    }

}
