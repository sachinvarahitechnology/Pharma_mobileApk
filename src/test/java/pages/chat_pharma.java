package pages;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import login_stepdef.homepagestepdef;

public class chat_pharma {

	private static AppiumDriver<MobileElement> driver;
	homepagestepdef homepage = new homepagestepdef();

	public chat_pharma(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		System.out.println("driver value in chat_pharma :-- " + driver);
	}

	private By firstcompany = By.xpath("//android.view.View[@index='1']");
	private By chattext_box = By.id("inputs");
	private By send_button = By.xpath("//android.widget.Button[@index='5']");
	private By delete_icon= By.xpath("//android.view.View[@index='2']");

	public void open_company() {
			List<MobileElement> ss=	driver.findElements(firstcompany);
			
			for(int i=0; i<ss.size();i++) {
				System.out.println(ss.get(i).getText());
				ss.get(1).click();
			}
	}
	
	public void text_it_and_verify() {
		   driver.findElement(chattext_box).sendKeys("hii");
		   driver.findElement(send_button).click();
	}
	
	public void verify_delete() {
		 driver.findElement(delete_icon).click();
	}

}
