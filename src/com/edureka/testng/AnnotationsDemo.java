package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		Reporter.log("@BeforeSuite",true);
	}
	
	@BeforeTest
	public void beforeTestMethod()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("@BeforeMethod",true);
	}
	
	@Test
	public void test1()
	{
		Reporter.log("Test Block 1",true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("Test Block 2",true);
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("@AfterMethod",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("@AfterClass",true);
	}
	
	
	@AfterTest
	public void afterTestMethod()
	{
		Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite
	public void afterSuiteMethod()
	{
		Reporter.log("@AfterSuite",true);
	}
	
	
	}


