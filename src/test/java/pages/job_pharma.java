package pages;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class job_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();
	String sss = "";

	public job_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in job_pharma :-- " + driver);
	}

	private By filter_icon = By.xpath("//android.widget.TextView[@index='0']");
	private By filter_2_3 = By.xpath("//android.view.View[@index='2']");
	private By any_job = By.xpath("//android.widget.TextView[@index='0']");
	private By rating_icon = By.xpath("//android.widget.TextView[@index='0']");
	private By rating_submit_icon = By.xpath("//android.widget.Button[@text='Submit']");
	private By review  = By.xpath("//android.widget.TextView[@text='Reviews']");
	private By apply_button = By.xpath("//android.widget.Button[@text='Apply']");
	private By after_filter = By.xpath("//android.widget.TextView[@index='0']");
	private By share_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By save_icon = By.xpath("//android.widget.TextView[@text='']");

	public void click_on_any_filter_and_put() {
		List<MobileElement> ss = driver.findElements(filter_icon);

		System.out.println("size " + ss.size());

		for (int i = 0; i < ss.size(); i++) {
			ss.get(i);
			ss.get(2).click();
		}
		driver.findElement(filter_2_3).click();
		driver.findElement(apply_button).click();
	}

	public void click_on_save_icon() {
		driver.findElement(save_icon).click();
	}

	public void click_on_any_job() {
		List<MobileElement> ss = driver.findElements(any_job);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(4).getText());
			ss.get(4).click();
			break;
		}
	}

	public void verify_rating_functionality() {
		List<MobileElement> ss = driver.findElements(rating_icon);

		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {
			// System.out.println(ss.get(i).getText());
			ss.get(1).click();
		}
		driver.findElement(rating_submit_icon).click();
	}

	public void verify_review_functionality() {
		  driver.findElement(review).click();
		  	
		 
	}

	public void click_on_internal_save_icon() {
		driver.findElement(save_icon).click();
	}

	public void click_on_share_icon() {
		List<MobileElement> ss = driver.findElements(share_icon);
		System.out.println(ss.size() + " size ");

		for (int i = 0; i < ss.size(); i++) {
			System.out.println("element" + ss.get(i));
			ss.get(1).click();
		}
	}

	public void varify_result_as_per_filter() {
		List<MobileElement> ss = driver.findElements(after_filter);
		System.out.println("ss" + ss.size());

		for (int i = 0; i < ss.size(); i++) {
			System.out.println("after using filter get this :" + ss.get(i).getText());
		}

	}

}
