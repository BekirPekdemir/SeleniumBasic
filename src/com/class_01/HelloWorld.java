package com.class_01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {


		//  System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		//	WebDriver driver=new ChromeDriver();
		//	driver.get("http://google.com");		
		//	driver.get("http://amazon.com");
		//	driver.get("http://facebook.com");
		
		//	WebDriver driver=new ChromeDriver();
		//	driver.get("http://google.com");
		//	WebDriver driver1=new ChromeDriver();
		//	driver1.get("http://amazon.com");
		//	WebDriver driver2=new ChromeDriver();
		//	driver.get("http://facebook.com");
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/bekir/Selenium/geckodriver.exe");
		WebDriver test=new FirefoxDriver();
		test.get("http://amazon.com");
		//	WebDriver test1=new FirefoxDriver();
		//	test.get("http://facebook.com");
		String z = "window.open('http://petco.com','_blank');";
		((JavascriptExecutor)test).executeScript(z);
		//	WebDriver test2=new FirefoxDriver();
		//	test.get("http://petco.com");
		String q = "window.open('https://us.graze.com/','_blank');";
		((JavascriptExecutor)test).executeScript(q);
		
		((JavascriptExecutor)test).executeScript("window.open();");
		//((JavascriptExecutor)test).executeScript("window.open();");
		
		//	The script that will will open a new blank window
		//	If you want to open a link new tab, replace 'about:blank' with a link
		//	String a = "window.open('about:blank','_blank');";
		//	((JavascriptExecutor)test).executeScript(a);
	}

}
