package com.MyExcersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

	WebDriver bende;
	System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
	bende=new ChromeDriver();
	
	//Launch the Application Under Test (AUT)
	bende.get("http://demo.guru99.com/test/simple_context_menu.html");
	bende.manage().window().maximize();
	
	// Right click the button to launch right click menu options
	Actions actions=new Actions(bende);
	WebElement link=bende.findElement(By.xpath("//span[text()='right click me']"));
	actions.contextClick(link).perform();
	
	// Click on Edit link on the displayed menu options
	WebElement element = bende.findElement(By.cssSelector(".context-menu-icon-copy"));
	element.click();
	// Accept the alert displayed
	//driver.switchTo().alert().accept();
	// Closing the driver instance
	//driver.quit();

	
	
	
	
	
	
	
	}

}
