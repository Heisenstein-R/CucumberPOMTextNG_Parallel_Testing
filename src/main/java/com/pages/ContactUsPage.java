package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	private WebDriver driver;

	private By subjectHeading = By.id("id_contact");
	private By email = By.id("email");
	private By message = By.id("message");
	private By messageSent = By.xpath("//p[text() = 'Your message has been successfully sent to our team.']");
	private By submitButton = By.id("submitMessage");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillingTheForm(String heading, String EmailID, String Message) {

		Select select = new Select(driver.findElement(subjectHeading));
		select.selectByVisibleText(heading);
		driver.findElement(email).sendKeys(EmailID);
		driver.findElement(message).sendKeys(Message);
		driver.findElement(submitButton).click();

	}

	public boolean verifyTheSentMessage() {
		return driver.findElement(messageSent).isDisplayed();
	}

}
