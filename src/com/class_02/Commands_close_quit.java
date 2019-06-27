package com.class_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_close_quit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://tumblr.com");	// it opens webpage what exactly you want
		
		driver.navigate().refresh();		// it refreshes your webpage
		
		driver.navigate().to("http://google.com"); // exactly same with the get method
		
		driver.navigate().back();			// it helps you to go previous webpage
		
		Thread.sleep(1500); 				// With this code your script is getting slower
		
		driver.navigate().forward();		// it helps you to go forward webpage
		
		driver.close();						// it closes current tab

//		driver.quit();						// closes all tabs
	
	}

}
