package com.edureka.controls;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOverEvent {

public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		
		/*
		WebElement sareeLink = driver.findElement(By.xpath("//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']"));
		Actions action = new Actions(driver);
		action.moveToElement(sareeLink).perform();

		WebElement georgetteSarees = driver.findElement(By.linkText("Georgette Sarees"));
		georgetteSarees.click();
		*/
		
		WebElement searchBox = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
	
		Action searchString = action.keyDown(searchBox,Keys.SHIFT).sendKeys("sarees").keyUp(searchBox,Keys.SHIFT).doubleClick(searchBox).build();
		searchString.perform();
		
	}

}
