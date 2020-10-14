package com.edureka.testng;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	
	public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;
	
	@Parameters("browserType")
	
	@BeforeMethod
	
	public void launchApp(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("invalid browser selction");
			System.exit(0);
		}
	    
		wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
	}
	  
	@AfterMethod
	public void closeApp()
	{
	driver.quit();
	}
}
