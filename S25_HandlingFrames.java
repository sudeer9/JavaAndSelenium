package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S25_HandlingFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//Open the browser
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///D:/JavaAndSelenium/BesantTechnology%20docs/Selenium%20Concepts/HTMLcode/Frames/page1.html");
		driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("a2")).sendKeys("Abc");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.quit();
	}

}
