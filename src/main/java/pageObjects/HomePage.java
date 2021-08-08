package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.TestBase;

public class HomePage extends TestBase {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//*[text()='Featured Courses']")
	WebElement homePageVerify;
	
	@FindBy(xpath = "//span[text()='Login']")
	WebElement logInButton;
	
	@FindBy(css = "ul.nav.navbar-nav.navbar-right")
	WebElement navigationBar;
	
	public boolean homePageVerification()
	{
		if(homePageVerify.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clickOnLogin()
	{
		logInButton.click();
	}
	
	public boolean verifyNavBar()
	{
		if(navigationBar.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
