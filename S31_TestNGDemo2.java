package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S31_TestNGDemo2 {

		@BeforeClass
		public void openApp()
		{
			Reporter.log("Open the Application", true);
		}
		@AfterClass
		public void closeApp()
		{
			Reporter.log("Close the Application", true);
		}
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
		@Test
		public void display()
		{
			Reporter.log("Display User", true);
		}
		@Test
		public void createUser()
		{
			Reporter.log("Create User", true);
		}
		@Test
		public void deleteUser()
		{
			Reporter.log("Delete User", true);
		}
	}



