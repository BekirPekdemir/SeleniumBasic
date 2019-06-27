package com.class_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task_1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement task = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(task).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		
	}

}
