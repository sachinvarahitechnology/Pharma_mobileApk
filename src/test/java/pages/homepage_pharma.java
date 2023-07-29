package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

 

public class homepage_pharma  {
	
	   
	private static AppiumDriver driver;
	 
	
	private By homepagemarketplace = By.xpath("//android.view.View[@text='marketplace']");
	private By marketplace = By.xpath("//android.widget.TextView[@text='MARKETPLACE']");
	
	 
	 
//	public static void main(String[] args) {
//		homepage_pharma home=new homepage_pharma();
//		 
//		
//	}
//	
	//public void launch() {

//		try {
//			// Set the Appium server URL
//			URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");
//
//			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "4d59fb4e");
//			desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Pappya\\Downloads\\app-debug.apk");
//			desiredCapabilities.setCapability("appPackage", "io.cordova.pharmaClick");
//			desiredCapabilities.setCapability("appActivity", "io.cordova.pharmaClick.MainActivity");
//			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//
//			driver = new AndroidDriver<MobileElement>(appiumServerUrl, desiredCapabilities);
//
//			System.out.println("Application is starting............. ");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	//}
	
	public void click_on_marketplace() {
		
		 driver.findElement(homepagemarketplace).click();
	}
	
	public void verify_feature_is_open() {
		 String markettext= driver.findElement(marketplace).getText();
		 AssertJUnit.assertEquals(markettext,"MARKETPLACE");
	}

}
