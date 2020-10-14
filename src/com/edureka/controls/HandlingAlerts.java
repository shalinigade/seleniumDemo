package com.edureka.controls;
import org.openqa.selenium.Alert;
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

public class HandlingAlerts {

public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		/*
		WebElement infoAlertBtn= driver.findElement(By.xpath("//button[contains(text(), 'display an  alert box:')]"));
		infoAlertBtn.click();
		
			//Information alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		*/
		/*
		//Confirmation alert
		WebElement confirmTab= driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		confirmTab.click();
		
		WebElement confirmAlertBtn= driver.findElement(By.xpath("//button[contains(text(), 'display a confirm box ')]"));
		confirmAlertBtn.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
		
		WebElement message = driver.findElement(By.id("demo"));
		System.out.println(message.getText());
		
		*/
		
		//ModalAlert
		WebElement modalAlertTab = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		modalAlertTab.click();
		
		WebElement modalAlertBtn = driver.findElement(By.xpath("//button[contains(text(), 'demonstrate the prompt box')]"));
		modalAlertBtn.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.sendKeys("shalini");
		alert.accept();
		//alert.dismiss();
		
		WebElement msg = driver.findElement(By.id("demo1"));
		System.out.println(msg.getText());
		
	}

}
