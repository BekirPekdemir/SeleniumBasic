package com.class_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		WebDriver test=new ChromeDriver();
		test.get("http://amazon.com");
	}

}
