package utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook {
	
	 
	//private static AppiumDriver<MobileElement> driver;
	private static WebDriver driver;
	
	@Before 
	public void setup() {
		try {
			// Set the Appium server URL
			URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "4d59fb4e");
			desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Pappya\\Downloads\\app-debug.apk");
			desiredCapabilities.setCapability("appPackage", "io.cordova.pharmaClick");
			desiredCapabilities.setCapability("appActivity", "io.cordova.pharmaClick.MainActivity");
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

			driver = new AndroidDriver<MobileElement>(appiumServerUrl, desiredCapabilities);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			System.out.println("Application is starting............. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public  static WebDriver getDriver() {
		
		 return driver;
	}

}
