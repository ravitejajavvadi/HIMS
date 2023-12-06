package com.hims.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
    	driver.get("https://daaz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='domainsGrid']//tbody/tr[1]//td[4]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();  // To close the Current browser/Parent browser
//		driver.quit();   // To close the Entire browser and driver scession make it as null
		
	
}

}