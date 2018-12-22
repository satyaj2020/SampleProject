package com.companyname.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.drivers.driverfactory;
import com.company.pageObjects.HomePage;

public class TestLogin extends driverfactory {

	@Test
	public void testLogIn() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.login("satyaj2020@gmail.com", "satya1987");
		
		Thread.sleep(3000);
		String atcualText = hp.profile.getText();
		Assert.assertEquals(atcualText, "Flipkart");
	}

}
