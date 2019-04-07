package com.ca.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ca.baseclass.TestBase;

public class HomePage extends TestBase {

	public static String text;
	
	
	@FindBy(id = "search-input-location")
	@CacheLookup
	WebElement searchBar;
	
	@FindBy(id = "search-submit")
	@CacheLookup
	WebElement submitBtn;
	
	@FindBy(xpath = "//h1[@style = 'font-weight: normal; margin-bottom: 1.4em; margin-top: .2em;']")
	WebElement title;
	public HomePage() {
		PageFactory.initElements(driver, this);
				
	}


	public PropertyPage searchForProperties() {
		searchBar.sendKeys(location);
		submitBtn.click();
		text = title.getText();
		return new PropertyPage();
		
	}


}




