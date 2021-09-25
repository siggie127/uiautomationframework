package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

@Test
public class LoginTests extends BaseTests {
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickformAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLogin();
        //assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!","Alert Message error");
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert Message error");

    }
}
