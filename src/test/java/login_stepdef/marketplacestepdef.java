package login_stepdef;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hambergermenu_pharma;
import pages.login_pharma;
import pages.marketplace_pharma;
import pages.saved_pharma;

public class marketplacestepdef {

	private static AppiumDriver<MobileElement> driver;

	login_pharma login = new login_pharma();
	 
	marketplace_pharma marketplace;

	@Given("user on marketplace page")
	public void user_on_marketplace_page() {
		driver = login.launch();
		System.out.println("driver valueeeeee===== " + driver);
		marketplace = new marketplace_pharma(driver);
		marketplace.user_on_marketplace_page();
	}

	@When("click on every category")
	public void click_on_every_category() throws InterruptedException {
		marketplace.click_on_every_category();
	}

	@When("click on any company")
	public void click_on_any_company() throws InterruptedException {
		Thread.sleep(3000);
		marketplace.click_on_any_company();
	}

	@Then("validate mail functionality")
	public void validate_mail_functionality() {
		marketplace.validate_mail_functionality();
	}
	
	@Then("verify rate functionality")
	public void verify_rate_functionality() {
	 marketplace.verify_rate_functionality();    
	}

	@When("click on search")
	public void click_on_search() {
		marketplace.click_on_search();
	}

	@Then("validate search functionality")
	public void validate_search_functionality() {
		marketplace.validate_search_functionality();
	}

	@When("click on any category")
	public void click_on_any_category() throws InterruptedException {
		Thread.sleep(5000);
		marketplace.click_on_any_category();
	}

	@Then("validate chat functionality")
	public void validate_chat_functionality() throws InterruptedException {
		Thread.sleep(3000);
		marketplace.validate_chat_functionality();
	}

	@Then("validate search functionality by product name")
	public void validate_search_functionality_by_product_name() {
		marketplace.validate_search_functionality_by_product_name();
	}

	@Then("validate search functionality by location")
	public void validate_search_functionality_by_location() {
		marketplace.validate_search_functionality_by_location();
	}

	@When("validate save functionlity")
	public void validate_save_functionlity() {
	 marketplace.validate_save_functionlity();
	}

	@When("click on any feature company")
	public void click_on_any_feature_company() throws InterruptedException {
		marketplace.click_on_any_feature_company();
	}
	@Then("check this save company is come in saved_company list or not")
	public void check_this_save_company_is_come_in_saved_company_list_or_not() throws InterruptedException {
	     marketplace.check_this_save_company_is_come_in_saved_company_list_or_not();
	}
	@Then("validate did the one clicked open")
	public void validate_did_the_one_clicked_open() {
		marketplace.validate_did_the_one_clicked_open();
	}

	@Then("validate as per alphabet product is coming or not")
	public void validate_as_per_alphabet_product_is_coming_or_not() {
		marketplace.validate_as_per_alphabet_product_is_coming_or_not();
	}

	@Then("verify sort by functionality")
	public void verify_sort_by_functionality() {
		marketplace.verify_sort_by_functionality();
	}

}
