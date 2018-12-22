package com.company.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.company.drivers.driverfactory;

public class HomePage extends driverfactory {

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement cross;
	@FindBy(xpath = "/html/body/div[1]/div/header/div[1]/div/div[3]/div[1]")
	public WebElement loginSignup;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement username;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public WebElement password;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	public WebElement login;

	@FindBy(xpath = "/html/body/div[1]/div/header/div[1]/div/div[3]/div[1]/div/div/div/span/div")
	public WebElement profile;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String userName, String passcode) {

		cross.click();
		loginSignup.click();
		username.sendKeys("satyaj2020@gmail.com");
		password.sendKeys("satya1987");
		login.click();
		
	}
}
