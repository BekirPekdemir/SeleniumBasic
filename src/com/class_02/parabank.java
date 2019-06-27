package com.class_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) throws InterruptedException {
//		https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Bekir");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Pekdemir");
		driver.findElement(By.id("customer.address.street")).sendKeys("1111 Dixie Rd");
		driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22030");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("5715555555");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("575-55-5555");
		driver.findElement(By.id("customer.username")).sendKeys("BekirPekdemir");
		driver.findElement(By.id("customer.password")).sendKeys("WerF123pol");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("WerF123pol");
		driver.findElement(By.className("button")).click();
		
		
				// ((JavascriptExecutor)driver).executeScript("window.open();");

				// The script that will will open a new blank window
				// If you want to open a link new tab, replace 'about:blank' with a link
				
				//	String a = "window.open('about:blank','_blank');";
				//	((JavascriptExecutor)driver).executeScript(a);
	}
}

