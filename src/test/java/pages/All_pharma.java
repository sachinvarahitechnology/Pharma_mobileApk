package pages;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class All_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();
	marketplace_pharma market=new marketplace_pharma(driver);

	public All_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in All_pharma :-- " + driver);
		market=new marketplace_pharma(driver);
	}

	private By All = By.xpath("//android.view.View[@text=' All']");
	private By View_All = By.xpath("//android.widget.TextView[@text='View all']");
	private By after_click_View_All = By.xpath("//android.widget.TextView[@text='MARKETPLACE']");
	private By after_search = By.xpath("//android.widget.TextView[@index='0']");
	private By search_icon = By.xpath("//android.widget.TextView[@index='3']");
	private By conform_button = By.xpath("//android.widget.Button[@text='Confirm']");
	private By search_by_com = By.xpath("//android.widget.EditText[@index='1']");

	public void user_on_all_module_page() {
		driver.findElement(All).click();
	}

	public void click_on_search_icon() {
		driver.findElement(search_icon).click();
		driver.findElement(search_by_com).sendKeys("shreenath");
		driver.findElement(conform_button).click();
	}
	
	public void verify_search_functionality() throws InterruptedException {
		Thread.sleep(8000);
		 List<MobileElement> ss =driver.findElements(after_search);
		 System.out.println("size"+ss.size());
		 
		 for(int i=0; i<ss.size(); i++) {
			 System.out.println(ss.get(0).getText());
			 System.out.println(ss.get(1).getText());
			 break;
		 }
	}

	public void click_on_view_all() {
		driver.findElement(View_All).click();
	}

	public void verify_view_all_functionality() {
		System.out.println(driver.findElement(after_click_View_All));
	}
}
