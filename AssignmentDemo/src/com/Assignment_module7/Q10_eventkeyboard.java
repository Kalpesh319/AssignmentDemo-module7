package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q10_eventkeyboard {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
			
		driver.get("http://demo.guru99.com/test/delete_customer.php");	
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}
			
	}


