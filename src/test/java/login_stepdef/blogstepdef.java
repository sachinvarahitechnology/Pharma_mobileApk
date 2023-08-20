package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.blog_pharma;
import pages.event_pharma;
import pages.login_pharma;

public class blogstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	blog_pharma blog;

	homepagestepdef home = new homepagestepdef();

	@Given("user on blog page")
	public void user_on_blog_page() {
		driver = login.launch();
		System.out.println("driver value in blogstepdef: " + driver);
		blog = new blog_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_blogs();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("click on any blog")
	public void click_on_any_blog() throws InterruptedException {
		blog.click_on_any_blog();
		Thread.sleep(3000);
	}

	@Then("varify click blog is open")
	public void varify_click_blog_is_open() {
		blog.varify_click_blog_is_open();
	}

	@Then("validate saved icon")
	public void validate_saved_icon() throws InterruptedException {
		Thread.sleep(2000);
		 blog.validate_saved_icon();
	}

	@Then("validate reads of author")
	public void validate_reads_of_author() {
		blog.validate_reads_of_author();
	}

	@When("click on author name")
	public void click_on_author_name() {
		blog.click_on_author_name();
	}

	@Then("verify comment is posted or not")
	public void verify_comment_is_posted_or_not() throws InterruptedException {
		blog.verify_comment_is_posted_or_not();
	}

	@Then("velidate about blogger")
	public void velidate_about_blogger() {
		blog.velidate_about_blogger();
	}

	@Then("verify follow button")
	public void verify_follow_button() {
		blog.verify_follow_button();
	}

	@When("click on write blog")
	public void click_on_write_blog() {
		blog.click_on_write_blog();
	}

	@Then("varify link send or not")
	public void varify_link_send_or_not() {
		blog.varify_link_send_or_not();
	}

	@Then("varify author name after clicking")
	public void varify_author_name_after_clicking() {
		blog.varify_author_name_after_clicking();
	}

	@Then("verify save functionality")
	public void verify_save_functionality() {
		blog.verify_save_functionality();
	}

	@When("find by search function")
	public void find_by_search_function() {
		blog.find_by_search_function();
	}

	@Then("Validate as per search")
	public void validate_as_per_search() {
		blog.validate_as_per_search();
	}

	@Then("verify share functionality")
	public void verify_share_functionality() {
		blog.verify_share_functionality();
	}

}
