package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {
    @Test
    public void hoverTest(){
        var hoversPage = homePage.clickHovers();
        var figureCaption = hoversPage.hoverOver(1);
        Assert.assertTrue(figureCaption.isCaptionDisplayed(), "Caption Not Displayed");
        Assert.assertEquals(figureCaption.getHeaderText(), "name: user1","Incorrect User Name");
        Assert.assertEquals(figureCaption.getLinkText(), "View profile", "Invalid Link Text");
        Assert.assertTrue(figureCaption.getLink().endsWith("/users/1"),"Incorrect Link");

    }

}
