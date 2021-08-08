package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initialization() throws Exception
	{
		 prop=new Properties();
		String path=System.getProperty("user.dir") + "//src//main//java//resources//data.properties";
		/*
		 * InputStream fis=Thread.currentThread().getContextClassLoader().
		 * getResourceAsStream(
		 * "C:\\Users\\Name\\E2EProject\\src\\main\\java\\resources\\data.properties");
		 */
		//FileInputStream fis=new FileInputStream(path);
		FileInputStream fis=new FileInputStream("C:\\Users\\Name\\E2EProject\\src\\main\\java\\resources\\data.properties");

		String browserName=prop.getProperty("browserName");
		//
		//new FileInputStream("C:\\Users\\Name\\E2EProject\\src\\main\\java\\resources\\data.properties");
		//String browserName=prop.getProperty("browserName");
		//String url=prop.getProperty("url");
		System.out.println(browserName);
	 if(browserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
			 driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("h");
	 }
	 else if(browserName.equals("IE"))
	 {
		 System.setProperty("webdriver.ie.driver", "D://drivers//IEDriverServer.exe");
		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("url");
	 }
	 else if(browserName.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("");
	 }
	 else
	 {
		 System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("");
	 }
		
	 driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return driver;
	}
}
