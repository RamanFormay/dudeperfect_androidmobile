package dudeperfect;

import dudeperfect.pageObjects.BirthdayScreenPage;
import dudeperfect.pageObjects.ShortsPlayerScreenPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testUtils.BaseTest;

public class dpMobile_ShortsPlayerScreen extends BaseTest {

    BirthdayScreenPage birthdayScreenPage;
    ShortsPlayerScreenPage shortsPlayerScreenPage;
    dpMobile_BirthdayScreen birthdayScreenFlow;

    @BeforeMethod
    public void PreSetup() throws InterruptedException {
        birthdayScreenPage = new BirthdayScreenPage(driver);
        shortsPlayerScreenPage = new ShortsPlayerScreenPage(driver);
        birthdayScreenFlow = new dpMobile_BirthdayScreen();

    }

    @Test (priority = 1)
    public void ShortsPlayerTextValidation() throws InterruptedException {
        birthdayScreenFlow.BirthdayScreen_PositiveFlowValidation();
        Assert.assertTrue(shortsPlayerScreenPage.searchButton());
        Assert.assertTrue(shortsPlayerScreenPage.shortsTitle());
        Assert.assertTrue(shortsPlayerScreenPage.poundButton());
        Assert.assertTrue(shortsPlayerScreenPage.homeButton());
        Assert.assertEquals(shortsPlayerScreenPage.homeButtonText(), "Home");
        Assert.assertTrue(shortsPlayerScreenPage.shortsButton());
        Assert.assertEquals(shortsPlayerScreenPage.shortsButtonText(), "Shorts");
        Assert.assertTrue(shortsPlayerScreenPage.profileButton());
        Assert.assertEquals(shortsPlayerScreenPage.profileButtonText(), "Profile");
    }


}
