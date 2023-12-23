package com.Assignment_module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * http://demo.guru99.com/test/web-table-element.php
 */
public class Q12_To_find_the_total_hyperlink_from_this_web_page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	List<WebElement>th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("no of coloumn are....."+th.size());       // table header.
	for (int i = 1; i <=th.size(); i++) {
		 String th_name=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();	
		System.out.print("   |   "+th_name);
	}
	
	System.out.println();
	List<WebElement>tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("no of rows are....."+tr.size()); 
/*	for (int i = 1; i <=tr.size(); i++) {
		String tr_data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();
		System.out.println(" first coloumn :   "+tr_data);
	}*/
	for (int i = 1; i <=tr.size(); i++) {
		for (int j = 1; j <=th.size() ; j++) {
			
		
		String tr_data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print("      "+tr_data);
		
	}
	System.out.println();
	Thread.sleep(2000);
		
	}
		
	}
}


