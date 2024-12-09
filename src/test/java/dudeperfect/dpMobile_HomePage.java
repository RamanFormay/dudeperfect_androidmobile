package dudeperfect;

import dudeperfect.pageObjects.BirthdayScreenPage;
import dudeperfect.pageObjects.ShortsPlayerScreenPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testUtils.BaseTest;

public class dpMobile_HomePage extends BaseTest {

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
    public void HeaderTabValidation() throws InterruptedException {
        birthdayScreenFlow.BirthdayScreen_PositiveFlowValidation();
        shortsPlayerScreen.clickHomeButton();
        Thread.sleep(10000);
    }

}
