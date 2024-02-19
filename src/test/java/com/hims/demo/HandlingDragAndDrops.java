package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("http://jqueryui.com/droppable/");
	   driver.switchTo().frame(0);
		
		WebElement from_location= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to_location= driver.findElement(By.xpath("//*[@id='droppable']"));
		
	   /*For Handling Drag and Drops we have to use Actions Class*/	
		Actions action= new Actions(driver);
		action.clickAndHold(from_location).moveToElement(to_location).release().build().perform();

	}

}
