package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class jobprofile_pharma {
	
	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public jobprofile_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in jobprofile_pharma :-- " + driver);
	}
	
	private By jobprofile = By.xpath("//android.widget.TextView[@text='Job Profile']");
	private By Phone_nu_box = By.xpath("//android.widget.EditText[@index='4']");
	
	
	public void user_on_jobprofile_page() {
		driver.findElement(jobprofile).click();
	}

}
