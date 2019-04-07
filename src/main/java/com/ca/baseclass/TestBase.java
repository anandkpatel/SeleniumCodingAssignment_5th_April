package com.ca.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ca.utility.PropReading;

public class TestBase {
	
	 PropReading propreading = new PropReading();
	
	public String baseurl = propreading.getUrl();
	public String location = propreading.getLocation();
	public String path = propreading.getDriverPath();
	public static WebDriver driver;
	
	
	public void initBrowser() {
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
	}
	
	

}
