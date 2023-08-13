package login_stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.chat_pharma;
import pages.login_pharma;

public class chatstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	chat_pharma chat;
	homepagestepdef home = new homepagestepdef();

	@Given("user on chat page")
	public void user_on_chat_page() {
		driver = login.launch();
		System.out.println("driver value in savedstepdef: " + driver);
		chat = new chat_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_menu();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chat']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("open company")
	public void open_company() {
		chat.open_company();
	}

	@Then("text it and verify")
	public void text_it_and_verify() {
		chat.text_it_and_verify();
	}

	@Then("verify delete")
	public void verify_delete() {
	 chat.verify_delete();
	}

}
