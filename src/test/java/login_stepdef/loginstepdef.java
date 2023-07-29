package login_stepdef;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login_pharma;
 

public class loginstepdef {

	   AppiumDriver driver;
	
	login_pharma login = new login_pharma();
	
	 
	
	@Given("user on login page")
	public void user_on_login_page()   {
		 
		login.launch();
 
	}

	@When("user provide {string} and {string}")
	public void user_provide_and(String username, String password) {
		login.user_provide_and(username, password);

	}

	@When("click on button")
	public void click_on_button() {
		login.click_on_button();
	}

	@When("click on remember button")
	public void click_on_remember_button() {
		 login.click_on_remember_button();
	}
	
	@Then("validate term link")
	public void validate_term_link() {
	 login.validate_term_link();
	}

	@Then("login successfully")
	public void login_successfully() {
		login.login_successfully();
	}
	
	@Then("validate id is visible")
	public void validate_id_is_visible() {
	    login.validate_id_is_visible();
	}

	@Then("get error")
	public void get_error() {
		login.get_error();
	}

}
