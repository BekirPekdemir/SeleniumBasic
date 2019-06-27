package com.class_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("this is the right title ");
		}else {
			System.out.println("sorry this not the title ");

	}
	}
}
