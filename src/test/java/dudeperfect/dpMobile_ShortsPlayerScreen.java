package dudeperfect;

import dudeperfect.pageObjects.BirthdayScreenPage;
import dudeperfect.pageObjects.ShortsPlayerScreenPage;
import dudeperfect.pageObjects.SplashScreenPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dpMobile_ShortsPlayerScreen extends BaseTest{

    BirthdayScreenPage birthdayScreenPage;
    SplashScreenPage shortsPlayerScreen;
    dpMobile_BirthdayScreen birthdayScreenFlow;

    @BeforeMethod
    public void PreSetup() throws InterruptedException {
        birthdayScreenPage = new BirthdayScreenPage(driver);
        birthdayScreenFlow = new dpMobile_BirthdayScreen();
        ShortsPlayerScreenPage shortsPlayerScreen;
    }

    @Test
    public void ShortsPlayerTextValidation() throws InterruptedException {
        birthdayScreenFlow.BirthdayScreen_PositiveFlowValidation();

    }
}
