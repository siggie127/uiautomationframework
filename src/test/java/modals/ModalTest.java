package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTests {

    @Test
    public void modalTest(){
        var modalTestPage = homePage.clickEntryAd();
        //modalTestPage.enableModal();
        Assert.assertEquals(modalTestPage.getModalTitle(),"THIS IS A MODAL WINDOW","Invalid Title");
        modalTestPage.closeModal();
    }
}
