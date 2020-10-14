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
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import java.util.List;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	
    public static WebDriver driver =null;
    
	public static void main(String[] args)  throws InterruptedException {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.facebook.com");
			//driver.navigate().to("https://www.facebook.com")
			
			driver.manage().window().maximize();
			
			String appUrl = "https://www.facebook.com";
			driver.get(appUrl);
			
			/*
			 String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			String browserid = driver.getWindowHandle();
			System.out.println(browserid);
			
			driver.findElement(By.id("email")).sendKeys("gadeshalinireddy1@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("shalini");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			*/
			
			/*
			//Get list of web-elements with tagName  - a
			 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		     
		     int size = allLinks.size();
			 System.out.println(size);
			 */
			
			//System.out.println(allLinks.size());
			
			/*
			for(WebElement link: allLinks)
			{
				String text = link.getText();
				System.out.println(text);
			}
			*/
			
			 
			//Traversing through the list and printing its text along with link address
			/*
			 for(WebElement link:allLinks)
			 {
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
			 */
			 
			 
			 //driver.findElement(By.linkText("Forgotten password?")).click();
			 //driver.findElement(By.partialLinkText ("Create")).click();
			
			/*
			 WebElement loginButton = driver.findElement(By.xpath("//button[@value='1']"));
			 loginButton.click();
			 */
			
			/*
			WebElement hiddenLogin = driver.findElement(By.xpath("//input[@type='text'']"));
			 hiddenLogin.click();
			 */
			 
			/*
			 WebElement  loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			 loginButton.click();
			 */
			 
			/*
			WebElement  emailId = driver.findElement(By.xpath("//input[@name='email' and @aria-label='Email address or phone number']"));
			emailId.sendKeys("gadeshalinireddy1@gmail.com");
			//or
			WebElement  emailId = driver.findElement(By.xpath("//input[@name='email' and @aria-label='Email address or phone number']"));
			emailId.sendKeys("gadeshalinireddy1@gmail.com");
		   */
			
			/*
			WebElement  welcomeMsg = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps ')]"));
			System.out.println(welcomeMsg.getText());
			*/
			
			/*
			WebElement  welcomeMsg = driver.findElement(By.xpath("//h2[contains(text(),'connect and share')]"));
			System.out.println(welcomeMsg.getText());
			*/
			
			/*
			WebElement  emailId = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]"));
			emailId.sendKeys("gadeshalinireddy1@gmail.com");
			*/
			
			//css selector
			/*
			WebElement  emailId = driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]"));
			emailId.sendKeys("gadeshalinireddy1@gmail.com");
			*/
			
			
			//
			//driver.close();
			//driver.quit();
			
			/* 
			driver.get("https://www.facebook.com/");
	        Thread.sleep(300);
	        WebElement username = driver.findElement(By.id("email"));
	        WebElement password = driver.findElement(By.id("pass"));
	        WebElement Login = driver.findElement(By.id("u_0_v"));
	        username.sendKeys("myusername@xyz.com");
	        password.sendKeys("mypassword");
	        Login.click();
	        Thread.sleep(300);
	        */
	    
			
		
			/*
	        WebElement emailId = driver.findElement(By.id("email"));
	        emailId.selectByVisibleText("gadeshalinireddy1@gmail.com"); 
	        Thread.sleep(300);
	 
	        WebElement password= driver.findElement(By.id("pass"));
	        password.selectByVisibleText("shalini");
	        Thread.sleep(300);
	        */
			
			
		    
	       
		}
	        }