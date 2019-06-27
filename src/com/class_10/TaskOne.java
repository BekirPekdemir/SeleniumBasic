package com.class_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TaskOne extends CommonMethods{

	public static void main(String[] args) {

//		Table headers and rows verification
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Sortable Data Tables” link
//		Verify tables consist of 4 rows and 6 columns
//		Print name of all column headers
//		Print data of all rows
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[@href='/tables']")).click();
		
		List<WebElement> table1rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
        int rowcount=0;
        int columncount=0;
        
        List<WebElement> table1Columns = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
        
        for(WebElement table1row : table1rows ) {
            rowcount++;
        }
       
        System.out.println(rowcount);

        for(WebElement table1Column : table1Columns) {
            columncount++;
            
        }
        
        System.out.println(columncount);
		
	}
		
}


