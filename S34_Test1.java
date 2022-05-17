package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S34_Test1 extends S33_BaseClass
{
	
	@Test
	void test1()
	{
		System.out.println("test1");
		Reporter.log("t1");
		Reporter.log("t2",false);
		Reporter.log("t3",true);
	}
	
	
}
