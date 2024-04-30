package dudeperfect.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShortsPlayerScreenPage {
    AndroidDriver driver;

    public ShortsPlayerScreenPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "tv.kidoodle.android.dudeperfect:id/searchBtn")
    private WebElement searchButton;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/videoTitle")
    private WebElement videoTitle;

    @AndroidFindBy(id ="tv.kidoodle.android.dudeperfect:id/poundBtn")
    private WebElement poundButton;

    @AndroidFindBy(id ="tv.kidoodle.android.dudeperfect:id/bottomNavigationView")
    private WebElement bottomNavMenu;

    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemIcon\"])[1]")
    private WebElement homeIcon;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemText\" and @text=\"Home\"]")
    private WebElement homeText;

    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemIcon\"])[2]")
    private WebElement shortsIcon;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemText\" and @text=\"Shorts\"]")
    private WebElement shortsText;

    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemIcon\"])[3]")
    private WebElement profileIcon;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"tv.kidoodle.android.dudeperfect:id/navbarItemText\" and @text=\"Profile\"]")
    private WebElement profileText;
}