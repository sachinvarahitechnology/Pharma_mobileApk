package pages;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class saved_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public saved_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in saved_pharma :-- " + driver);
	}

	private By companies = By.xpath("//android.widget.TextView[@text='Companies']");
	private By news = By.xpath("//android.widget.TextView[@text='News']");
	private By event = By.xpath("//android.widget.TextView[@text='Events']");
	private By blog = By.xpath("//android.widget.TextView[@text='Blogs']");
	private By jobs = By.xpath("//android.widget.TextView[@text='Jobs']");

	private By saved_company = By.xpath("//android.view.View[@index='0']");
	private By saved_news = By.xpath("//android.view.View[@index='1']");
	private By saved_event = By.xpath("android.widget.TextView[@index='0']");
	private By saved_blog = By.xpath("android.widget.TextView[@index='0']");

	public void click_on_companies() {
		driver.findElement(companies).click();
	}

	public void click_on_saved_news() {
		driver.findElement(news).click();
	}
	public void verify_save_news_list() {
		 
		List<MobileElement> ss = driver.findElements(saved_news);

		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getText());
		}
	}

	public void click_on_saved_events() {
		driver.findElement(event).click();
	}
	
	
	public void verify_save_blog_list() {
		 List<MobileElement> ss= driver.findElements(saved_blog);
		 
		 for(int i=0; i<ss.size(); i++) {
			 System.out.println("blog list :"+ss.get(i).getText());
		 }
	}
	
	
	public void verify_save_job_list() {
	     
	}
	
	
	public void click_on_saved_blogs() {
		driver.findElement(blog).click();
	}
	
	public void verify_save_event_list() {
		 
		 String ss= driver.findElement(saved_event).getText();
		 System.out.println("saved event name :"+ss);
	}

	public void click_on_saved_jobs() {
		driver.findElement(jobs).click();
	}

	public void verify_save_companies() {
		List<MobileElement> ss = driver.findElements(saved_company);

		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getText());
		}
	}

	

}
