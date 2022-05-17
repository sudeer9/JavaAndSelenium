package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class S33_BaseClass 
{
	
		@BeforeMethod
		public void login()
		{
			Reporter.log("Login", true);
		}
		
		@AfterMethod
		public void logout()
		{
			Reporter.log("Logout", true);
		}
		

	

}
