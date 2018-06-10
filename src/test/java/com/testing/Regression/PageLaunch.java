package com.testing.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
