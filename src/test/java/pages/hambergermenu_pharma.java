package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class hambergermenu_pharma {
	
	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public hambergermenu_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in menu_pharma :-- " + driver);
	}

	private By firstblog = By.xpath("//android.widget.TextView[@index='0']");

}
