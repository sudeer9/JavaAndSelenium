package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S36_TestNGGroups 
{
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("Login", true);
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("Logout", true);
	}
	
	
	@Test(groups= {"Customer", "Smoke"})
	public void createCustomer()
	{
		Reporter.log("Create Customer", true);
	}
	
	
	@Test(enabled=false,groups= {"Customer"})
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer", true);
	}
	
	
	@Test(groups= {"Project", "Smoke"})
	public void createProject()
	{
		Reporter.log("Create Project", true);
	}
	
	
	@Test(groups= {"Project"})
	public void deleteProject()
	{
		Reporter.log("Delete Project", true);
	}
}

