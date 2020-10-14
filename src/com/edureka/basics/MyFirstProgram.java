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
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstProgram {
	
    public static WebDriver driver =null;
    
	public static void main(String[] args)  throws InterruptedException {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get(""https://www.facebook.com");
			//driver.navigate().to("https://www.facebook.com")
			
			driver.manage().window().maximize();
			
			String appUrl = "https://www.gmail.com";
			driver.get(appUrl);
			
			driver.findElement(By.id("identifierId")).sendKeys("gadeshalinireddy1@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("shalini");
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(2000);
			
	        
	        //WebElement emailid = driver.findElement(By.id("email"));
	       // ((Select) emailid).selectByVisibleText("gadeshalinireddy1@gmail.com"); 
	        //Thread.sleep(300);
	 
	        //WebElement password= driver.findElement(By.id("pass"));
	        //((Select) password).selectByVisibleText("shalini");
	        //Thread.sleep(300);
	       
		}
	        }