package com.MyExcersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateInstagramAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1100);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneafricantrade@gmail.com");
		Thread.sleep(1100);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("African Trade");
		Thread.sleep(1100);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("OneAfricanTrade");
		Thread.sleep(1100);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1471SAVk");
		Thread.sleep(1100);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.quit();
		

	}

}
