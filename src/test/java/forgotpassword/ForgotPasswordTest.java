package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void forgetPasswordTest(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("test@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword();
        Assert.assertEquals(emailSentPage.getHeaderText(),"Internal Server Error","Invalid page");;
    }

}
