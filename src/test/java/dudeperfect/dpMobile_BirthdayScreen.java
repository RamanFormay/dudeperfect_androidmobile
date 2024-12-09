package dudeperfect;


import dudeperfect.pageObjects.BirthdayScreenPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class dpMobile_BirthdayScreen extends BaseTest{

    BirthdayScreenPage birthdayScreenPage;
    @BeforeMethod
    public void PreSetup() throws InterruptedException {
        birthdayScreenPage = new BirthdayScreenPage(driver);
    }

    @Test(priority=1)
    public void BirthdayScreen_TextValidations() {
        Assert.assertEquals(birthdayScreenPage.getBirthdayTitle(), "WHAT IS YOUR \n" +
                "BIRTHDAY? ");
        Assert.assertEquals(birthdayScreenPage.getInputBoxText(), "DATE");
        Assert.assertEquals(birthdayScreenPage.getHintText(),"Enter your birthdate" );
        Assert.assertEquals(birthdayScreenPage.getPrivacyPolicy(),"I agree to the Privacy Policy, \n" +
                "Terms and Conditions & accept cookies.");
        Assert.assertEquals(birthdayScreenPage.getContinueButtonText(), "CONTINUE");
        Assert.assertFalse(birthdayScreenPage.continueButton());
    }

    @Test(priority=2)
    public void BirthdayScreen_ErrorTextValidation(){
       birthdayScreenPage.clickContinueButton();
        Assert.assertEquals(birthdayScreenPage.getErrorHintText(), "Please enter your birthdate");
        Assert.assertEquals(birthdayScreenPage.getTosErrorText(),"This field is required");
    }

    @Test(priority=3)
    public void BirthdayScreen_ErrorTextValidation_2(){
        birthdayScreenPage.selectCheckbox();
        birthdayScreenPage.clickContinueButton();
        Assert.assertEquals(birthdayScreenPage.getErrorHintText(), "Please enter your birthdate");

    }

    @Test(priority=4)
    public void BirthdayScreen_PositiveFlowValidation() throws InterruptedException {
        birthdayScreenPage = new BirthdayScreenPage(driver);
        birthdayScreenPage.clickInputBox();
        String todayDate=birthdayScreenPage.getTodayDate();
        birthdayScreenPage.selectDate(todayDate);
        birthdayScreenPage.clickOkButton();
        birthdayScreenPage.selectCheckbox();
        birthdayScreenPage.clickContinueButton();

    }
}
