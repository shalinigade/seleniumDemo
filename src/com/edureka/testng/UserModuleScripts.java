package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts {
	
	/*
	@Test(groups= {"smoke"},priority = 1)
	public void createUser()
	{
		Reporter.log("user created successfully");
		//Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "createUser" ,priority=2)
	public void editUser()
	{
		Reporter.log("Details edited successfully");
	}
	
	
	@Test(dependsOnMethods = "editUser")
	public void deleteUser()
	{
		Reporter.log("User deleted successfully");
	}
	*/
	
	@Test(groups= {"smoke","Task"})
	public void createUser()
	{
		Reporter.log("user created successfully");
		//Assert.fail();
	}
	
	
	@Test(groups= {"Task"})
	public void editUser()
	{
		Reporter.log("User edited successfully");
	}
	
	
	@Test()
	public void deleteUser()
	{
		Reporter.log("User deleted successfully");
	}
	
	@Test(groups= {"smoke"})
	public void closeUser()
	{
		Reporter.log("User closed successfully");
	}
	
	}

