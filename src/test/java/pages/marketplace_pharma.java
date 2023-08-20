package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;
import login_stepdef.homepagestepdef;

public class marketplace_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public marketplace_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in marketplace pharma :-- " + driver);
	}

	private By excipientscategory = By.xpath("//android.widget.EditText[@text='Excipients']");
	private By sortby = By.xpath("//android.view.View[@text='Company']");
	private By allcategory = By.xpath("//android.widget.EditText[@index='0']");
	private By featurecompany = By.className("android.widget.Image");
	private By sortproduct = By.xpath("//android.widget.CheckedTextView[@text='Products']");
	private By openfeaturcmpny = By.xpath("//android.widget.TextView[@index='5']");
	private By Anycompany = By.xpath("//android.view.View[@index='0']");
	private By mailicon = By.xpath("(//android.view.View[@index='4'])[1]");
	private By chaticon = By.xpath("//android.widget.Image[@text='Chat with us']");
	private By alpha_M = By.xpath("//android.widget.TextView[@text='M']");
	private By search_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By search_com = By.xpath("//android.widget.EditText[@index='1']");
	private By search_byproduct = By.xpath("//android.widget.EditText[@index='3']");
	private By search_bylocation = By.xpath("//android.widget.EditText[@index='5']");
	private By conform_button = By.xpath("//android.widget.Button[@text='Confirm']");
	private By save_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By rateUS_icon = By.xpath("//android.widget.TextView[@index='1']");
	private By submit_button = By.xpath("//android.widget.Button[@text='Submit']");

	public void user_on_marketplace_page() {
		homepage.user_on_login_page_login();
		homepage.click_on_marketplace();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void validate_search_functionality() {
		driver.findElement(search_com).sendKeys("shreenath");
		driver.findElement(conform_button).click();
	}

	public void click_on_every_category() throws InterruptedException {

		Thread.sleep(3000);
		List<MobileElement> allcategories = driver.findElements(allcategory);
		System.out.println("size :" + allcategories.size());

		System.out.println("All category " + driver.findElement(allcategory).getText());

		for (int i = 0; i < allcategories.size(); i++) {

			System.out.println("allcategories " + allcategories.size());

			System.out.println("all :" + allcategories.get(i).getText());
			allcategories.get(i).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

		}
	}
	
	public void validate_search_functionality_by_product_name() {
		driver.findElement(search_byproduct).sendKeys("Ajwain Oil");
		driver.findElement(conform_button).click();
	}
	
	public void validate_save_functionlity() {
		driver.findElement(save_icon).click();
	}
	
	public void validate_search_functionality_by_location() {
		driver.findElement(search_bylocation).sendKeys("mumbai");
		driver.findElement(conform_button).click();
	}

	public void click_on_any_category() {
		driver.findElement(excipientscategory).click();
	}

	public void click_on_search() {
		driver.findElement(search_icon).click();
	}

	public void click_on_any_company() throws InterruptedException {
		Thread.sleep(3000);
		List<MobileElement> ss = driver.findElements(Anycompany);
		System.out.println("no of companies present : " + ss.size());
		for (int i = 0; i < ss.size(); i++) {

			ss.get(1).click();
		}
	}

	public void verify_sort_by_functionality() {
		driver.findElement(sortby).click();
		driver.findElement(sortproduct).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		String product = driver.findElement(By.xpath("//android.widget.TextView[@text='PRODUCTS']")).getText();
		AssertJUnit.assertEquals(product, "PRODUCTS");
	}
	
	public void verify_rate_functionality() {
		driver.findElement(rateUS_icon).click();
		driver.findElement(submit_button).click();	
	}

	public void click_on_any_feature_company() throws InterruptedException {

		Thread.sleep(5000);
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

		driver.findElement(featurecompany).click();
	}

	public void validate_mail_functionality() {
		driver.findElement(mailicon).click();
	}

	public void validate_chat_functionality() {
		driver.findElement(chaticon).click();
	}

	public void validate_as_per_alphabet_product_is_coming_or_not() {

		driver.findElement(alpha_M).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String M = driver.findElement(By.xpath("//android.widget.TextView[@text='Macadamia Nut Oil ']")).getText();
		// String s= (String) M.subSequence(0, 1);
		// System.out.println(s);
		boolean ss = M.startsWith("M");

		Assert.assertEquals(true, ss);
	}

	public void validate_did_the_one_clicked_open() {
		String text = driver.findElement(openfeaturcmpny).getText();
		System.out.println("clickable feature company is open :" + text);
	}
}
