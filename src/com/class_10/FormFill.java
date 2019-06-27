package com.class_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class FormFill extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://www.uitestpractice.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Okinawa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Kayukime");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[4]")).click();
		WebElement DD = driver.findElement(By.xpath("//*[@id=\"sel1\"]"));
		DD.click();
		Thread.sleep(1000);
		
		Select slc=new Select(DD);
		//slc.selectByIndex(13);
		slc.selectByVisibleText("Canada");
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("01/01/2000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"phonenumber\"]")).sendKeys("57133322211");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Okinava");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("okinava@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Motivate, Sociable, Friendly, Realistic");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("112233nM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button")).click();
		
		
		
	}
}
