package dudeperfect.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
/**/
public class HomeScreenPage {
    AndroidDriver driver;
    public HomeScreenPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//    Header
    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/ivtitle")
    private WebElement headerTitle;

    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    private  WebElement searchIcon;

//    Main
    @AndroidFindBy(id= "tv.kidoodle.android.dudeperfect:id/categoryName")
    private  WebElement bannerTitle;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/watchNowBtn")
    private WebElement watchNow;
//    Footer
}
