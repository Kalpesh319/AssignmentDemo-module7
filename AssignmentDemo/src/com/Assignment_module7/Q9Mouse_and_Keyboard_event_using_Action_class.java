package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Q9Mouse_and_Keyboard_event_using_Action_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver d1=new EdgeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		WebElement home=d1.findElement(By.partialLinkText("Home"));
		WebElement flight= d1.findElement(By.partialLinkText("Flights"));
		WebElement  hotels=d1.findElement(By.partialLinkText("Hotels"));
		WebElement  carrentals= d1.findElement(By.partialLinkText("Car Rentals"));
		
		Actions actions=new Actions(d1);
		
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flight).build();
		a2.perform();
		Thread.sleep(2000);
		
	
		Action a3=actions.moveToElement(hotels).build();
		a3.perform();
		Thread.sleep(2000);
		
		Action a4=actions.moveToElement(carrentals).build();
		a4.perform();
		Thread.sleep(2000);
		
		d1.close();
		
		
		
		
		
		
		
		
		
		

	}

}
