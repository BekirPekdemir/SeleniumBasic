package com.MyExcersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExersize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Partial")).click(); //this is partial link text'Partial'
		Thread.sleep(1500);
		driver.findElement(By.linkText("Link Test")).click();//this is link text 'Link Test'
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");//find element with attribute
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("White");
		
		
		
	}

}
