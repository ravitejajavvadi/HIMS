package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://daaz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[2]")).click();
		
		//UnSelect Checkbox
		
		Thread.sleep(2000);
		boolean checkboxesult = driver.findElement(By.xpath("//input[@id='select_all_listings']")).isSelected();
		System.out.println("Select All Check box status ::"+checkboxesult);
		if(checkboxesult == true) {
			driver.findElement(By.xpath("//label[contains(text(),'UnSelect All')]")).click();
		}

		
		//Select the Check box
		
		boolean checkboxesult1= driver.findElement(By.xpath("//input[@id='buynow_listings']")).isSelected();
		
		System.out.println("Buy now Listing checkbox status ::"+checkboxesult1);
		if(checkboxesult1==false) {
			driver.findElement(By.xpath("//label[contains(text(),'Buy now listings')]")).click();
		}
		
	}

}
