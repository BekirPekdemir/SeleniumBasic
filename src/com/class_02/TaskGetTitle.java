package com.class_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskGetTitle {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");	
		//  WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new ChromeDriver();
		//	driver.get("http://amazon.com");
		//	driver.get("https://www.gmail.com");
		//		
		//	WebDriver driver1 = new ChromeDriver();
		//	driver1.get("http://google.com");
		//	driver1.get("http://hurriyet.com");
	
	
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://google.com");
	System.out.println(driver1.getTitle());
	driver1.get("https://www.seleniumhq.org");
	System.out.println(driver1.getTitle());
	driver1.get("https://amazon.com");
	System.out.println(driver1.getTitle());
	
	
	}

}
