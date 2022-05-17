package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S31_TestNGDemo2 {

		@BeforeMethod
		public void login()
		{
			Reporter.log("Login to app", true);
		}
		
		@AfterMethod
		public void logout()
		{
			Reporter.log("Logout from app", true);
		}
		
		@BeforeClass
		public void openApp()
		{
			Reporter.log("Open the application",true);
		}
		
		@AfterClass
		public void closeApp()
		{
			Reporter.log("close the application",true);
		}
		
		@Test(priority = 1)
		public void display()
		{
			Reporter.log("Display User", true);
		}
		@Test(priority = 3)
		public void createUser()
		{
			Reporter.log("Create User", true);
		}
		@Test(priority = 2)
		public void deleteUser()
		{
			Reporter.log("Delete User", true);
		}
		
		
	}



