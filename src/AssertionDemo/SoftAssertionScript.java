package AssertionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionScript {

	@Test
	public void Test3() {
		System.setProperty("webdriver.gecko.driver","C:\\Chetan\\Softs\\SeleniumSuite\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");

		// Actual title
		String ActualTitle = driver.getTitle();

		System.out.println("Actual Title is: " + ActualTitle);
		String ExpectTitle = "mail";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ActualTitle, ExpectTitle);
		
		//Assert.assertTrue(ActualTitle.contains("mail"));
		
		System.out.println("Test Completed.");
		driver.close();
		softassert.assertAll();
	}
	
	@Test
	public void Test1() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test-1 Started...");
		assertion.assertEquals(12, 13, "Count doesn\'t match.");
		
		System.out.println("Test-1 Completed.");
		
		assertion.assertAll();
	}

	@Test
	public void Test2() {
		System.out.println("Test-2 Started...");
		Assert.assertEquals(12, 13);
		System.out.println("Test-2 Completed.");
	}
}
