package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/resources/Feature/loginn.feature"},
		
		glue={"login_stepdef"},
		monochrome = true,
		//dryRun = true, 
		tags = "@tag1",   
		plugin = {
						"pretty",
						"html: test-report"
						}
		)
public class runnerfile {
	
	

}
