package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsPageTest {
	
	private ContactUsPage contactpage = new ContactUsPage(DriverFactory.getDriver());
	
	@Given("user is on the ContactUs page")
	public void user_is_on_the_contact_us_page() {
	    DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=contact");
	}

	@When("user enters fills the and submits data from the {string} and {int}")
	public void user_enters_fills_the_and_submits_data_from_the_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	   ExcelReader excelReader = new ExcelReader(); 
	   List<Map<String, String>> testData =  
			   excelReader.getData("C:\\Users\\91938\\eclipse-workspace\\CucumberPOMseries\\src\\test\\resources\\ExcelSheet\\ExcelDataForCucumber.xlsx", SheetName);
	   
	  String subjHeading = testData.get(RowNumber).get("SubjectHeading");
	  String Emailid = testData.get(RowNumber).get("email");
	  String message = testData.get(RowNumber).get("message");
	  
	  contactpage.fillingTheForm(subjHeading, Emailid, message);
	
	}

	@Then("user see a form submitting confirmation message")
	public void user_see_a_form_submitting_confirmation_message() {
	   boolean b = contactpage.verifyTheSentMessage();
	   
	   Assert.assertTrue(b);
	}
	
	

}
