package com.ca.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.baseclass.TestBase;
import com.ca.pages.HomePage;

public class HomePageTest extends TestBase{

	TestBase testbase = new TestBase();
	public static HomePage homepage;
	
	
	
	@BeforeMethod
	public void SetUp() {
		testbase.initBrowser();	
		homepage = new HomePage();
	}
	
	@Test
	public void validateSearch() {
		homepage.searchForProperties();
		Assert.assertEquals(HomePage.text, "Property for sale in London");
		
	}
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
}
