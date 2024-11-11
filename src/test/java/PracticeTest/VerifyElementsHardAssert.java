package PracticeTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyElementsHardAssert {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	public void BrowserSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://echarts.apache.org/examples/en/index.html");
		
		
		
	}
	
	
	@Test
	public void VerifyElements() {
		
		WebElement element = driver.findElement(By.xpath("//a[text() = 'Hom']"));
		
		
		boolean b = element.isDisplayed();
		
		System.out.println("Raj");
		Assert.assertTrue(b);
		
		System.out.println("Raj");
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	

}
