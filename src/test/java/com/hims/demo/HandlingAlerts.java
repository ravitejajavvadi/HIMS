package com.hims.demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("fhgfghfhvhjfghfhgf");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//Initialization Alert Class
		
		Alert alrt= driver.switchTo().alert();
		Thread.sleep(1000);
		
	/* Dismiss the Alert*/
//      	alrt.dismiss();
		
	  /*Retrive the ALERT Text Message*/
	  
	    String alrtmsg = driver.switchTo().alert().getText();
	    System.out.println("Alert Text Message ::"+alrtmsg);
		
		
		
		
	/*Accepting the Alert
	 */ 
	  
	        alrt.accept();

	}

}
