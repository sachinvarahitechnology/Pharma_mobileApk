package login_stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login_pharma;
import pages.myaccount_pharma;

public class my_account_stepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	myaccount_pharma myaccount;
	homepagestepdef home = new homepagestepdef();

	@Given("user on myaccount page")
	public void user_on_myaccount_page() {
		driver = login.launch();
		System.out.println("driver value in savedstepdef: " + driver);
		myaccount = new myaccount_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_menu();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='My Account']")).click();
	}

	@When("enter valid number")
	public void enter_valid_number() throws InterruptedException {
		myaccount.enter_valid_number();
	}

	@Then("verify number is correct")
	public void verify_number_is_correct() {
		myaccount.verify_number_is_correct();
	}

	@When("enter position")
	public void enter_position() throws InterruptedException {
		myaccount.enter_position();
	}

	@When("enter company name")
	public void enter_company_name() throws InterruptedException {
		 myaccount.enter_company_name();
	}

	@Then("verify  company name")
	public void verify_company_name() {
		 myaccount.verify_company_name();
	}

	@Then("verify position")
	public void verify_position() {
		myaccount.verify_position();
	}

}
