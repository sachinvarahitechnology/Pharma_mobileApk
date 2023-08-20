package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import login_stepdef.homepagestepdef;

public class event_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public event_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in event_pharma :-- " + driver);
	}

	private By month_23 = By.xpath("//android.view.View[@index='0']");
	private By clickable_event = By.xpath("//android.widget.TextView[@text='INDIAN PHARMA EXPO NEW DELHI']");
	private By date_time = By.xpath("//android.widget.TextView[@index='0']");
	private By save_internal = By.xpath("//android.widget.TextView[@index='3']");
	private By share_internal = By.xpath("//android.widget.Image[@text='Share']");
	private By search = By.xpath("//android.widget.TextView[@index='3']");
	private By search_box = By.xpath("//android.widget.EditText[@index='1']");
	private By search_confirm = By.xpath("//android.widget.Button[@text='Confirm']");
	private By after_search = By.xpath("//android.widget.TextView[@index='0']");
	private By external_save = By.xpath("//android.widget.TextView[@index='0']");
		

	private By Aug_23_Medlab = By.xpath("//android.widget.TextView[@text='Medlab Asia / Asia Health']");
	private By Aug_23_indian = By.xpath("//android.widget.TextView[@text='INDIAN PHARMA EXPO NEW DELHI']");
	private By Aug_23_INA = By.xpath("//android.widget.TextView[@text='INAPHARM']");
	private By Aug_23_InaLab = By.xpath("//android.widget.TextView[@text='InaLab']");

	public void click_on_any_event() {
		List<MobileElement> ss = driver.findElements(month_23);
		System.out.println(ss.size());

		for (int i = 0; i < ss.size(); i++) {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			System.out.println(ss.get(i).getText());
			ss.get(1).click();
		}
	}

	public void verify_event_is_display_with_date() {
		List<MobileElement> list = driver.findElements(date_time);
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			list = list.subList(0, 15);
			System.out.println(list.get(i).getText());
		}
	}

	public void verify_all_event_is_clickable() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Aug_23_Medlab).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(Aug_23_indian).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(Aug_23_INA).click();
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(Aug_23_InaLab).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}
	
	public void validate_save_external_functionality() {
		
		List<MobileElement>	 ss= 	driver.findElements(external_save);
	     
	     System.out.println("size of element "+ss.size());
	     
	     for(int i=0; i<ss.size(); i++) {
	    	 System.out.println( ss.get(i).getText());
	    	 ss.get(4).click();
	    	 break;
	     }
	}
	
	public void use_search_functionality() {
		driver.findElement(search).click();
		driver.findElement(search_box).sendKeys("medlab");
		driver.findElement(search_confirm).click();
		
	}
	
	public void validate_as_per_search_functionality() {
		
	     List<MobileElement> ss= driver.findElements(after_search);
	    // System.out.println(ss.size());
	     
	     for(int  i=0; i<ss.size(); i++) {	    	 
	    	 ss.get(i).getText();
	    	 System.out.println(ss.get(3).getText());
	     }
	}

	@Then("validate save functionality")
	public void validate_save_functionality() {
		
		List<MobileElement> ss= driver.findElements(save_internal);
		 System.out.println(ss.size());
		  ss.get(0).click();
	}
	public void validate_share_functionality() {
		driver.findElement(share_internal).click();
	}

	public void validate_click_event_is_open_or_not() {
		System.out.println("clickable event :" + driver.findElement(clickable_event).getText());
	}
}
