package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hambergermenu_pharma;
import pages.login_pharma;

public class hambergermenustepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	hambergermenu_pharma menu;

	homepagestepdef home = new homepagestepdef();

	@Given("user on manu page")
	public void user_on_manu_page() throws InterruptedException {
		driver = login.launch();
		System.out.println("driver value in menustepdef: " + driver);
		menu = new hambergermenu_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_menu();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("click on rate companies")
	public void click_on_rate_companies() {
	 
	}

	@Then("verify rate companies")
	public void verify_rate_companies() {
		 
	}

}
