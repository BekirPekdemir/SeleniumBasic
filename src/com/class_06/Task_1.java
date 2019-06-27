package com.class_06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	    driver.get("http://amazon.com/");
	    
	    WebElement Department=    driver.findElement(By.cssSelector("select#searchDropdownBox"));
	    
	    Select select = new Select(Department);
	    
	    List<WebElement> allDep = select.getOptions();

	    System.out.println("Number of option in Department = " + allDep.size());

	    System.out.println("------ all options from Department -------");

	    Iterator<WebElement> it = allDep.iterator();

	    while (it.hasNext()) {

	        String obj = it.next().getText();

	        System.out.println(obj);

	    }
	    select.selectByVisibleText("Computers");

	    Thread.sleep(3000);
	    driver.quit();

	}

}
