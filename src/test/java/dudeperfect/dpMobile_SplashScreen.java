package dudeperfect;

import dudeperfect.pageObjects.SplashScreenPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testUtils.BaseTest;

public class dpMobile_SplashScreen extends BaseTest {

    SplashScreenPage splashScreenPage;

    @Test
    public void SplashScreenValidation() throws InterruptedException {
        splashScreenPage = new SplashScreenPage(driver);
        Assert.assertTrue(splashScreenPage.dpLogoDisplayed());
        Assert.assertTrue(splashScreenPage.loadingTextDisplayed());
        Thread.sleep(2000);
    }
}
