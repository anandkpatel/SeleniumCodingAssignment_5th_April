package com.ca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.baseclass.TestBase;
import com.ca.pages.HomePage;
import com.ca.pages.PropDetailsPage;
import com.ca.pages.PropertyPage;

public class PropertyDetailsPageTest extends TestBase {

	TestBase testbase = new TestBase();
	public static HomePage homepage;
	public static PropertyPage propertypage;
	public static PropDetailsPage propdetailspage;
	
	@BeforeMethod
	public void SetUp() {
		testbase.initBrowser();	
		homepage = new HomePage();
		propertypage = new PropertyPage();
		homepage.searchForProperties();
		propdetailspage = new PropDetailsPage();
		propertypage.clickOnProperty();
		
	
	}
	
	
	@Test(priority = 1)
	public void printAgentdetails() {
		propdetailspage.agent_details();
		System.out.println("Agent name is ---> " + PropDetailsPage.name);
		System.out.println("Agent Contact Number is ---> " + PropDetailsPage.contact_no);
		System.out.println("Agent Logo is --->" + PropDetailsPage.logo);
	
	}
	
	
	
	@Test(priority = 2)
	public void clickOnAgentNameLink() {
		propdetailspage.clickOnAgentName();
			
		
	}
	
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
}
