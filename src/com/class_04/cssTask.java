package com.class_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssTask {
	//	TAG AND ATTRIBUTE
	//driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");

	//	TAG AND ID VALUE
	//driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

	//	TAG AND CLASS
	//driver.findElement(By.cssSelector("input.btn_action")).click();
	//driver.navigate().back();
	
	//	^ = STARTS WITH IN CSS
	//	input[placeholder^='User']		INSTEAD OF UserName
	
	//	$ = ENDS WITH
	//	input[data-test$='word'] 		INSTEAD OF PASSWORD
	
	//	* = CONTAINS
	//	input[value*='LOG']				INSTEAD OF LOGIN





	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	  
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.btn_action")).click();
	
	}

}
