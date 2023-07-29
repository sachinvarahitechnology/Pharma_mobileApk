package login_stepdef;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homepage_pharma;
import pages.login_pharma;

public class homepagestepdef {

	  
	
	login_pharma login = new login_pharma(  );
	homepage_pharma homepage=new homepage_pharma( );

	@Given("user on login page & login")
	public void user_on_login_page_login() {
		// login.launch();
		
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

	@Then("verify marketplace feature is open")
	public void verify_feature_is_open() {
		 homepage.verify_feature_is_open();
	}

}
