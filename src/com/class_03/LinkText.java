package com.class_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			

		System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1500);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("firstName")).sendKeys("Bek");
		Thread.sleep(1500);
		driver.findElement(By.name("lastName")).sendKeys("Pek");
		Thread.sleep(1500);
		driver.findElement(By.name("phone")).sendKeys("545214658");
		Thread.sleep(1500);
		driver.findElement(By.id("userName")).sendKeys("biri@gmai.com");
		Thread.sleep(1500);
		driver.findElement(By.name("address1")).sendKeys("4040 Dixie");
		Thread.sleep(1500);
		driver.findElement(By.name("city")).sendKeys("fairfax");
		Thread.sleep(1500);
		driver.findElement(By.name("state")).sendKeys("VA");
		Thread.sleep(1500);
		driver.findElement(By.name("postalCode")).sendKeys("33002");
		Thread.sleep(1500);
		driver.findElement(By.name("register")).sendKeys("BP");
		Thread.sleep(1500);
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(1500);
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		driver.close();
	}

}
