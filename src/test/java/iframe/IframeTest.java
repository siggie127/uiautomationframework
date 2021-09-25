package iframe;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends BaseTests {
    @Test
    public void iFrameTest(){
        String text1 ="Hello";
        String text2 = "Siggie!";
        var wisiwygPage = homePage.clickWisiwygLink();
        wisiwygPage.clearText();
        wisiwygPage.enterText(text1);
        wisiwygPage.clickBoldButton();
        wisiwygPage.enterText(text2);
        System.out.println("test page:"+wisiwygPage.getText());
        Assert.assertEquals(wisiwygPage.getText(),text1+text2,"Invalid Text");
        wisiwygPage.clearText();
    }
}
