package com.class_12;

/*
TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class ReadingPropertyFile extends CommonMethods {
	Properties prop;
	
	@Test
	public void readFile() throws IOException {
		String filePath="src/configs/credentials.properties";
				
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		///String browser=prop.get("");
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		
		
		CommonMethods.driver.quit();
		
	}

}
