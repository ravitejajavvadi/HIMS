package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollhandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://daaz.com/");
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
	/*Method-1*/
		
		/* Scroll bar moved to the bottom of the Page */
//	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	/*Method-2*/    
	    
		/*Scroll bar moved to the Required Position until till down */
//		  js.executeScript("window.scrollBy(0,1000)");
//		  
//		/*Scroll bar moved to the UP. it represent in -ve value */  
//		  js.executeScript("window.scrollBy(0,-1000)");
		  
		  
//	/*Method-3*/	
		  
		/* Without Perform Scroll Down We have use ScrollintoView() method to focus the Required Element*/
//		  WebElement element=driver.findElement(By.xpath("//a[contains(text(),'How It Works')]"));
//		  WebElement ele1=driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[3]/a"));
		  
//		  js.executeScript("arguments[0].scrollIntoView();", element);
//	     Thread.sleep(3000);	
	     
		/*Perform Click operation Using Java Script Executor */
//		  js.executeScript("arguments[0].click();", element);
		  
//		  js.executeScript("arguments[0].click();", ele1);
		
//		
//		
		/*instead of Sendkeys we can use java Script Executor to enter data in the Application*/
//		 driver.findElement(By.xpath("//input[@id='data-categories']")).sendKeys("google");
		  
		  WebElement ele2=  driver.findElement(By.xpath("//input[@id='data-categories']"));  
		  js.executeScript("arguments[0].value='domain name';", ele2);
		  
	}

}
