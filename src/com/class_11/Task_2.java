package com.class_11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task_2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//form[@id='frmLogin']/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//form[@id='frmLogin']/div[3]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
