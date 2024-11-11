package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\AppFeatures"
		,glue = {"stepDefinitions", "AppHooks"}
		,plugin = {"pretty"
				,"html:Reports\\report1.html"
				,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		,dryRun = false
		
		)

public class MyTestRunner {
	
	
	
}
