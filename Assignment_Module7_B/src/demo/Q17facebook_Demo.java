package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q17facebook_Demo {
	WebDriver driver;

	@Test
	@Parameters({"username","password"})
	public void f(String username, String password) throws InterruptedException {
		  System.setProperty("webdriver.edge.driver","C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");

		 driver= new EdgeDriver();
		   
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(1000);


		  driver.findElement(By.id("email")).sendKeys(username);
		   Thread.sleep(1000);

		  driver.findElement(By.id("pass")).sendKeys(password);
		  Thread.sleep(1000); 
		   
		  driver.findElement(By.name("login"));
		  Thread.sleep(1000);
		  	
		  driver.close();	
		}
}
