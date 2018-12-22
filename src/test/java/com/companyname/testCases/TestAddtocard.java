package com.companyname.testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.company.drivers.driverfactory;
import com.company.pageObjects.AddCart;
import com.company.pageObjects.HomePage;

public class TestAddtocard extends driverfactory {

	@Test

	public void addCart() throws InterruptedException {
		AddCart ac = new AddCart(driver);
		HomePage hp = new HomePage(driver);

		hp.login("satyaj2020@gmail.com", "satya1987");

		Thread.sleep(5000);
		
	
       
		ac.search.sendKeys("MiRedme6");
		ac.searchclick.click();
		ac.MiRedme6.click();
		

	
	}

}
