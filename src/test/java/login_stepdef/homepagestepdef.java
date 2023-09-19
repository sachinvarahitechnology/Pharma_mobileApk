package login_stepdef;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homepage_pharma;
import pages.login_pharma;
import utility.Hook;

public class homepagestepdef {

	public AppiumDriver<MobileElement> driver;

	login_pharma login = new login_pharma();
	homepage_pharma homepage;

	@Given("user on login page & login")
	public void user_on_login_page_login() {
		driver = login.launch();
		homepage = new homepage_pharma(driver);
		login.user_provide_and("sachin@varahitechnologies.com", "1234566@");
		login.click_on_button();
	}

	@When("user on homepage")
	public void user_on_homepage() {
		login.login_successfully();
	}

	@When("click on marketplace")
	public void click_on_marketplace() {
		homepage.click_on_marketplace();
	}

	@When("click on event")
	public void click_on_event() {
		homepage.click_on_event();
	}
	@When("click on All")
	public void click_on_all() {
	    homepage.click_on_all();
	}
	@Then("verify All feature is open")
	public void verify_all_feature_is_open() {
	     homepage.verify_all_feature_is_open();
	}


	@When("click on news")
	public void click_on_news() {
		homepage.click_on_news();
	}

	@Then("verify news feature is open")
	public void verify_news_feature_is_open() {
		homepage.verify_news_feature_is_open();
	}

	@Then("verify event feature is open")
	public void verify_event_feature_is_open() {
		homepage.verify_event_feature_is_open();
	}

	@When("click on blogs")
	public void click_on_blogs() {
		homepage.click_on_blogs();
	}

	@Then("verify blogs feature is open")
	public void verify_blogs_feature_is_open() {
		homepage.verify_blogs_feature_is_open();
	}

	@When("click on jobs")
	public void click_on_jobs() {
		homepage.click_on_jobs();
	}

	@When("click on menu")
	public void click_on_menu()  {
		 homepage.click_on_menu();
	}

	@Then("verify menu feature is open")
	public void verify_menu_feature_is_open() {
		 homepage.verify_menu_feature_is_open();
	}

	@Then("verify job feature is open")
	public void verify_job_feature_is_open() {
		homepage.verify_job_feature_is_open();
	}

	@Then("verify feature is open")
	public void verify_feature_is_open() {
		homepage.verify_feature_is_open();
	}

}
