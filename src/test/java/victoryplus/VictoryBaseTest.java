package victoryplus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class VictoryBaseTest {
        public static AppiumDriverLocalService service;
        public static AndroidDriver driver;

        //    Appium start
        @Test
        public static void open() throws MalformedURLException {

            System.out.println("----------Automation Scripts Started----------");
            service = new AppiumServiceBuilder().usingDriverExecutable(new File("//usr//local//bin//node"))
                    .withIPAddress("127.0.0.1").usingPort(4725).build();
            service.start();
//        setting the desired capabilites
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Raman");
            options.setUdid("emulator-5554");
            options.setPlatformVersion("12");

//        setting the app package and activity
            options.setAppPackage("tv.apmc.android.victorysports");
            options.setAppActivity("tv.kidoodle.android.ui.MainActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4725"), options);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        }

        @AfterClass
        public void teardown(){
            driver.quit();
            service.stop();
        }
    }

