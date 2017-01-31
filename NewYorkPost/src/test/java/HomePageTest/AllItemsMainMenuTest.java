package HomePageTest;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 31-01-2017.
 */
public class AllItemsMainMenuTest extends Base {
    public UiMainPage uiMainPage(){
        return PageFactory.initElements(ad,UiMainPage.class);
    }
    @Test
    public void testMenuItems(){
        for (int i = 0; i < uiMainPage().mainMenuArr.length; i++) {
            uiMainPage().getMenu();
            scrollAndClickByName(uiMainPage().mainMenuArr[i]);
        }
    }
}
