package com.ca.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.baseclass.TestBase;
import com.ca.pages.AgentPage;
import com.ca.pages.HomePage;
import com.ca.pages.PropDetailsPage;
import com.ca.pages.PropertyPage;

public class AgentPageTest extends TestBase{

	
	TestBase testbase = new TestBase();
	public static HomePage homepage;
	public static PropertyPage propertypage;
	public static PropDetailsPage propdetailspage;
	public static AgentPage agentpage;
	
	@BeforeMethod
	public void SetUp() {
		testbase.initBrowser();	
		homepage = new HomePage();
		propertypage = new PropertyPage();
		homepage.searchForProperties();
		propdetailspage = new PropDetailsPage();
		propertypage.clickOnProperty();
		propdetailspage.agent_details();
		agentpage = new AgentPage();
		propdetailspage.clickOnAgentName();
		
	
	}
	
	
	@Test
	public void verify_Agent_Name() {
		String expected = PropDetailsPage.name;
		String nameOnAgentPage = agentpage.gettitle();
		Assert.assertEquals(nameOnAgentPage, expected);
		
		
	}
	

	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
