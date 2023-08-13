package pages;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login_stepdef.homepagestepdef;

public class blog_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public blog_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in blog_pharma :-- " + driver);
	}

	private By firstblog = By.xpath("//android.widget.TextView[@index='0']");
	private By openblog = By.xpath("//android.widget.TextView[@index='8']");
	private By afterclickauthorname = By.xpath("//android.widget.TextView[@text='admin@mystore.com']");
	private By writeblogbutton = By.xpath("//android.widget.Button[@text='Write Blogs']");
	private By sendlinkbutton = By.xpath("//android.widget.Button[@text='Send Link']");
	private By searchicon = By.xpath("//android.widget.TextView[@index='3']");
	private By searchbox = By.xpath("//android.widget.EditText[@index='1']");
	private By search_submit_button = By.xpath("//android.widget.Button[@text='Confirm']");
	private By search_list_blog = By.xpath("//android.widget.TextView[@index='1']");
	private By internal_save = By.xpath("//android.widget.TextView[@index='3']");
	private By internal_share = By.xpath("//android.widget.Image[@text='Share']");
	private By authorname = By.xpath("//android.widget.TextView[@text='admin@mystore.com']");
	private By about_blogger = By.xpath("//android.widget.TextView[@text='About Blogger']");
	private By reads = By.xpath("//android.widget.TextView[@text='Reads']");
	

	public void click_on_any_blog() {

		List<MobileElement> blogs = driver.findElements(firstblog);
		// System.out.println("size of total blog :"+ blogs.size());

		for (int i = 1; i < blogs.size(); i++) {
			System.out.println("Before clicking on blog author name :" + blogs.get(2).getText());
			blogs.get(2).click();
			break;
		}
	}

	public void varify_click_blog_is_open() {
		System.out.println("open blog name :" + driver.findElement(openblog).getText());
	}

	public void find_by_search_function() {
		driver.findElement(searchicon).click();
		driver.findElement(searchbox).sendKeys("lipid");
		driver.findElement(search_submit_button).click();

	}
	public void validate_reads_of_author() {
		 driver.findElement(reads).click();
	}
	 
	public void click_on_author_name() {
		 driver.findElement(authorname).click();
	}

	 
	public void velidate_about_blogger() {
		driver.findElement(about_blogger).click();
	}

	public void varify_author_name_after_clicking() {
		System.out.println("after clicking on blog author name :" + driver.findElement(afterclickauthorname));
	}

	public void click_on_write_blog() {
		driver.findElement(writeblogbutton).click();
	}

	public void varify_link_send_or_not() {
		driver.findElement(sendlinkbutton).click();
	}

	public void verify_save_functionality() {
		List<MobileElement> ss = driver.findElements(internal_save);
		System.out.println(ss.size());
		ss.get(0).click();

	}

	public void verify_share_functionality() {
		driver.findElement(internal_share).click();
	}

	public void validate_as_per_search() {
		List<MobileElement> list = driver.findElements(search_list_blog);
		System.out.println("size " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("blog search by title :" + list.get(2).getText());
		}
	}

}
