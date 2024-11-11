package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;


public class ElementUtil {
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void pageloadImplicitwaits() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	

}
