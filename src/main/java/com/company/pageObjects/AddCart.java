package com.company.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.drivers.driverfactory;

public class AddCart extends driverfactory{

	
	
	@FindBy(xpath="/html/body/div[1]/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")
	public WebElement search;
	@FindBy(xpath="/html/body/div[1]/div/header/div[1]/div/div[2]/form/div/div[2]/button")
	public WebElement searchclick;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")
	public WebElement MiRedme6;
	
	
	public AddCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
