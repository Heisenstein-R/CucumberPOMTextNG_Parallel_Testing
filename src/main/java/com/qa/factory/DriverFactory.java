package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

	public WebDriver init_driver(String browser) {

		System.out.println("Browser name is: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			tldriver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			tldriver.set(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("Edge")) {
			tldriver.set(new EdgeDriver());
		} else {
			System.out.println("Please enter the correct browser value: " + browser);
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		return getDriver();

	}

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
