package jacascripts;

import base.BaseTests;
import org.testng.annotations.Test;

public class javascriptTests extends BaseTests {
    @Test
    public void javascriptTest(){
        var deepDemoPage = homePage.clickDeepDomPageLink();
        deepDemoPage.scrollToTable();
    }
}
