package com.Assignment_module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q5Register_Yourself_in_gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?");
driver.findElement(By.name("identifier")).sendKeys("kalpeshsaindane319@gmail.com");
//driver.findElement(By.cssSelector("div.VfPpkd-vQzf8d")).click();
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
Thread.sleep(2000);

//driver.findElement(By.xpath("//*[@id=\"next\"]/div/div/a")).click();
driver.findElement(By.cssSelector("div.VfPpkd-J1Ukfc-LhBDec")).click();// by class
//driver.findElement(By.cssSelector("a[aria-label='Try again']")).click();// by attribute
Thread.sleep(2000);
//driver.close();
driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
