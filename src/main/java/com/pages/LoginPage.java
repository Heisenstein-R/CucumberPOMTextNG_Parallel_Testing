package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// By locators of login Page
	private By email = By.id("email");
	private By pwd = By.id("passwd");
	private By signInBtn = By.id("SubmitLogin");
	private By forgotPwdLink = By.xpath("//a[text() = 'Forgot your password?hh']");
	private By creatreAccount = By.xpath("//h3[text() = 'Create an account']");

	// Constructor to initialise browser instance
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// page actions
	public String loginpageTitle() {
		return driver.getTitle();
	}

	public void enterEmail(String emailID) {
		driver.findElement(email).sendKeys(emailID);
	}

	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}

	public void clickOnSignin() {
		driver.findElement(signInBtn).click();
	}

	public boolean forgotPwdLinkExists() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public boolean createAccountPageExists() {
		return driver.findElement(creatreAccount).isDisplayed();
	}
	
	public AccountsPage doDirectLogin(String un, String password) {
		driver.findElement(email).sendKeys(un);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(signInBtn).click();
		return new AccountsPage(driver);
	}
}
