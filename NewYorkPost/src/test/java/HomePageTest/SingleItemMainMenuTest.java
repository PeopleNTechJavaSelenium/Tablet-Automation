package HomePageTest;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 29-01-2017.
 */
public class SingleItemMainMenuTest extends Base {
    public UiMainPage mainPage(){
//        UiMainPage uiMainPage = PageFactory.initElements(ad,UiMainPage.class);
//        if(uiMainPage.alertTendingNews.get(0).isDisplayed()) {
//            while (uiMainPage.alertTendingNews.get(0).isDisplayed()) {
//                uiMainPage.setAlertTendingNews("no");
//            }
//        }
        return PageFactory.initElements(ad,UiMainPage.class);
    }
    @Test
    public void testTopStories(){
        mainPage().getTopStories();
    }
    @Test
    public void testSavedArticles(){
        mainPage().getSavedArticles();
    }
    @Test
    public void testNews(){
        mainPage().getNews();
    }
    @Test
    public void testMetro(){
        mainPage().getMetro();
    }
    @Test
    public void testPageSix(){
        mainPage().getPageSix();
    }
    @Test
    public void testSports(){
        mainPage().getSports();
    }
    @Test
    public void testBusiness(){
        mainPage().getBusiness();
    }
    @Test
    public void testOpinion(){
        mainPage().getOpinion();
    }
    @Test
    public void testEntertainment(){
        mainPage().getEntertainment();
    }
    @Test
    public void testFashion(){
        mainPage().getFashion();
    }
    @Test
    public void testLiving(){
        mainPage().getLiving();
    }
    @Test
    public void testMedia(){
        mainPage().getMedia();
    }
    @Test
    public void testTech(){
        mainPage().getTech();
    }
    @Test
    public void testRealEstate(){
        mainPage().getRealEstate();
    }
    @Test
    public void testPhotos(){
        mainPage().getPhotots();
    }
    @Test
    public void testVideo(){
        mainPage().getVideo();
    }
    @Test
    public void getAbout(){
        mainPage().getAbout();
    }
}
