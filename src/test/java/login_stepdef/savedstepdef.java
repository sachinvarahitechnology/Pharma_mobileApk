package login_stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login_pharma;
import pages.saved_pharma;

public class savedstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	saved_pharma save;
	homepagestepdef home = new homepagestepdef();

	@Given("user on save itempage")
	public void user_on_save_itempage() throws InterruptedException {
		driver = login.launch();
		System.out.println("driver value in savedstepdef: " + driver);
		save = new saved_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_menu();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		save.user_on_save_itempage();
	}
	@When("click on save company")
	public void click_on_save_company() throws InterruptedException {
		save.click_on_save_company();
	}
	
	@When("click on companies")
	public void click_on_companies() {
		save.click_on_companies();
	}

	@When("click on  saved_news")
	public void click_on_saved_news() {
		save.click_on_saved_news();
	}

	@When("click on Saved_Events")
	public void click_on_saved_events() {
		save.click_on_saved_events();
	}

	@Then("verify save event list")
	public void verify_save_event_list() throws InterruptedException {
		save.verify_save_event_list();
	}

	@Then("verify save blog list")
	public void verify_save_blog_list() {
		save.verify_save_blog_list();
	}

	@When("click on saved_Blogs")
	public void click_on_saved_blogs() {
		save.click_on_saved_blogs();
	}

	@When("click on saved_Jobs")
	public void click_on_saved_jobs() {
		save.click_on_saved_jobs();
	}

	@Then("verify save Job list")
	public void verify_save_job_list() {
		save.verify_save_job_list();
	}

	@Then("verify unsave functionality")
	public void verify_unsave_functionality() {
		save.verify_unsave_functionality();
	}

	@When("click on save news")
	public void click_on_save_news() throws InterruptedException {
		 save.click_on_save_news();
	}

	@Then("verify save companies")
	public void verify_save_companies() throws InterruptedException {
		save.verify_save_companies();
	}

	

	@Then("verify share icon functionality")
	public void verify_share_icon_functionality() throws InterruptedException {
		Thread.sleep(3000);
		save.verify_share_icon_functionality();
	}

	@Then("verify save  news list")
	public void verify_save_news_list() {
		save.verify_save_news_list();
	}

}
