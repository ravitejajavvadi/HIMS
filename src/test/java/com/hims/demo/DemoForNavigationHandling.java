package com.hims.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForNavigationHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
/*	    1)navigate().to();
		2)navigate(). back() ;
		3)navigate(). forward(); 
		4)navigate(). refresh() ; 
*/
	WebDriver driver= new ChromeDriver();
//	driver.get("https://daaz.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://daaz.com/");
	
//	driver.navigate().to("https://www.amazon.in/");
//	driver.navigate().back();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[2]")).click();
	
	driver.navigate().refresh();
	System.out.println("print1");
	
	driver.navigate().forward();  

	}

}
