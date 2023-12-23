package com.Assignment_module7;
/*
 * W.A.J. Script To perform the radio button to select one by one in loop
http://demo.guru99.com/test/radio.htm
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q6Radiobutton_perform {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		for (int i = 1; i <=3; i++) {                     // for loop use for the multiple clicks here, i=1 means start from 1 checkbox to 3.
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(2000);
		}	
		driver.close();
}

}
