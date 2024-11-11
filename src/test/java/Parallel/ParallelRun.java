package Parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		
		features = "src\\test\\resources\\Parallel\\loginpage.feature"
		,glue = {"Parallel"}
		,plugin = {"pretty"
				,"html:Reports\\report1.html"
				,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				,"rerun:Rerun\\ReRunFailed.txt"
				}
		,dryRun = false
		
		)

public class ParallelRun extends AbstractTestNGCucumberTests {
	
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
		
	}
	

}
