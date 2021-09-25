package iframe;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrameTest extends BaseTests {
    @Test
    public void nestedFrameTest(){
        var nestedFramesPage = homePage.clickNestedFramesLink();
        Assert.assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Invalid text");
        Assert.assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Invalid Text");
    }
}
