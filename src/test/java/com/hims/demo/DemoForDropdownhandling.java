package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoForDropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://daaz.com/");
		
		driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[2]")).click();
		 WebElement element=driver.findElement(By.xpath("//select[@class='form-control currency_listing']"));
			
	/*Select Class initializing */
		  Select se= new Select(element);
//		       or
//		  Select se1= new Select(driver.findElement(By.xpath("//select[@class='form-control currency_listing']")));

/*Option1:*/
	
//		  se.selectByValue("eur");
		 
/*Option2:*/	
		  
//    	  se.selectByVisibleText("USD");
		
/*Option3:*/
		  
//  		se.selectByIndex(3);
		  
		  
  		

/*get the Default Selected Option  */
  		WebElement ele=se.getFirstSelectedOption();
  		String text= ele.getText();
  		System.out.println("default selected value::" +text);
		

/*  Dropdown Selected in 3 ways: 
		  
 Syntax :  Select se= new Select(Webelement);
 		  
   1.	selectbyvalue()
   2.	selectByIndex()
   3.   SelectBYVisibleText()
   	
  	
 */

	}

}
