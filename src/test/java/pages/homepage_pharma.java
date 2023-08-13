package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

 

public class homepage_pharma  {
	
	private static AppiumDriver<MobileElement> driver;
	
	public homepage_pharma(AppiumDriver<MobileElement> driver) {
		 this.driver=driver;
	}	 
	
	private By homepagemarketplace = By.xpath("//android.view.View[@text='Marketplace']");
	private By marketplace = By.xpath("//android.widget.TextView[@text='MARKETPLACE']");
	private By event = By.xpath("//android.view.View[@text='Events']");
	private By internalevent = By.xpath("//android.view.View[@index='3']");
	private By news = By.xpath("//android.view.View[@text='News']");
	private By todaynews = By.xpath("//android.widget.TextView[@text='TODAY'S NEWS']");
	private By blogs = By.xpath("//android.view.View[@text=' Blogs']");
	private By blogtext = By.xpath("//android.widget.TextView[@text='BLOGS']");
	private By jobs = By.xpath("//android.view.View[@index='4']");
	private By jobtext = By.xpath("//android.widget.TextView[@text='JOBS']");
	private By menu = By.xpath("//android.widget.TextView[@index='1']");
	 
	private By menutext = By.xpath("//android.widget.TextView[@text='My Account']");
	
	
	public void click_on_marketplace() {
		//System.out.println("driver value: " +driver  );
		driver.findElement(homepagemarketplace).click();
	}
	
	public void click_on_event() {
		 driver.findElement(event).click();
	 }
	
	public void click_on_news() {
	     driver.findElement(news).click();
	}
	
	public void verify_feature_is_open() {
		 String markettext= driver.findElement(marketplace).getText();
		 AssertJUnit.assertEquals(markettext,"MARKETPLACE");
	}
	
	public void click_on_blogs() {
		 driver.findElement(blogs).click();
	}
	
	public void verify_blogs_feature_is_open() {
		String text= driver.findElement(blogtext).getText();
		 AssertJUnit.assertEquals(text,"BLOGS");
	}
	
	public void click_on_jobs() {
	     driver.findElement(jobs).click();
	}
	
	public void verify_job_feature_is_open() {
		String text= driver.findElement(jobtext).getText();
		 AssertJUnit.assertEquals(text,"JOBS");
	}
	
	public void verify_event_feature_is_open() {
		 String text= driver.findElement(internalevent).getText();
		 System.out.println(text);
	}
	
	public void click_on_menu() {
				
		 List<MobileElement >ss = driver.findElements(menu);
		 System.out.println(ss.size());
		 for(int i=0; i<ss.size(); i++) {
			 System.out.println("elemt of ss :"+ ss.get(i).getText());
			 ss.get(0).click();		  
		 }
		 
	}
	
	public void verify_menu_feature_is_open() {
		 String ss= driver.findElement(menutext).getText();
		 AssertJUnit.assertEquals("My Account", ss);
	}

	public void verify_news_feature_is_open() {
		String text= driver.findElement(internalevent).getText();
	}
}
