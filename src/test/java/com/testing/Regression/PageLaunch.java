package com.testing.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageLaunch {
	
	
	
	public WebDriver driver;
	
	@BeforeClass
	public void initBrowser()
	{
		
		System.setProperty("webdriver.chorme.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	
	
	}
	
	@Test
	public void launchBrowser()
	{
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void verifyPageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals("My Store", title,"Page title did not match");
	}
	
	@Test
	public void getTheWindowHandles()
	{
		String handle=driver.getWindowHandle();
		
		System.out.println("the window Handle is "+handle);
		
	}
	
	@Test
	public void getCurrentUrl()
	{
		System.out.println("the Current Page URL is : "+driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void beforeTestBegin()
	{
		System.out.println("***********The Test Starts**********");
	}
	@AfterMethod
	public void afterTestEnds()
	{
		System.out.println("***********The Test Ends*************");
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
