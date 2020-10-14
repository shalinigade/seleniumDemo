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

public class handlingWebElements {
	
public static WebDriver driver =null;
	
	public static WebDriverWait wait =null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PT-4443\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fname= driver.findElement(By.xpath("//input[@placeholder ='First Name']"));
		fname.sendKeys("shalini");

		WebElement lname = driver.findElement(By.xpath("//input[@placeholder ='Last Name']"));
		lname.sendKeys("gade");
		
		WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
		emailId.sendKeys("gadeshalinireddy1@gmail.com");
		
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadio.click();
		
		WebElement femaleRadio = driver.findElement(By.xpath("//input[@value='FeMale']"));
		femaleRadio.click();
		
		WebElement chk_movies= driver.findElement(By.xpath("//input[@value='Movies']"));
	    chk_movies.click();
		
		WebElement chk_cricket= driver.findElement(By.xpath("//input[@value='Cricket']"));
		chk_cricket.click();
		
		WebElement chk_hockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
		chk_hockey.click();
		
		WebElement language = driver.findElement(By.id("msdd"));
		language.click();
		
		WebElement dutchLanguage = driver.findElement(By.linkText("Dutch"));
		dutchLanguage.click();
		
		WebElement englishLanguage = driver.findElement(By.linkText("English"));
		englishLanguage.click();
		
		WebElement countryListBox  = driver.findElement(By.id("countries"));
		Select osel = new Select(countryListBox);
		
		osel.selectByIndex(5);
		//osel.selectByValue("Germany");
		//osel.selectByVisibleText("India");
		
		WebElement submitBtn  = driver.findElement(By.id("submitbtn"));
		submitBtn.click();
		

		
	}

}
