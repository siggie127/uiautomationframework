package keypress;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class KeyPressTests extends BaseTests {
    @Test
    public void keyPressTest(){
        var keypresspage = homePage.clickKeyPresses();
        keypresspage.enterKeys("A"+Keys.BACK_SPACE);
        Assert.assertEquals(keypresspage.getResultText(),"You entered: BACK_SPACE","Invalid result");
    }
    @Test
    public void piTest(){
        var keypresspage = homePage.clickKeyPresses();
        keypresspage.enterPi();
        Assert.assertEquals(keypresspage.getResultText(),"You entered: π","Invalid key");
    }
}
