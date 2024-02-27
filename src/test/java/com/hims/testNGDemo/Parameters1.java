package com.hims.testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class Parameters1 {
WebDriver driver;
	@Test (priority=1,groups="regression")
	@Parameters({"url","emailid","browser","env","Username","pwd"})
	public void setup(String url,String emailid,String browser,String env,String username,String pwd) {
		 System.out.println("Thread count ID ::"+Thread.currentThread().getId());
		if(browser.equals("chrome")) {	
	     driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			System.out.println("firefox driver");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		
		driver.get(url);
		System.out.println("parameter data from URL::"+url);
	   System.out.println("Parameter data from Browser::"+browser);
		System.out.println("parameter data email id::"+emailid);
		System.out.println("parameter data Env::"+env);
		System.out.println("parameter data usernmae::"+username);
		System.out.println("TestNG Xml PWD::"+pwd);
}
	
	  @Test (priority=2, groups="regression") @Parameters({"Username","pwd"})
	  
		public void f6 (String Username, String pwd) {
		  System.out.println("Thread count ID ::"+Thread.currentThread().getId());
		  System.out.println("User name from XML::"+Username);
		  System.out.println("PWD from XML::"+pwd);
			  Assert.assertTrue(true); 
		}
	  
	    @Test 
		public void f5() {
			  System.out.println("Thread count ID ::"+Thread.currentThread().getId());
			  Assert.assertTrue(true);
		 
		}
}
