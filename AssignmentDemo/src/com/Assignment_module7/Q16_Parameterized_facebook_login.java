package com.Assignment_module7;
/*
 * W.a. junit program to use parameterized demo with multiple
parameter of Facebook login in junit
 * 
 */

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@RunWith(Parameterized.class)
public class Q16_Parameterized_facebook_login {

WebDriver driver;

@BeforeTest
	public void OpeningBrowserAndUrl() throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Kalpesh_selenium\\edgedriver_win64\\msedgedriver.exe");
	driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/e-11-1390fc9623815e5612d67bb930998-f3b8acd53c5847cda911423b80eee5a5094ac409&dsh=S688778223:1702325699417750&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTIQABgeG6rnEAoQ2nc4clpMtjrLMeZNMLyEWOtNZOzb_kAO2vBXn_pFyEeDD");	
	Thread.sleep(1000);
}
@Test
public void CreateAnAcc() throws InterruptedException {
	driver.findElement(By.name("firstName")).sendKeys("vaishnav");	
	Thread.sleep(1000);
	driver.findElement(By.name("lastName")).sendKeys("tamboli");	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();	
	Thread.sleep(1000);
	}

@AfterTest
public void closebroswer() {
	driver.close();	
	}

}
