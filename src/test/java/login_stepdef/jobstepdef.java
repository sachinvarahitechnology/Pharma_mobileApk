package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.job_pharma;
import pages.login_pharma;

public class jobstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	job_pharma job;

	homepagestepdef home = new homepagestepdef();

	@Given("user on job page")
	public void user_on_job_page() {
		driver = login.launch();
		System.out.println("driver value in JObstepdef: " + driver);
		job = new job_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_jobs();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}

	@When("click on share icon")
	public void click_on_share_icon() {
		job.click_on_share_icon();
	}

	@When("click on any filter and put")
	public void click_on_any_filter_and_put() {
		job.click_on_any_filter_and_put();
	}

	@When("click on save icon")
	public void click_on_save_icon() {
		job.click_on_save_icon();
	}

	@Then("varify result as per filter")
	public void varify_result_as_per_filter() {
		job.varify_result_as_per_filter();
	}
	
	@Then("verify rating functionality")
	public void verify_rating_functionality() {
	  job.verify_rating_functionality();
	}
	
	@Then("verify review functionality")
	public void verify_review_functionality() {
	    job.verify_review_functionality();
	}



	@When("click on any job")
	public void click_on_any_job() {
		 job.click_on_any_job();
	}

	@Then("click on internal save icon")
	public void click_on_internal_save_icon() {
		 job.click_on_internal_save_icon();
	}

}
