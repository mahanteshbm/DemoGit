package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import resources.TestBase;

public class LogInPage  extends TestBase{

	public WebDriver driver;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='email']")
	WebElement userName;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement passWord;

	
	@FindBy(xpath = "//*[@type='submit' and @name='commit']")
	WebElement logIn;
	

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement error;
	
	public void validateLogin(String usreName, String passWord)
	{
		userName.sendKeys(usreName);
		this.passWord.sendKeys(passWord);
		logIn.click();
		
	
	  Assert.assertTrue(error.isDisplayed());
	
		
		
	}
	
}
