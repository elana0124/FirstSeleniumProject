package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"/Users/gayeonbaeg/Documents/Selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cybertekschool.com");
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.google.com");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://www.amazon.com");

//	
//		
//		System.setProperty("webdriver.chrome.driver", 
//				"/Users/gayeonbaeg/Documents/Selenium dependencies/drivers/geckodriver");		
//		WebDriver driver2 = new FirefoxDriver();		
//		driver2.get("http://www.cybertekschool.com");
//
//		
//		
//		WebDriver driver3 = new SafariDriver();
	}

}
