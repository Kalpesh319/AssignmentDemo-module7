package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3Dropdown_multiple_Select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jsbin.com/osebed/2");
		WebElement e1=driver.findElement(By.id("fruits"));
		Select s=new Select(e1);
	    for (int i = 0; i < 4; i++) {
	    	s.selectByIndex(i);
	    	Thread.sleep(2000);
			
		}
	    driver.close();
	    driver.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
