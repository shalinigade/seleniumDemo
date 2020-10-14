package com.edureka.controls;
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


public class HandlingFrames {

public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("singleframe");
		
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrames.html']"));
		
		driver.switchTo().frame(singleFrame);
		
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("Independent frame");
		
		driver.switchTo().parentFrame();
		
		WebElement InlineFrameTab = driver.findElement(By.linkText("Iframe with in an Iframe"));
		InlineFrameTab.click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		driver.switchTo().frame(0);
		
		WebElement text2 = driver.findElement(By.xpath("  //input[@type='text']"));
		text2.sendKeys("inline frames");
		
	}

}
