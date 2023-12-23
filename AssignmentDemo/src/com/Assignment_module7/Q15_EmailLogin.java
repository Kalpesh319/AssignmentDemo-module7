package com.Assignment_module7;
/*
 * 
 * W.a. junit program to check gmail login using with
@before,@after,@Test
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q15_EmailLogin {

	WebDriver driver; // global webdriver

	@BeforeMethod
	public void SetBroswerAndUrll() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void Loginn() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("kalpeshsaindane319@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("17111997");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	}
	
	@AfterMethod
	public void CloseBrowserr() {
	driver.close();	
	}
	

	
	
	

}
