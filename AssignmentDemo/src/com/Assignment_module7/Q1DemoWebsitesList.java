package com.Assignment_module7;
/* DEMO WEBSITES TO PRACTICE FOR SELENIUM WEBDRIVER;
 * #LIST OF THE SELENIUM wEBDRIVER
 * 
/*1.1 1. https://phptravels.com/demo/
o 1.2 2. http://thedemosite.co.uk/
o 1.3 3. http://newtours.demoaut.com/
o 1.4 4. http://the-internet.herokuapp.com/
o 1.5 5. http://automationpractice.com/index.php/
o 1.6 6. http://book.theautomatedtester.co.uk/
o 1.7 7. https://s1.demo.opensourcecms.com/wordpress
  
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q1DemoWebsitesList {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();


driver.get("https://phptravels.com/demo/");
Thread.sleep(2000);
driver.get("http://thedemosite.co.uk/");
Thread.sleep(2000);
driver.get("http://newtours.demoaut.com/");
Thread.sleep(2000);
driver.get("http://the-internet.herokuapp.com");
Thread.sleep(2000);
//driver.get("http://automationpractice.com/index.php/");
//Thread.sleep(2000);
//driver.get("http://book.theautomatedtester.co.uk/");
//Thread.sleep(2000);
driver.get("https://s1.demo.opensourcecms.com/wordpress");
Thread.sleep(2000);


driver.quit();

	}
}

