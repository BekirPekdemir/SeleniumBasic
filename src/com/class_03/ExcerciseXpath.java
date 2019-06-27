package com.class_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("https://www.toolsqa.com");
		dr.findElement(By.linkText("DEMO SITES")).click();
		

	}

}
