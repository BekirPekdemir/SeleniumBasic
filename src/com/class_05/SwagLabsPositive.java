package com.class_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPositive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
	        
		boolean isDisplayed=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
	        if (isDisplayed) {

	            System.out.println("WebOrder logo is displayed");

	        } else {

	            System.out.println("WebOrder logo is NOT displayed");
	        }

	    boolean isdisplayed = driver.findElement(By.cssSelector("div.product_label")).isDisplayed();
	        if (isdisplayed) {

	            System.out.println("WebOrder Te xt is displayed");

	        } else {

	            System.out.println("WebOrder Text is NOT displayed");
	        }
	     Thread.sleep(3000);
	     driver.quit();

	}

}
