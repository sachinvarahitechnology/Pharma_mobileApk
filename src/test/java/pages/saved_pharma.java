package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
	private By saved_company_location_icon = By.xpath("//android.widget.TextView[@index='4']");
	private By share_icon = By.xpath("//android.widget.Image[@text='Share']");
	private By save_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By saved_newsbyway = By.xpath("//android.widget.Image[@text='news']");

	private By saved_company = By.xpath("//android.widget.TextView[@index='0']");
	private By saved_news = By.xpath("//android.view.View[@index='1']");
	private By saved_news_2 = By.xpath("//android.widget.TextView[@index='0']");
	private By saved_event = By.xpath("android.widget.TextView[@index='0']");
	private By saved_blog = By.xpath("android.widget.TextView[@index='0']");
	// private By saved_item = By.xpath("//android.widget.TextView[@text='Saved
	// Items']");
	private By saved_item = By.xpath("//android.widget.TextView[@index='0']");

	public void user_on_save_itempage() throws InterruptedException {
		 Thread.sleep(3000);
		List<MobileElement> ss = driver.findElements(saved_item);

		System.out.println(ss.size());
		for (int i = 0; i < ss.size(); i++) {
			System.out.println("all element : " + ss.get(i).getText());
			ss.get(3).click();
			break;
		}
		Thread.sleep(3000);
	}

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

	public void click_on_save_company() throws InterruptedException {

		Thread.sleep(5000);
		List<MobileElement> ss = driver.findElements(saved_company);

		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(1).getText());
			Thread.sleep(1000);
			ss.get(1).click();
		}

	}

	public void click_on_save_news() throws InterruptedException {
		Thread.sleep(5000);
		List<MobileElement> ss = driver.findElements(saved_news_2);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {

			System.out.println("element after saved item list :" + ss.get(i).getText());
			ss.get(1).click();  //0 1

		}
	}

	public void verify_unsave_functionality() {
		List<MobileElement> ss = driver.findElements(save_icon);
		System.out.println(ss.size());
		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getText());
			ss.get(0).click();
			break;
		}
	}

	public void click_on_saved_events() {
		driver.findElement(event).click();
	}

	public void verify_share_icon_functionality() {

		driver.findElement(share_icon).click();
	}

	public void verify_save_blog_list() {
		List<MobileElement> ss = driver.findElements(saved_blog);

		for (int i = 0; i < ss.size(); i++) {
			System.out.println("blog list :" + ss.get(i).getText());
		}
	}

	public void verify_save_job_list() {

	}

	public void click_on_saved_blogs() {
		driver.findElement(blog).click();
	}

	public void verify_save_event_list() throws InterruptedException {
		 Thread.sleep(4000);
		 List<MobileElement> ss=driver.findElements(saved_event) ;
		//System.out.println("saved event name :" + ss.size());
		
		for(int i=0; i<ss.size(); i++) {
			System.out.println("All saved event :"+ss.get(i).getText());
			//ss.get(i).click();
		}
	}

	public void click_on_saved_jobs() {
		driver.findElement(jobs).click();
	}

	public void verify_save_companies() throws InterruptedException {
		Thread.sleep(5000);
		List<MobileElement> ss = driver.findElements(saved_company);

		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getText());
		}
	}

}
