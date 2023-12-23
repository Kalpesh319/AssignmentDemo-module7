package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8Dropdown_SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("country"));
		Select s1=new Select(e1);
		s1.selectByIndex(12); 
		Thread.sleep(200);
		//s1.selectByVisibleText("AUSTRALIA");
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
