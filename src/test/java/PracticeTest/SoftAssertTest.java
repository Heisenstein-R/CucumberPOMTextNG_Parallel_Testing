package PracticeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	WebDriver driver;
	SoftAssert softassert;

	@BeforeClass
	public void BrowserSetup() {
		driver = new ChromeDriver();
		softassert = new SoftAssert();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://echarts.apache.org/examples/en/index.html");

	}

	@Test
	public void VerifyElements() {
		
		
		try {
			
			WebElement element = driver.findElement(By.xpath("//a[text() = 'Hom']"));

			boolean b = element.isDisplayed();
			
			softassert.assertTrue(b, "The Home button Element is not found");
			
			
		} catch (Exception e) {
			
//			System.out.println(e.getMessage());
			
			softassert.fail("The Element youve entered doesnt match or found");
			
		}
		
		
		
		System.out.println("Raaaaaaj");
		
		
		softassert.assertAll();

	}

	@AfterClass
	public void teardown() {
		driver.close();
	}

}
