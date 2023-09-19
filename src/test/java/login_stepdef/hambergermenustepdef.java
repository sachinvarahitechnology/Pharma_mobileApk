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
		menu.click_on_rate_companies();
	}

	@Then("verify rate companies")
	public void verify_rate_companies() throws InterruptedException {
		Thread.sleep(3000);
		menu.verify_rate_companies();
	}

	@When("click on following")
	public void click_on_following() {
		menu.click_on_following();
	}

	@When("click on change_password")
	public void click_on_change_password() {
		menu.click_on_change_password();
	}

	@Then("verify change password functionality")
	public void verify_change_password_functionality() {
		menu.verify_change_password_functionality();
	}

	@When("click on  rateus")
	public void click_on_rateus() {
		menu.click_on_rateus();
	}

	@When("click on  privacy_policy")
	public void click_on_privacy_policy() {
		menu.click_on_privacy_policy();
	}

	@Then("verify it is opne or not")
	public void verify_it_is_opne_or_not() {
		menu.verify_it_is_opne_or_not();
	}

	@Then("verify play store aap open or not")
	public void verify_play_store_aap_open_or_not() {
		menu.verify_play_store_aap_open_or_not();
	}

	@When("click on alert")
	public void click_on_alert() {
		menu.click_on_alert();
	}

	@When("click on help")
	public void click_on_help() {
		 menu.click_on_help();
	}
	@When("click on contact us")
	public void click_on_contact_us() {
	    menu.click_on_contact_us();
	}

	@Then("verify help page is open or not")
	public void verify_help_page_is_open_or_not() {
	menu.verify_help_page_is_open_or_not();	 
	}

	@Then("verify alert")
	public void verify_alert() {

	}
	
	@When("click on sign out")
	public void click_on_sign_out() {
	     menu.click_on_sign_out();
	}
	@Then("verify account is signout")
	public void verify_account_is_signout() {
	  menu.verify_account_is_signout();
	}

	@Then("verify all following")
	public void verify_all_following() {
		menu.verify_all_following();
	}

	@When("click on setting")
	public void click_on_setting() throws InterruptedException {
		menu.click_on_setting();
	}

	@When("click on notification")
	public void click_on_notification() {
		menu.click_on_notification();
	}

	@Then("verify notification")
	public void verify_notification() {

	}

}
