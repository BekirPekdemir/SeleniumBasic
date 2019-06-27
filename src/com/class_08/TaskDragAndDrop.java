package com.class_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskDragAndDrop extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://jqueryui.com/droppable");
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		
		WebElement target = driver.findElement(By.cssSelector("div#draggable"));
		WebElement source = driver.findElement(By.cssSelector("div#droppable"));
		
		//action.clickAndHold(target).moveToElement(source).release().build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(target, source).build().perform();
	}

}
