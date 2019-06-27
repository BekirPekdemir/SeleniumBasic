package com.class_04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTask {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		WebDriver dr = new ChromeDriver();    
		dr.navigate().to("https://www.saucedemo.com/");
		dr.findElement(By.xpath("//input[contains(@id,'-name')]")).sendKeys("standard_user");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[contains(@class,'bt')]")).click();
		Thread.sleep(3000);
		dr.navigate().back();
		dr.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		
	}

}
