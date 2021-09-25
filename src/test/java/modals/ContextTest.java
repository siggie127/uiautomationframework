package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextTest extends BaseTests {

    @Test
    public void contextTest(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickHotSport();
        Assert.assertEquals(contextMenuPage.acceptAlert(),"You selected a context menu","Invalid text");

    }
}
