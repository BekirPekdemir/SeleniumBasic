package com.class_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSyntax {

	public static void main(String[] args) {
		
		/* TC 2: Syntax Page URL Verification: Open chrome browser 
		 * Navigate to “https://www.syntaxtechs.com/” 
		 * Navigate to “https://www.google.com/” 
		 * Navigate back to Syntax Technologies Page 
		 * Refresh current page
		 * Verify URL contains “Syntax”
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekir\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://syntaxtechs.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.close();
		String SyntaxURL = "http://syntaxtechs.com";
		if(SyntaxURL.contains("syntax")) {
			System.out.println("true");
		}else {
			System.out.println("false");
	}
	}
}
