package pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import utility.Hook;

public class login_pharma {

	private static  AppiumDriver<MobileElement> driver;
	 
	private By email = By.xpath("//android.widget.EditText[@resource-id='username']");
	private By pass = By.xpath("//android.widget.EditText[@resource-id='pass']");
	private By signin = By.xpath("//android.widget.Button[@resource-id='id_complete1']");
	private By invalied_idpass = By.xpath("//android.widget.TextView[@text='Invalid UserId And Password']");
	private By termbox = By.xpath("//android.widget.Button[@text='SIGN IN']");
	private By termllink = By.xpath("//android.widget.TextView[@text='Accept Terms & Conditions']");
	private By term_condition = By.xpath("//android.widget.TextView[@text='Terms & Conditions']");
	private By loginwithgoogle = By.xpath("//android.view.View[@text='Login With Google']");
	private By loginterm = By.xpath("//android.widget.Button[@text='I Accept']");
	private By googleaccount = By.id("com.google.android.gms:id/container");
	private By homepage = By.xpath("//android.view.View[@text='Marketplace']");
	private By remeber_button = By.xpath("//android.widget.CheckBox[@resource-id='remember_me']");
	
	 

	public static void main(String[] args) throws MalformedURLException {
		login_pharma login = new login_pharma( );
		login.launch();

	}
	public static  AppiumDriver<MobileElement> getDriver() {
		
		return driver;
	}
	 
	 
	public static   AppiumDriver<MobileElement> launch()  {

		try {
			// Set the Appium server URL
			URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "4d59fb4e");
			desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Pappya\\Downloads\\app-debug (2).apk");
			 
			desiredCapabilities.setCapability("appPackage", "io.cordova.pharmaClick");
			desiredCapabilities.setCapability("appActivity", "io.cordova.pharmaClick.MainActivity");
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

			driver = new AndroidDriver<MobileElement>(appiumServerUrl, desiredCapabilities);
			
			System.out.println("Application is starting............. ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		return driver;
		
	}
	 
	public void user_provide_and(String username, String password) {
		driver.findElement(email).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	}

	public void click_on_button() {
		driver.findElement(signin).click();
	}

	public void click_on_remember_button() {
		driver.findElement(remeber_button).click();
	}

	public void validate_term_link() {
		driver.findElement(termllink).click();
		String text = driver.findElement(term_condition).getText();
		AssertJUnit.assertEquals(text, "Terms & Conditions");
	}

	public void validate_id_is_visible() {
		driver.navigate().back();
		String id=driver.findElement(email).getText();
	}

	public void login_successfully() {
		String hometext = driver.findElement(homepage).getText();
		AssertJUnit.assertEquals(hometext, "Marketplace");
	}

	public void get_error() {
		String error = driver.findElement(invalied_idpass).getText();
		AssertJUnit.assertEquals(error, "Invalid UserId And Password");
	}
}
