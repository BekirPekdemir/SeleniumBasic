package com.MyExcersize;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/bekir/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Launch the Application Under Test (AUT)
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Double click the button to launch an alertbox
		Actions actions= new Actions(driver);
		WebElement bendeniz=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Thread.sleep(2000);
		actions.doubleClick(bendeniz).perform();
		
		//Switch to the alert box and click on OK button
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text \n "+alert.getText());
		alert.accept();
		
		//Closing the driver instance
		//driver.quit();
		
	}

}
