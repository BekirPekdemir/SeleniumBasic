package com.class_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
