package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q11_to_handled_Alert_in_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("123"); // fill the 123 
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept();// for only ok 
		driver.switchTo().alert().dismiss();  /// for the cancel the customer form 
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();
		
		
		
		
		
		

			
	}
}

