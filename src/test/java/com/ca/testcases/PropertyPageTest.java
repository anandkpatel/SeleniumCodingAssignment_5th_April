package com.ca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.baseclass.TestBase;
import com.ca.pages.HomePage;
import com.ca.pages.PropertyPage;

public class PropertyPageTest extends TestBase {

	TestBase testbase = new TestBase();
	public static HomePage homepage;
	public static PropertyPage propertypage;
	

	@BeforeMethod
	public void SetUp() {
		testbase.initBrowser();	
		homepage = new HomePage();
		propertypage = new PropertyPage();
		homepage.searchForProperties();
	}
	
	
	@Test(priority=1)
	public void PrintPriceList() {
		propertypage.price_list();
				
	}
	
	@Test(priority=2)
	public void click_on_5th_property() {
		propertypage.clickOnProperty();
		
	}
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	

}
