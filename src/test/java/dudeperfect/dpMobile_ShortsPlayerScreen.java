package dudeperfect;

import dudeperfect.pageObjects.BirthdayScreenPage;
import dudeperfect.pageObjects.ShortsPlayerScreenPage;
import dudeperfect.pageObjects.SplashScreenPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dpMobile_ShortsPlayerScreen extends BaseTest{

    BirthdayScreenPage birthdayScreenPage;
    ShortsPlayerScreenPage shortsPlayerScreen;
    dpMobile_BirthdayScreen birthdayScreenFlow;

    @BeforeMethod
    public void PreSetup() throws InterruptedException {
        birthdayScreenPage = new BirthdayScreenPage(driver);
        shortsPlayerScreen = new ShortsPlayerScreenPage(driver);
        birthdayScreenFlow = new dpMobile_BirthdayScreen();

    }

    @Test
    public void ShortsPlayerTextValidation() throws InterruptedException {
        birthdayScreenFlow.BirthdayScreen_PositiveFlowValidation();
        Assert.assertTrue(shortsPlayerScreen.searchButton());
        Assert.assertTrue(shortsPlayerScreen.shortsTitle());
        Assert.assertTrue(shortsPlayerScreen.poundButton());
//        Assert.assertTrue(shortsPlayerScreen.homeButton());
        Assert.assertEquals(shortsPlayerScreen.homeButtonText(), "Home");
//        Assert.assertTrue(shortsPlayerScreen.shortsButton());
        Assert.assertEquals(shortsPlayerScreen.shortsButtonText(), "Shorts");
//        Assert.assertTrue(shortsPlayerScreen.profileButton());
        Assert.assertEquals(shortsPlayerScreen.profileButtonText(), "Profile");

    }
}
