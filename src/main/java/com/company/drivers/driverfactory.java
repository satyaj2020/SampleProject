package com.company.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class driverfactory {
	
	protected WebDriver driver;
	String url;
	
	@BeforeTest
	public WebDriver init()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Automation\\gecko\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		 
		 url = "https://www.flipkart.com/";
		 driver.get(url);
		 return this.driver=driver;			
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
