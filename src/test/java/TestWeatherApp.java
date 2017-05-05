import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ankit on 3/10/17.
 */
public class TestWeatherApp {

    private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        //Building desiring capabilities. These are sent to the appium server to install the app on the particular device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Lenovo");  //Device name
        capabilities.setCapability(CapabilityType.PLATFORM, "Android");   //Platform
        capabilities.setCapability("platformVersion", "5.1.1");  // Android version
        File file = new File("/home/ankit/IdeaProjects/testApks", "WeatherApp.apk"); //Apk path (don't forget to change the path)
        capabilities.setCapability("app", file.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.weatherapp"); //package name
        capabilities.setCapability("appActivity", "com.weatherapp.controller.activity.MainActivity"); //appActivity
        driver = new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), capabilities); //initialising the AppiumDriver with host url and capabilities
    }

    @After
    public void tearDown() {
        driver.quit(); //quit the driver, after test completion
    }

    //Write your test here
    @Test
    public void testMethod() throws InterruptedException {

    }
}