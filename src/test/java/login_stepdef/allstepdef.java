package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
import pages.All_pharma;
import pages.login_pharma;

public class allstepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	homepagestepdef home = new homepagestepdef();
	All_pharma all;

	@Given("user on All module page")
	public void user_on_all_module_page() {
		driver = login.launch();
		System.out.println("driver value in blogstepdef: " + driver);
		all = new All_pharma(driver);
		home.user_on_login_page_login();
		all.user_on_all_module_page();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@When("click on view all")
	public void click_on_view_all() {
		 all.click_on_view_all();
	}
	
	@When("click on search icon")
	public void click_on_search_icon() {
		all.click_on_search_icon();
	}
	
	@Then("verify search functionality")
	public void verify_search_functionality() throws InterruptedException {
	  all.verify_search_functionality();
	}

	@Then("verify view all functionality")
	public void verify_view_all_functionality() {
		all.verify_view_all_functionality();
	}

}
