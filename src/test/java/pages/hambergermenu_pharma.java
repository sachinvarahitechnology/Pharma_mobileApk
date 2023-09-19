package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import login_stepdef.homepagestepdef;

public class hambergermenu_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public hambergermenu_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in hambergermenu_pharma :-- " + driver);
	}

	private By rated_compnaies = By.xpath("//android.widget.TextView[@text='Rated Companies']");
	private By saved_rated_compnaies = By.xpath("//android.widget.TextView[@index='0']");
	private By following = By.xpath("//android.widget.TextView[@text='Following']");
	private By after_click_following = By.xpath("//android.widget.TextView[@index='1']");
	private By setting = By.xpath("//android.widget.TextView[@text='Setting ']");
	private By notification = By.xpath("//android.view.View[@text='Notification']");
	private By change_password = By.xpath("//android.widget.TextView[@text='Change Password']");
	private By new_pass_box = By.xpath("//android.widget.EditText[@index='2']");
	private By change_button = By.xpath("//android.widget.Button[@text='Change']");
	private By alert = By.xpath("//android.widget.TextView[@text='Alert']");
	private By Rate_Us = By.xpath("//android.widget.TextView[@text='Rate Us']");
	private By play_store = By.xpath("//android.widget.TextView[@text='PharmaClick']");
	private By Privacy_policy = By.xpath("//android.widget.TextView[@text='Privacy & policy']");
	private By verify_Privacy_policy = By.xpath("//android.widget.TextView[@text='Privacy Policy']");
	private By help = By.xpath("//android.widget.TextView[@text='Help']");
	private By verify_help = By.xpath("//android.widget.TextView[@text='Help...?']");
	private By contact_us = By.xpath("//android.widget.TextView[@text='Contact Us']");
	private By sign_out = By.xpath("//android.widget.TextView[@text=' Sign Out']");
	private By after_sign_out = By.xpath("//android.view.View[@text='Log in']");

	public void click_on_rate_companies() {
		driver.findElement(rated_compnaies).click();
	}

	public void verify_rate_companies() {
		List<MobileElement> ss = driver.findElements(saved_rated_compnaies);	

		System.out.println(ss.size());
		for (int i = 0; i < ss.size(); i++) {
			System.out.println("rated companies list :" + ss.get(i).getText());
		}
	}

	public void click_on_following() {
		driver.findElement(following).click();
	}

	public void verify_play_store_aap_open_or_not() {
		String ss = driver.findElement(play_store).getText();
		System.out.println(ss);
	}

	public void click_on_privacy_policy() {
		driver.findElement(Privacy_policy).click();
	}

	public void click_on_help() {
		driver.findElement(help).click();
	}

	public void verify_help_page_is_open_or_not() {
		String ss = driver.findElement(verify_help).getText();
		 AssertJUnit.assertEquals(ss, "Help...?");
		 
	}
	public void verify_account_is_signout() {
		String ss = driver.findElement(after_sign_out).getText();
		 AssertJUnit.assertEquals(ss, "Log in");
	}
	
	public void click_on_sign_out() {
		driver.findElement(sign_out).click();
	}

	public void click_on_contact_us() {
		driver.findElement(contact_us).click();
	}

	public void verify_it_is_opne_or_not() {
		String ss = driver.findElement(verify_Privacy_policy).getText();
		System.out.println(ss);
		AssertJUnit.assertEquals(ss, "Privacy Policy");
	}

	public void verify_all_following() {
		List<MobileElement> ss = driver.findElements(after_click_following);

		System.out.println(ss.size());
		for (int i = 0; i < ss.size(); i++) {
			System.out.println("following list :" + ss.get(i).getText());
		}
	}

	public void click_on_change_password() {
		driver.findElement(change_password).click();
	}

	public void verify_change_password_functionality() {
		driver.findElement(new_pass_box).sendKeys("123456@");
		driver.findElement(change_button).click();
	}

	public void click_on_rateus() {
		driver.findElement(Rate_Us).click();
	}

	public void click_on_alert() {
		driver.findElement(alert).click();
	}

	public void click_on_setting() throws InterruptedException {
		driver.findElement(setting).click();

		Dimension size = driver.manage().window().getSize();
		int screenWidth = size.getWidth();
		int screenHeight = size.getHeight();

		int startX = screenWidth / 2;
		int startY = (int) (screenHeight * 0.9); // increase go deeper
		int endY = (int) (screenHeight * 0.1);

		TouchAction touchAction = new TouchAction(driver);

		touchAction.press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(startX, endY))
				.release().perform();

		Thread.sleep(2000);
		int startX1 = screenWidth / 2;
		int startY1 = (int) (screenHeight * 0.9); // increase go deeper
		int endY1 = (int) (screenHeight * 0.1);

		touchAction.press(PointOption.point(startX1, startY1)).waitAction().moveTo(PointOption.point(startX1, endY1))
				.release().perform();
	}

	public void click_on_notification() {
		driver.findElement(notification).click();
	}

}
