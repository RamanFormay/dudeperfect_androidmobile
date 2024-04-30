package dudeperfect.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShortsPlayerScreenPage {
    AndroidDriver driver;

    public ShortsPlayerScreenPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "tv.kidoodle.android.dudeperfect:id/searchBtn")
    private WebElement searchIcon;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/videoTitle")
    private WebElement shortsVideoTitle;

    @AndroidFindBy(id ="tv.kidoodle.android.dudeperfect:id/poundBtn")
    private WebElement poundIcon;

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

    public boolean searchButton(){
        return searchIcon.isDisplayed();
    }
    public boolean shortsTitle(){
        return shortsVideoTitle.isDisplayed();
    }
    public boolean poundButton(){
        return poundIcon.isDisplayed();
    }
    public void clickPoundButton(){
        poundIcon.click();
    }
    public boolean homeButton(){
        return homeIcon.isDisplayed();
    }
    public String homeButtonText(){
        return homeText.getText();
    }
    public boolean shortsButton(){
        return shortsIcon.isDisplayed();
    }
    public String shortsButtonText(){
        return shortsText.getText();
    }
    public boolean profileButton(){
        return profileIcon.isDisplayed();
    }
    public String profileButtonText(){
        return profileText.getText();
    }

}