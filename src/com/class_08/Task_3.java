package com.class_08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task_3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
     CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
     driver.findElement(By.xpath("//a[text()='Actions']")).click();
	 driver.findElement(By.xpath("//button[text()='Click Me !']")).click();
     Thread.sleep(3000);
     
     Alert alert = driver.switchTo().alert();
     alert.accept();

     WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me !']"));
     
     Actions action = new Actions(driver);
     action.doubleClick(doubleClick).perform();
     Thread.sleep(3000);

     Alert alert1 = driver.switchTo().alert();
     alert1.accept();
     Thread.sleep(3000);
     
     driver.close();
 
	}

}
