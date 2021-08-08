package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import resources.TestBase;

public class Login extends TestBase {
   //public WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {
		driver=initialization();

	}

	@Test
	public void HomePageValidation() {
		HomePage hmpg = new HomePage(driver);

		Assert.assertTrue(hmpg.homePageVerification());
	}

	@AfterTest
	public void tearDown()

	{
		driver.close();
		driver=null;
	}
}
