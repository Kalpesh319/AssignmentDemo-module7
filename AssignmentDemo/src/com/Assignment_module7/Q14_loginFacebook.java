package com.Assignment_module7;
/*W.a. junit program to perform test with webdriver to login process of
  facebook

 * 
 * 
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q14_loginFacebook {
WebDriver driver= null;  //declare webdriver global
	
	@Before
	
	public void before() {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		
		
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
			
	}
	@Test
	public void Login() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9420102292");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("17111997");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	
		
	}

	@After
	public void after() throws InterruptedException{
		Thread.sleep(2000);
	
	

	}
	

}
