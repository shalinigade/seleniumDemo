package com.edureka.basics;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import java.util.List;

//import org.openqa.selenium.firefox.FirefoxDriver;
public class browsers {

WebDriver Driver;
	
	String sUrl = "http://www.facebook.com";
	
	
	public void invokeBrowser(String sBrowserType){
		

   if(sBrowserType.equalsIgnoreCase("firefox"))
   {
	              System.setProperty("webdriver.gecko.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
	              WebDriver driver = new FirefoxDriver();
   } 
   
       /*
       else if(sBrowserType.equalsIgnoreCase("chrome"))
         {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chrome.exe");
					Driver = new ChromeDriver();
	   
         } 
   
         
         else if(sBrowserType.equalsIgnoreCase("ie"))
         {
					System.setProperty("webdriver.ie.driver", "C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
					Driver = new InternetExplorerDriver();
		 } 
		 */
   
	 else 
	   {
					System.err.println("Invalid Browser type.. setting default browser as Chrome Driver");
		            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PT-4443\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chrome.exe");
					Driver = new ChromeDriver();			
		 }	
	

	}
}
