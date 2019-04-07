package com.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ca.baseclass.TestBase;

public class PropDetailsPage extends TestBase{
	
	
	public static String logo;
	public static String name;
	public static String contact_no;
	
	
	@FindBy(xpath = "//div[@class = 'dp-sidebar-wrapper__contact']//img")
	@CacheLookup
	WebElement Logo;
	
	@FindBy(xpath = "//div[@class = 'dp-sidebar-wrapper__contact']//h4")
	@CacheLookup
	WebElement Name;
	
	@FindBy(xpath = "//div[@class = 'dp-sidebar-wrapper__contact']//a[@class = 'ui-link']")
	@CacheLookup
	WebElement Contact_No;
	
	public PropDetailsPage() {
		PageFactory.initElements(driver, this);
	}



	public void agent_details() {
		 logo = Logo.getAttribute("src");
		 name = Name.getText();
		 contact_no = Contact_No.getAttribute("href");
		 }


	public AgentPage clickOnAgentName() {
		Name.click();
		return new AgentPage();
	}



}
