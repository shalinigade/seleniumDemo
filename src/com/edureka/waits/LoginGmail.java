package com.edureka.waits;
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
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;
	
	
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		//Wait  w = new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS).igonoring(NoSuchElementException.class);
				
		driver.get("http://www.gmail.com");
		
		
		driver.findElement(By.id("identifierId")).sendKeys("gadeshalinireddy1@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.id("passwordNext")).click();
		
		wait.until(ExpectedConditions.titleContains("inbox"));
		
		String title = driver.getTitle();
		if(title.contains("inbox"))
		{
			System.out.println("login wassuccessfull");
		}
		else
		{
			System.out.println("login failed");
			
		}
		
		
		
	}

}
