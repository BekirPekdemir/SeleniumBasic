package com.class_05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		
		int count=0;
		Iterator<WebElement> it=links.iterator();
			while(it.hasNext()) {
				WebElement text=it.next();
				String text1=text.getText();
				if (!text1.isEmpty()) {
						System.out.println(text1);
						count++;
					}
				}
				System.out.println("Total number of links with text "+count);
				
				driver.quit();

	}

}
