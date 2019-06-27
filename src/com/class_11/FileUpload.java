package com.class_11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(1500);
		
		String filePath="C:\\Users\\bekir\\OneDrive\\Masaüstü\\Jason Mangum.pdf";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File uploaded successfully");

		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(pic, new  File("screenshots/TheInternet/FileUpload.png"));
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		Thread.sleep(2500);
		driver.close();
		}
}