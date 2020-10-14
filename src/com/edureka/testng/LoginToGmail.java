package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToGmail extends BaseTest{
	
	@Test
	//public void login(String exp_title)
	public void login()
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gadeshalinireddy1@gmail.com");
		driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
		driver.findElement(By.name("//input[@type='password']")).sendKeys("shalini");
		driver.findElement(By.id("signIn")).click();
      
		
         wait.until(ExpectedConditions.titleContains("inbox"));
		
		String title = driver.getTitle();
		
		//Assert.assertEquals(title,exp_title);
		
		
		
		
	}
}
