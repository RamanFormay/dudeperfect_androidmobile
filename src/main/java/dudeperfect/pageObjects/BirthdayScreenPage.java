


package dudeperfect.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BirthdayScreenPage {
    AndroidDriver driver;
    Date date;
    public BirthdayScreenPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
         date = new Date();

    }
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    String currentDate = dateFormat.format(date);
    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/title")
    private WebElement birthdayTitleText;

    @AndroidFindBy (id="tv.kidoodle.android.dudeperfect:id/birthEdittext")
    private WebElement inputField;

    @AndroidFindBy (xpath="//android.widget.LinearLayout[@resource-id=\"android:id/parentPanel\"]")
    private WebElement dateModal;


    @AndroidFindBy (xpath="//android.view.View[@content-desc=\"29 April 2024\"]")
    private WebElement dateSelection;

    @AndroidFindBy (xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
    private WebElement okModalButton;

    @AndroidFindBy (xpath="//android.widget.Button[@resource-id=\"android:id/button2\"]")
    private WebElement cancelModalButton;

    @AndroidFindBy (id="tv.kidoodle.android.dudeperfect:id/edittextHint")
    private WebElement textHint;

    @AndroidFindBy (id="tv.kidoodle.android.dudeperfect:id/edittextError")
    private WebElement errorTextHint;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/checkBox")
    private WebElement checkboxSelection;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/textview1")
    private WebElement tosText1;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/privacyPolicyHyperlink")
    private WebElement tosText2;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/textview3")
    private WebElement tosText3;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/textview4")
    private WebElement tosText4;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/switchError")
    private WebElement tosError;

    @AndroidFindBy(id="tv.kidoodle.android.dudeperfect:id/confirmButton")
    private WebElement continueButton;

    public String getBirthdayTitle(){
        return birthdayTitleText.getText();
    }

    public String getInputBoxText(){
        return inputField.getText();
    }
    public void clickInputBox(){
        inputField.click();
    }
    public Boolean dateModalOpened(){
        return dateModal.isEnabled();
    }

//    public String getTodayDate(){
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
//        return dateFormat.format(date);
//
//    }
    public void selectDate(){
        dateSelection.click();
    }
    public void clickOkButton(){
        okModalButton.click();
    }
    public void clickCancelButton(){
        cancelModalButton.click();
    }

    public String getHintText(){
        return textHint.getText();
    }
    public String getErrorHintText(){
        return errorTextHint.getText();
    }
    public String getPrivacyPolicy(){
        return tosText1.getText()+" "+tosText2.getText()+" "+"\n"+tosText3.getText()+" "+tosText4.getText();
    }
    public String getTosErrorText(){
        return tosError.getText();
    }
    public String getContinueButtonText(){
        return continueButton.getText();
    }

    public boolean continueButton(){
        return continueButton.isEnabled();
    }

    public void selectCheckbox(){
        checkboxSelection.click();
    }

    public void clickContinueButton(){
        continueButton.click();
    }
}



