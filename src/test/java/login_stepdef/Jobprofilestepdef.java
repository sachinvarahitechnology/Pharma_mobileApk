package login_stepdef;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import pages.blog_pharma;
import pages.jobprofile_pharma;
import pages.login_pharma;
import pages.myaccount_pharma;

public class Jobprofilestepdef {

	private static AppiumDriver<MobileElement> driver;
	login_pharma login = new login_pharma();
	jobprofile_pharma jobprofile;

	homepagestepdef home = new homepagestepdef();

	
	@Given("user on jobprofile page")
	public void user_on_jobprofile_page() {
		driver = login.launch();
		System.out.println("driver value in jjobprofilestepdef: " + driver);
		jobprofile = new jobprofile_pharma(driver);
		home.user_on_login_page_login();
		home.click_on_menu();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		jobprofile.user_on_jobprofile_page();
	}

}
