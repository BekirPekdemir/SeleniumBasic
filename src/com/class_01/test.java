package com.class_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://google.com");
//		driver.get("https://facebook.com");
//		driver.get("https://amazon.com");
//		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bekir\\Selenium\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://google.com");
		driver1.navigate().to("http://apple.com");
		String URL="http://apple.com";
		driver1.navigate().back();
	}

}
