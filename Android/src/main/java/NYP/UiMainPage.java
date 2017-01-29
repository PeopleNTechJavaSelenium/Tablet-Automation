package NYP;

import NYP.MainMenu.TopStories;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 29-01-2017.
 */
public class UiMainPage extends Base {
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
    public WebElement btnBurger;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    public WebElement btnSearch;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.TextView")
    List<WebElement> mainMenu = new ArrayList<>();

    public void getMenu(){
        btnBurger.click();
    }

    public TopStories topStories(){
        getMenu();
        mainMenu.get(0).click();
        return new TopStories();
    }
}
