package com.cbt;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;

	public class GoogleSearch {

		public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", 
					"/Users/gayeonbaeg/Documents/Selenium dependencies/drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.etsy.com");

			
	}

}
