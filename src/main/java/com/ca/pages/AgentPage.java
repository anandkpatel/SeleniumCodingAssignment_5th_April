package com.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ca.baseclass.TestBase;

public class AgentPage extends TestBase{
	
	
	@FindBy(xpath = "//h1[@class = 'bottom-half']//b[1]")
	WebElement title;
	
	public AgentPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String gettitle() {
		String agentPageTitle = title.getText();
		return agentPageTitle;
	}
	

}