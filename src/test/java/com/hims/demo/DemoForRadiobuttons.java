package com.hims.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForRadiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://daaz.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@id='responsive-menu']//child::li[2]")).click();
		boolean radiobuttonstatus=driver.findElement(By.xpath("//div[@class='like_filter']//label[2]")).isSelected();
		
		if(radiobuttonstatus==false) {
			System.out.print("radio button status:: "+radiobuttonstatus);
			driver.findElement(By.xpath("//div[@class='like_filter']//label[2]")).click();
			
		}
		else {
			System.out.println("radio Button selected ::"+radiobuttonstatus);
		}
	}

	

}
