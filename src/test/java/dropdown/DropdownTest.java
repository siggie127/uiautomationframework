package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DropdownTest extends BaseTests {
    public void testSelectOption(){
        String option = "Option 1";
        var dropDownListPage =homePage.clickDropDownList();
        dropDownListPage.selectFromDropDown(option);
        var selectedOption=dropDownListPage.getSelectedOption();
        Assert.assertEquals(selectedOption.size(),1,"Selected number incorrect");
        Assert.assertTrue(selectedOption.contains(option),"Selected option incorrect");
    }

}
