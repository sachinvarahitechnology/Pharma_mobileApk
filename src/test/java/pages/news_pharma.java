package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import login_stepdef.homepagestepdef;

public class news_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public news_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in news_pharma :-- " + driver);
	}

	String newstitle = "";

	private By allcategory = By.xpath("//android.view.View[@index='1']");
	private By save_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By share_icon = By.xpath("//android.widget.Image[@text='Share']");
	private By search_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By search_bytitle = By.xpath("//android.widget.EditText[@index='1']");
	private By search_bycat = By.xpath("//android.widget.EditText[@index='5']");
	private By confirm_button = By.xpath("//android.widget.Button[@text='Confirm']");
	
	private By policycategory = By.xpath("//android.widget.TextView[@text='POLICY / REGULATIONS']");
	private By clickablenews = By.xpath(
			"//android.widget.TextView[@text='WHO launches online repository of evidence-informed decision-making tools']");
	private By news = By.xpath("//android.widget.TextView[@text='WHO launches online repository of evidence-informed decision-making tools']");
	
	private By time = By.xpath("//android.widget.TextView[@text='Pharmaclick Bureau, Mumbai 3 Days ago ']");

	
	public void click_on_any_news() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(policycategory).click();
		Thread.sleep(12000);
		MobileElement ss= driver.findElement(news);
	 
		String newstitle = ss.getText();
		ss.click();	
		Thread.sleep(4000);
	}

	public void visible_with_time() {
	 System.out.println("new visible that time :" + driver.findElement(time).getText());
	}
	
	 

	public void todaynews_is_scroll() {

		Dimension size = driver.manage().window().getSize();
		int screenWidth = size.getWidth();
		int screenHeight = size.getHeight();

		int startX = screenWidth / 2;
		int startY = (int) (screenHeight * 0.6); // increase go deeper
		int endY = (int) (screenHeight * 0.4);

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(startX, endY))
				.release().perform();
	}
	
	public void validate_save_functioanlity() {
		 driver.findElement(save_icon).click();
	}
	
	public void select_category_and_click_it() {
		
	      List<MobileElement> ss= driver.findElements(allcategory);
	      System.out.println( "size "+ ss.size());
	      for(int i=0; i<ss.size(); i++) {
	 	    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    	ss.get(i).click();
	    	System.out.println(ss.get(i).getText());
	      }
	}
	public void click_search_icon() {
		 driver.findElement(search_icon).click();
	}
	
	public void validate_search_functioanlity() {
		 driver.findElement(search_bytitle).sendKeys("lupin");
		 driver.findElement(confirm_button).click();
	}
	
	public void validate_search_functioanlity_by_category_name() {
		 driver.findElement(search_bycat).sendKeys("corporate");
		 driver.findElement(confirm_button).click();
	}
	
	
	public void validate_share_functioanlity() {
		driver.findElement(share_icon).click();
	}

	public void validate_click_news_is_open_or_not() {
		
		String clickblenewstitle = driver.findElement(clickablenews).getText();
		System.out.println("after clickable newstitile :" + clickblenewstitle);
		 
	}
}
