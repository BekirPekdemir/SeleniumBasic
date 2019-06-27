package com.class_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exersize1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bekir\\Selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement name= driver.findElement(By.cssSelector("input[name='firstname']"));
	    Thread.sleep(2000);
		name.sendKeys("Mehmet");
		Thread.sleep(2000);
		name.clear();
		Thread.sleep(2000);
		name.sendKeys("Bekir");
	    driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Pekdemir");
	    Thread.sleep(2000);
	    
	    WebElement maleRadio=driver.findElement(By.cssSelector("input#sex-0"));
	    maleRadio.click();
	    
	    driver.findElement(By.xpath("//input[contains(@id,'exp-3')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#datepicker")).sendKeys("5/18/2019");
	    
	    WebElement abc=driver.findElement(By.xpath("//input[starts-with(@value,'Au')]"));
	    abc.click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id='tool-2']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("select#continents")).click();
	    Thread.sleep(2000);
	    
	    Select Continents=new Select(driver.findElement(By.cssSelector("select#continents")));
	    Continents.selectByVisibleText("Asia");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[31]/p")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div/div[5]/div[2]/div/div/div/div/div/div/div[2]/div/form/fieldset/div[34]/div/button[@id='submit']")).click();
	   
	}

}
