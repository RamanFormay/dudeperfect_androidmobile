package dudeperfect.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SplashScreenPage {
    AndroidDriver driver;
    public SplashScreenPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/text")
    private WebElement dpLogo;

    @AndroidFindBy (id="tv.kidoodle.android.dudeperfect:id/loading_text")
    private WebElement loading;

    public boolean dpLogoDisplayed(){
        return dpLogo.isDisplayed();
    }

    public boolean loadingTextDisplayed(){
        return loading.isDisplayed();
    }
}
