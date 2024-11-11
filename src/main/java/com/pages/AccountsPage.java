package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;

	private By myAccountHeading = By.xpath("//h1[text() = 'My account']");
	private By addMyFirstAddress = By.xpath("//ul/li//span[text() = 'Add my first address']/parent::a");
	private By orderHistoryAndDetails = By.xpath("//ul/li//span[text() = 'Order history and details']/parent::a");
	private By myCreditSlips = By.xpath("//ul/li//span[text() = 'My credit slips']/parent::a");
	private By myAddresses = By.xpath("//ul/li//span[text() = 'My addresses']/parent::a");
	private By myPersonalInformation = By.xpath("//ul/li//span[text() = 'My personal information']/parent::a");
	private By homeButton = By.xpath("//ul/li//span[text() = ' Home']/parent::a");
	private By accountsLinks = By.xpath("//div[@id = 'center_column']//ul//li//span");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	// verify the heading
	public boolean myAccountHeadingVerify() {
		return driver.findElement(myAccountHeading).isDisplayed();
	}

	// Clicking on the buttons
	public void clickOnAddMyFirstAddress() {
		driver.findElement(addMyFirstAddress).click();
	}

	public void clickOnOrderHistoryAndDetails() {
		driver.findElement(orderHistoryAndDetails).click();
	}

	public void clickOnMyCreditSlips() {
		driver.findElement(myCreditSlips).click();
	}

	public void clickOnMyAddresses() {
		driver.findElement(myAddresses).click();
	}

	public void clickOnMyPersonalInformations() {
		driver.findElement(myPersonalInformation).click();
	}

	public void clickOnHomeButton() {
		driver.findElement(homeButton).click();
	}

	public boolean myAccountHeadingVisibility() {
		return driver.findElement(addMyFirstAddress).isDisplayed();
	}

	// verifying the buttons visibility
	public boolean orderHistoryAndDetailsVisibility() {
		return driver.findElement(orderHistoryAndDetails).isDisplayed();
	}

	public boolean myCreditSlipsVisibility() {
		return driver.findElement(myCreditSlips).isDisplayed();
	}

	public boolean myAddressesVisibility() {
		return driver.findElement(myAddresses).isDisplayed();
	}

	public boolean myPersonalInformationVisibility() {
		return driver.findElement(myPersonalInformation).isDisplayed();
	}

	public boolean homeButtonVisibility() {
		return driver.findElement(homeButton).isDisplayed();
	}

	public List<String> getMyAccountsList() {

		List<String> accountsList = new ArrayList<String>();
		List<WebElement> accountslinks = driver.findElements(accountsLinks);

		for (WebElement e : accountslinks) {
			String text = e.getText();
			accountsList.add(text);
		}
		return accountsList;
	}

}
