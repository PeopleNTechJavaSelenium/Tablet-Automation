package HomePageTest;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    public WebElement imgPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtSectionTopHeadline;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtNewsItemHeadline;
    @FindBy(xpath = "//android.widget.ListView[1]/android.widget.RelativeLayout")
    List<WebElement> mainMenu = new ArrayList<>();
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button")
    List<WebElement> alertTendingNews = new ArrayList<>();

    public void setAlertTendingNews(String condition) {
        if (alertTendingNews.get(0).isDisplayed()) {
            switch (condition) {
                case "yes":
                    alertTendingNews.get(0).click();
                    break;
                case "no":
                    alertTendingNews.get(1).click();
                    break;
            }
        }
    }

    public void getMenu(){
        btnBurger.click();
    }

    public void getTopStories(){
        getMenu();
        mainMenu.get(0).click();
        Assert.assertTrue(txtPageHeading.getText().contains("TOP STORIES"));
    }
    public void getSavedArticles(){
        getMenu();
        mainMenu.get(1).click();
        Assert.assertTrue(txtPageHeading.getText().contains("SAVED ARTICLES"));
    }
    public void getNews(){
        getMenu();
        mainMenu.get(2).click();
        Assert.assertTrue(txtPageHeading.getText().contains("NEWS"));
    }
    public void getMetro(){
        getMenu();
        mainMenu.get(3).click();
        Assert.assertTrue(txtPageHeading.getText().contains("METRO"));
    }
    public void getPageSix(){
        getMenu();
        mainMenu.get(4).click();
        Assert.assertTrue(imgPageHeading.getSize().width==229);
        Assert.assertTrue(imgPageHeading.getSize().height==54);
    }
    public void getSports(){
        getMenu();
        mainMenu.get(5).click();
        Assert.assertTrue(txtPageHeading.getText().contains("SPORTS"));
    }
    public void getBusiness(){
        getMenu();
        mainMenu.get(6).click();
        Assert.assertTrue(txtPageHeading.getText().contains("BUSINESS"));
    }
    public void getOpinion(){
        getMenu();
        mainMenu.get(7).click();
        Assert.assertTrue(txtPageHeading.getText().contains("OPINION"));
    }
    public void getEntertainment(){
        getMenu();
        mainMenu.get(8).click();
        Assert.assertTrue(txtPageHeading.getText().contains("ENTERTAINMENT"));
    }
    public void getFashion(){
        getMenu();
        mainMenu.get(9).click();
        Assert.assertTrue(txtPageHeading.getText().contains("FASHION"));
    }
    public void getLiving(){
        getMenu();
        mainMenu.get(10).click();
        Assert.assertTrue(txtPageHeading.getText().contains("LIVING"));
    }
    public void getMedia(){
        getMenu();
        mainMenu.get(11).click();
        Assert.assertTrue(txtPageHeading.getText().contains("MEDIA"));
    }
    public void getTech(){
        getMenu();
        mainMenu.get(12).click();
        Assert.assertTrue(txtPageHeading.getText().contains("TECH"));
    }
    public void getRealEstate(){
        getMenu();
        mainMenu.get(13).click();
        Assert.assertTrue(txtPageHeading.getText().contains("REAL ESTATE"));
    }
    public void getPhotots(){
        getMenu();
        mainMenu.get(14).click();
        Assert.assertTrue(txtPageHeading.getText().contains("PHOTOS"));
    }
    public void getVideo(){
        getMenu();
        mainMenu.get(15).click();
        Assert.assertTrue(txtPageHeading.getText().contains("VIDEO"));
    }
    public void getAbout(){
        getMenu();
        mainMenu.get(16).click();
        Assert.assertTrue(txtPageHeading.getText().contains("ABOUT"));
    }
}
