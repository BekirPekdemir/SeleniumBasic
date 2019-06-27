package com.class_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercize_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		
		
		
		
		
	}

}
