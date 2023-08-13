package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import login_stepdef.homepagestepdef;

public class myaccount_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public myaccount_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in myaccount_pharma :-- " + driver);
	}
	
	private By edit_icon = By.xpath("//android.widget.TextView[@index='0']");
	private By Phone_nu_box = By.xpath("//android.widget.EditText[@index='4']");
	private By update_button = By.xpath("//android.widget.Button[@text='Update']");
	private By position_box = By.xpath("//android.widget.EditText[@index='1']");
	private By company_name = By.xpath("//android.widget.EditText[@index='3']");
	
	public void enter_valid_number() throws InterruptedException {
		
		 driver.findElement(edit_icon).click();
		 driver.findElement(Phone_nu_box).clear();
		 Thread.sleep(2000);
		 driver.findElement(Phone_nu_box).sendKeys("95856895552");
		 
		 
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
			driver.findElement(update_button).click();
		 
	}
	
	public void enter_position() throws InterruptedException {
		driver.findElement(edit_icon).click();
		driver.findElement(position_box).clear();
		Thread.sleep(2000);
		driver.findElement(position_box).sendKeys("QA");
		
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
		driver.findElement(update_button).click();
	}
	
	public void enter_company_name() throws InterruptedException {
		driver.findElement(edit_icon).click();
		driver.findElement(company_name).clear();
		Thread.sleep(2000);
		driver.findElement(company_name).sendKeys("QA");
		
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
		driver.findElement(update_button).click();
		
	}
	
	public void verify_company_name() {
		 System.out.println(driver.findElement(company_name).getText());
	}
	
	public void verify_position() {
		 System.out.println(driver.findElement(position_box).getText());
	}
	
	public void verify_number_is_correct() {
		  System.out.println( driver.findElement(Phone_nu_box).getText());
	}
}
