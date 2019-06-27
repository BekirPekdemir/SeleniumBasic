package com.class_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHomework {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//bekir//Selenium//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Balli");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Tereyagi");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='phone']")).sendKeys("2543695847");//
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@id='userName']")).sendKeys("balli@hotmail.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='address1']")).sendKeys("1245 Main Rd");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='city']")).sendKeys("Fairfax");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("22033");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("Balim");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("789456");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("789456");
		dr.findElement(By.xpath("//input[@name='register']")).click();
		//dr.close();
	}

}
