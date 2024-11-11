package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountspage;

	@Given("User logs into the Account Page")
	public void user_logs_into_the_account_page(DataTable credsTable) {
		
		List<Map<String, String>> credsList = credsTable.asMaps();
		String userName = credsList.get(0).get("username");
		String passWord = credsList.get(0).get("password");

		DriverFactory.getDriver()
				.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

		accountspage = loginpage.doDirectLogin(userName, passWord);

	}

	@Given("User is on Accounts Page")
	public void user_is_on_accounts_page() {
		boolean b = accountspage.myAccountHeadingVerify();
		Assert.assertTrue(b);
	}

	@Then("User check for the availability of these links on accounts page")
	public void user_check_for_the_availability_of_these_links_on_accounts_page(DataTable accountsTable) {

		List<String> expectedList = accountsTable.asList();
		System.out.println("Expected accounts list is: " + expectedList);

		List<String> actualList = accountspage.getMyAccountsList();
		System.out.println("Actual accounts list is: " + actualList);

		Assert.assertTrue(actualList.containsAll(expectedList));
	}

}
