package com.class_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_facebook {

	public static void main(String[] args) {
		
		/*
		 * Access facebook
		 * fill email and password
		 * click log in 
		 * check it
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.findElement(By.id("email")).sendKeys("bekir@gmail.com");
		driver1.findElement(By.id("pass")).sendKeys("123456");
		driver1.findElement(By.id("u_0_2")).click();
	}

}
