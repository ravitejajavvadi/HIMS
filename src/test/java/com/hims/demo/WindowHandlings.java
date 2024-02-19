package com.hims.demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2000));
		driver.get("https://daaz.com/");
		
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='responsive-menu']//li[3]/a"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='auctionGrid']/tbody/tr/td[6]"))).click();
		
		/*Handling the Windows*/
		
		/*Stroing Parent Window ID*/
		String parentwindow=driver.getWindowHandle();
		
		/* Strong the All Open Windows ID's*/
		Set<String>allwindowhandles=driver.getWindowHandles();
		
		System.out.println("size of Open Windows::"+allwindowhandles.size());
		int count=0;
		
		for(String h:allwindowhandles) {
			
			count++;   // or count= count+1;
			
			System.out.println("Number of Windows::"+count);
			if(count==2) {
				driver.switchTo().window(h);
				driver.findElement(By.xpath("//input[@id='bid_user']")).sendKeys("50");
			   System.out.println("child window URL::"+driver.getCurrentUrl());
			   
				
			}
			else {
				continue;
			}
		}
		
		driver.switchTo().window(parentwindow);
		
	

	}

}
