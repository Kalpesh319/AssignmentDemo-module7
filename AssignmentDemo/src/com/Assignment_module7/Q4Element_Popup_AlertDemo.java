package com.Assignment_module7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q4Element_Popup_AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
/*		
	String main_window = driver.getWindowHandles();
	System.out.println("main window adress:"+main_window);
	driver.findElement(By.partialLinkText(main_window))
		
		*/
		
		
		
		
		
}	

}
