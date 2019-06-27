package com.class_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

	//Verify element is clickable
	//1.Open chrome browser
	//2.Go to “https://the-internet.herokuapp.com/”
	//3.Click on “Click on the “Dynamic Controls” link
	//4.Select checkbox and click Remove
	//5.Click on Add button and verify “It's back!” text is displayed
	//6.Close the browser

public class TaskTwo extends CommonMethods{

	public static void main(String[] args) {

		String url="https://the-internet.herokuapp.com/";
        setUpDriver("chrome",url);
        
        driver.findElement(By.linkText("Dynamic Controls")).click();
        
        WebElement element;
        element=driver.findElement(By.xpath("//input[@type='checkbox']"));
        
        if(!element.isSelected()) {
        element.click();
            }else {
                System.out.println("element is NOT Selected");
            }
        
        element=driver.findElement(By.xpath("//button[text()='Remove']"));
        element.click();
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
        
        element=driver.findElement(By.xpath("//button[text()='Add']"));
        element.click();
        
        wait.until(ExpectedConditions.visibilityOf(element));
        
        WebElement message=driver.findElement(By.id("message"));
        
        if(message.isDisplayed()) {
            String text=message.getText();
            System.out.println(text);
            
        }else {
            System.out.println(" element is Not displayed");
        }
        driver.quit(); 

	}

}
