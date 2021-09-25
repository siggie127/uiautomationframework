package keypress;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTests {
    @Test
    public void sliderTest(){
        String value ="2";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSlider(value);
        Assert.assertEquals(horizontalSliderPage.getSliderValue(), "2","Incorrect Value");
    }
}
