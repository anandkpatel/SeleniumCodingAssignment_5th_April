package com.ca.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReading {
	
	public static Properties prop;
	
	
	public PropReading() {
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("C:\\Users\\Anand\\eclipse\\java_code\\SeleniumCodingAssignment_5th_April\\src\\main\\java\\com\\ca\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	public String getUrl() {
		String Url = prop.getProperty("url");
		return Url;
		
	}
	
	public String getLocation() {
		String Location = prop.getProperty("location");
		return Location;
		
	}
	
	public String getDriverPath() {
		String path = prop.getProperty("driverPath");
		return path;
		
		
	}
	
	

}
