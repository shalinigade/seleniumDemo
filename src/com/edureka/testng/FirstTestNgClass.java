package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class FirstTestNgClass {

	@Test
	public void display()
	{
		Reporter.log("First TestNg Class");
	}
}
