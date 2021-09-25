package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertTests extends BaseTests {
    @Test
    public void acceptAlert(){
        var javaScriptAlertPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertPage.clickjsAlert();
        Assert.assertEquals(javaScriptAlertPage.acceptAlert(),"You successfully clicked an alert", "Invalid Message");
    }

    @Test
    public void dissmissAlert(){
        var javaScriptAlertPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertPage.clickjsConfirm();
        Assert.assertEquals(javaScriptAlertPage.dismissAlert(),"You clicked: Cancel","Invalid Message");
    }

    @Test
    public void setPromtText(){
        var javaScriptAlertPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertPage.clickjsPrompt();
        Assert.assertEquals(javaScriptAlertPage.setPromtText("siggie you rock!"),"You entered: siggie you rock!");
    }
}
