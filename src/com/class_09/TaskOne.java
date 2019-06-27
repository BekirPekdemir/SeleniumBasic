package com.class_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TaskOne extends CommonMethods {

	public static void main(String[] args) {

// Verify element is present
// Open chrome browser
// Go to “https://the-internet.herokuapp.com/”
// Click on “Click on the “Dynamic Loading” link
// Click on “Example 1...” and click on “Start”
// Verify element with text “Hello World!” is displayed
// Close the browser

		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish")));
		
	    WebElement ele= driver.findElement(By.xpath("html/body/div/div/div/div[3]/h4"));//h4[text()='Hello World!']
		ele.click();
		
		if(ele.isDisplayed()) {
			String text=ele.getText();
			System.out.println("Element is "+text);
		}else {
			System.out.println("Element is not displayed");
		}
		//driver.quit();
	
	
	}

}
