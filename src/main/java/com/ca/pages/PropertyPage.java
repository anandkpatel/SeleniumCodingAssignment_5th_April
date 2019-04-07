package com.ca.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ca.baseclass.TestBase;

public class PropertyPage extends TestBase {
	
	String price;
	
	@FindAll({@FindBy(xpath = "//a[@class = 'listing-results-price text-price']")})
	@CacheLookup
	public List<WebElement> allprice;
	
	
	@FindBy(xpath = "//li[@class = 'srp clearfix   '][5]//a[@class = 'photo-hover']")
	@CacheLookup
	WebElement property_5;
	
	public PropertyPage() {
		PageFactory.initElements(driver, this);
	}
		
	public void price_list() {
	
			ArrayList<String> obtainedList = new ArrayList<String>(); 
			for(WebElement we:allprice){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<String>();   
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			for(String st: sortedList) {
			
			System.out.println(st);
			}
	}

	
	public PropDetailsPage clickOnProperty() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		property_5.click();
		return new PropDetailsPage();
		
		
	}
	
	
	
	   //a[@class = 'listing-results-price text-price']	
}
