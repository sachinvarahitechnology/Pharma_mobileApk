package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.event_pharma;
import pages.login_pharma;
import pages.news_pharma;

public class eventstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	event_pharma event;
	homepagestepdef home = new homepagestepdef();

	@Given("user on event page")
	public void user_on_event_page() {
		driver = login.launch();
		System.out.println("driver value in eventstepdef: " + driver);
		event = new event_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_event();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("click on any event")
	public void click_on_any_event() {
		event.click_on_any_event();
	}

	@Then("verify event is display with date")
	public void verify_event_is_display_with_date() {
		event.verify_event_is_display_with_date();
	}

	@Then("verify all event is clickable")
	public void verify_all_event_is_clickable() throws InterruptedException {
		event.verify_all_event_is_clickable();
	}

	@Then("validate save functionality")
	public void validate_save_functionality() {
		event.validate_save_functionality();
	}

	@Then("validate click event is open or not")
	public void validate_click_event_is_open_or_not() {
		event.validate_click_event_is_open_or_not();
	}

	@Then("validate share functionality")
	public void validate_share_functionality() {
		event.validate_share_functionality();
	}

	@When("use search functionality")
	public void use_search_functionality() {
		 event.use_search_functionality();
	}

	@Then("validate as per search functionality")
	public void validate_as_per_search_functionality() {
		 event.validate_as_per_search_functionality();
	}

}
