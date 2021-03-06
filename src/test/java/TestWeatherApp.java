import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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

        //uncomment below code if you do not wish to use TestObject
        capabilities.setCapability("deviceName", "Lenovo");  //Device name
        capabilities.setCapability(CapabilityType.PLATFORM, "Android");   //Platform
        capabilities.setCapability("platformVersion", "5.1.1");  // Android version
        File file = new File("/home/ankit/IdeaProjects/testApks", "WeatherApp.apk"); //Apk path (don't forget to change the path)
        capabilities.setCapability("app", file.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.weatherapp"); //package name
        capabilities.setCapability("appActivity", "com.weatherapp.controller.activity.MainActivity"); //appActivity
        driver = new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), capabilities); //initialising the AppiumDriver with host url and capabilities


        //To use TestObject
        /*
        capabilities.setCapability("appPackage", "com.weatherapp"); //package name
        capabilities.setCapability("appActivity", "com.weatherapp.controller.activity.MainActivity"); //appActivity
        capabilities.setCapability("testobject_api_key", TEST_OBJECT_API_KEY);
        capabilities.setCapability("testobject_device", TEST_OBJECT_DEVICE);
        driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities); //initialising the AppiumDriver with host url and capabilities
        */

    }

    @After
    public void tearDown() {
        driver.quit(); //quit the driver, after test completion
    }

    //Write your test here
    @Test
    public void testMethod() throws InterruptedException {
        String appPackageName = "com.weatherapp";
        String concatId = ":id/";
        By editTextSearch = By.id(appPackageName + concatId + "editTextSearchCity");
        By imageViewSearch = By.id(appPackageName + concatId + "imgSearch");
        driver.findElement(editTextSearch).sendKeys("pune"); //enter Pune as string in the edit text
        driver.findElement(imageViewSearch).click(); //click event on search image
        Thread.sleep(5000); //hold for 5 seconds after the button is clicked, this is just to see the result
    }
}