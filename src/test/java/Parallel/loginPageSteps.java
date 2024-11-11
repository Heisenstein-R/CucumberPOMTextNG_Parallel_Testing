package Parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageSteps {
	
	private static String title;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	}

	@When("User verifies the title of the page")
	public void user_verifies_the_title_of_the_login_page() {
		title = loginpage.loginpageTitle();
		System.out.println("Title of the page is: " +title);
	}

	@Then("Title of the Page should be {string}")
	public void title_of_the_page_should_be(String expectedPageTitle) {
		Assert.assertTrue(title.contains(expectedPageTitle));
	}

	@Then("User Verifies the Forgot Password link")
	public void user_verifies_the_forgot_password_link() {
		boolean b = loginpage.forgotPwdLinkExists();
		Assert.assertTrue(b);
	}
	
	@Then("User verifies Create account form")
	public void user_verifies_create_account_form() {
	   boolean b = loginpage.createAccountPageExists();
	   Assert.assertTrue(b);
	}

	@When("user enters the Username {string}")
	public void user_enters_the_username(String userName) {
		loginpage.enterEmail(userName);
	}

	@When("the password as {string}")
	public void the_password_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		loginpage.clickOnSignin();
	}


}
