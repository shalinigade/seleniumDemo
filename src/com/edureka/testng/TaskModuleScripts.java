package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TaskModuleScripts {

	/*
	@Test(groups= {"smoke"},priority = 1)
	public void createTask()
	{
		Reporter.log("Task created successfully");
		//Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "createTask")
	public void editTask()
	{
		Reporter.log("Tasks edited successfully");
	}
	
	
	@Test(dependsOnMethods = "editTask")
	public void deleteTask()
	{
		Reporter.log("Tasks deleted successfully");
	} 
	
	*/
	
	@Test(groups= {"smoke","Task"})
	public void createTask()
	{
		Reporter.log("Task created successfully");
		//Assert.fail();
	}
	
	
	@Test(groups={"Task"})
	public void editTask()
	{
		Reporter.log("Tasks edited successfully");
	}
	
	
	@Test()
	public void deleteTask()
	{
		Reporter.log("Tasks deleted successfully");
	}
	
	@Test(groups= {"smoke"})
	public void closeTask()
	{
		Reporter.log("Task closed successfully");
	}
	
	

}
