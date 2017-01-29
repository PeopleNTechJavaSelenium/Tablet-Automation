package HomePage;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 29-01-2017.
 */
public class MainMenuTest extends Base {
    @Test
    public void testTopStories(){
        UiMainPage uiMainPage = PageFactory.initElements(ad,UiMainPage.class);
        uiMainPage.topStories();
    }
}
