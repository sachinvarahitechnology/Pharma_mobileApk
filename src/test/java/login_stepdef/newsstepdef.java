package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login_pharma;
import pages.news_pharma;

public class newsstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	news_pharma news;
	homepagestepdef home = new homepagestepdef();

	@Given("user on news page")
	public void user_on_news_page() {
		driver = login.launch();
		System.out.println("driver value in newsstepdef: " + driver);
		news = new news_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_news();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("click on any news")
	public void click_on_any_news() throws InterruptedException {
		news.click_on_any_news();

	}

	@Then("visible with time")
	public void visible_with_time() {
		news.visible_with_time();
	}

	@Then("validate share functioanlity")
	public void validate_share_functioanlity() {
		news.validate_share_functioanlity();
	}

	@When("click search icon")
	public void click_search_icon() {
		news.click_search_icon();
	}

	@Then("validate search  functioanlity by category name")
	public void validate_search_functioanlity_by_category_name() {
		 news.validate_search_functioanlity_by_category_name();
	}

	@Then("validate search  functioanlity")
	public void validate_search_functioanlity() {
		news.validate_search_functioanlity();
	}

	@When("todaynews is scroll")
	public void todaynews_is_scroll() {
		news.todaynews_is_scroll();
	}

	@Then("validate save functioanlity")
	public void validate_save_functioanlity() {
		news.validate_save_functioanlity();
	}

	@When("select category and click it")
	public void select_category_and_click_it() {
		news.select_category_and_click_it();
	}

	@Then("validate click news is open or not")
	public void validate_click_news_is_open_or_not() throws InterruptedException {
		Thread.sleep(3000);
		news.validate_click_news_is_open_or_not();
	}
}
