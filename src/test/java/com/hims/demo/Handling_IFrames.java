package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("http://jqueryui.com/droppable/");
	  
	/*Shifted to Inside Iframe*/
	  
		driver.switchTo().frame(0);
//	   Thread.sleep(3000);
		String value=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		System.out.println("text value::"+value);
		
	

	}

}
