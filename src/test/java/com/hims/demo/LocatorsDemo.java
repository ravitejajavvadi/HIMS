package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://daaz.com/");
		Thread.sleep(3000);
		
/*--- id--- 
		driver.findElement(By.id("data-categories")).sendKeys("googl1223e");
*/
		
		
/*------Name-- 
 
		driver.findElement(By.xpath("//a[@title='Join Now']")).click();
		driver.findElement(By.name("first_name")).sendKeys("Test1_Name");
*/		
		

		
/*---Class Locator---	*/
  
//		driver.findElement(By.className("join_now")).click();
//		driver.findElement(By.cssSelector(".btn.btn-secondry.join_now")).click();
		
		
/* css locator*/		
	
		//id locator
		driver.findElement(By.cssSelector("#first_name"));
		
		//Classname
		
		driver.findElement(By.cssSelector("div.form-group.serach-group>input")).click();
		
		
 /*Xpath Syntax: //tagname[@attribute="value"]
		Xpath are 2tyeps:
		1. absolute xpath (/)
		2. relative xpath(//)
	*/	
	/*	driver.findElement(By.xpath("//input[@id=\"keyword\"]")).sendKeys("gmail");
		
		driver.findElement(By.xpath("//ul[@id ='responsive-menu']/li[2]/a")).click();
	*/	
		
/*Xpath axes*/		
	
		//Parent
		driver.findElement(By.xpath("//input[@id='tc']//parent::div/label"));
		
		/*Ancestor*/
		
		driver.findElement(By.xpath("//input[@id='tc']//ancestor::form/div[1]/input"));
		
		
		
		
		
		
		
		

/* WebElement Attribut Methods */
		
 /*--->getCssValue()	:*/
		
//		String fontlength=driver.findElement(By.className("join_now")).getCssValue("font-size");
//		System.out.println("font size:: "+fontlength);
//		
//		String color=driver.findElement(By.className("join_now")).getCssValue("color");
//		System.out.println("Element Color"+color);
		
/*--->getAttribute() :*/	
		
//		String placeholder=driver.findElement(By.id("data-categories")).getAttribute("name");
//		System.out.println("Attribute value ::"+placeholder);

/*--->getSize()	:*/	
		
//		Dimension elementsize=driver.findElement(By.id("data-categories")).getSize();
//		
//		System.out.println("Element Size::"+elementsize );
//		System.out.println("elementHight::"+elementsize.getHeight() +"  "+"elementsize.Weight ::"+elementsize.getWidth());

/*--->getLocation()	:*/			

//		Point elementLocation=driver.findElement(By.id("data-categories")).getLocation();
//		System.out.println("Elemeent Location ::"+elementLocation);
//		System.out.println("Elemeent X co-ordinate ::"+elementLocation.getX() +"  "+"Elemeent Y co-ordinate::" +elementLocation.getY());
		
		
/*isDisplaye()*/
		
//	boolean	ret_value=driver.findElement(By.xpath("//img[@title='DaaZ.com']")).isDisplayed();
//	 
//	     System.out.println("Return Value ::"+ret_value);
//	     if(ret_value=true) {
//	    	 System.out.println("Application Logo Displayed");
//	     }else {
//	    	 System.out.println("Application Logo Not Displayed");
//	     }
//		

	
	
/*isSelected()*/
	
//	     driver.findElement(By.className("join_now")).click();
//	     boolean return_value1=driver.findElement(By.xpath("//input[@id='tc']//parent::div/label")).isSelected();
//	     System.out.println("return value of cehckbox::"+return_value1);
//	     if(return_value1==true) {
//	    	 System.out.println("check box is selected");
//	     }else {
//	    	 System.out.println("check box is un-selected");
//	     }
	
	
	     
/*isEnabled*/
	     
	     driver.findElement(By.className("join_now")).click();
	     boolean return_value2=driver.findElement(By.id("first_name")).isEnabled();
	     System.out.println("Satus of First Name Input box::"+return_value2);
	     if(return_value2==true) {
	    	 System.out.println("Enter the firstname");
	     }else {
	    	 System.out.println("Text box is not enabled");
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
