package pages;

import java.util.List;

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
	private By get_company_Box = By.xpath("//android.widget.TextView[@index='3']");
	private By get_education = By.xpath("//android.widget.TextView[@index='5']");
	private By Education = By.xpath("//android.widget.EditText[@index='5']");

	public void enter_valid_number() throws InterruptedException {
		Thread.sleep(3000);
		List<MobileElement> ss = driver.findElements(edit_icon);

		System.out.println(ss.size() + "  size of the elemetn");
		for (int i = 0; i < ss.size(); i++) {

			System.out.println("elemt" + ss.get(i).getText());
			ss.get(2).click(); // 01234

		}
		Thread.sleep(2000);
		driver.findElement(Phone_nu_box).clear();
		Thread.sleep(2000);
		driver.findElement(Phone_nu_box).sendKeys("95856895552");
//		 
//		 
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
		Thread.sleep(2000);
		List<MobileElement> ss = driver.findElements(edit_icon);

		System.out.println(ss.size() + "  size of the element");
		for (int i = 0; i < ss.size(); i++) {

			System.out.println("element" + ss.get(i).getText());
			 ss.get(2).click(); //01234

		}
		Thread.sleep(2000);
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
	
	public void enter_education() throws InterruptedException {
		Thread.sleep(2000);
		List<MobileElement> ss = driver.findElements(edit_icon);

		System.out.println(ss.size() + "  size of the element");
		for (int i = 0; i < ss.size(); i++) {

			System.out.println("element" + ss.get(i).getText());
			 ss.get(2).click(); //01234

		}
		Thread.sleep(2000);
		driver.findElement(Education).clear();
		Thread.sleep(2000);
		driver.findElement(Education).sendKeys("BBBB");
		
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
		Thread.sleep(2000);
		List<MobileElement> ss = driver.findElements(edit_icon);

		System.out.println(ss.size() + "  size of the element");
		for (int i = 0; i < ss.size(); i++) {

			System.out.println("element" + ss.get(i).getText());
			 ss.get(2).click(); //01234

		}
		Thread.sleep(2000);
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
		
		List<MobileElement> ss = driver.findElements(get_company_Box);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {

			System.out.println("founded element in the compnay  box" + ss.get(i).getText());
		}
		 
	
	}
	
	public void verify_education() {
		List<MobileElement> ss = driver.findElements(get_education);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {

			System.out.println("founded element in the education  box" + ss.get(i).getText());
		}
	}

	public void verify_position() {
		List<MobileElement> ss = driver.findElements(get_company_Box);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {

			System.out.println("founded element in the positioin  box" + ss.get(0).getText());
		}
		 
	}

	public void verify_number_is_correct() {
		List<MobileElement> ss = driver.findElements(Phone_nu_box);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {

			System.out.println("founded element in the phone box" + ss.get(i).getText());
		}
	}
}
