package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2Script_for_Locating_Link_by_LinkText_and_Partiallink {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("9426885352");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("17111997");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		//LINKTEXT {click first time then show underline }
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(2000);
		
		//PARTIAL lLINKTEXT {click on the link then show underline second time }
		driver.findElement(By.partialLinkText("Forg")).click();


driver.close();
driver.quit();
	}
}