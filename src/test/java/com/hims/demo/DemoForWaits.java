package com.hims.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
		/*Waits in Selenium
		
		1. Implicity Wait
		2. Explicity Wait
		3. Fluent wait
		
		Waits in JAVA:
		
		-> Thread.sleep(3000);
		
//		1. Implicity Wait :-it applicable for all locator in the project. if element is not prescent than it throws immediately an exception.
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		  
		  
//		  2.Explicit Wait :-it is applied based on specific element based. if condition is satisfied and execution will be continue or else , exception will throw.
		
//		  Syntax:  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		          wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
		
//		Ex:
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2000));  //initialization of webdriverwait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='input']")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.textToBePresentInElement(ele, "Login"));
		
		
		
		3. Fluent Wait: -
		
		     Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);*/
		
		
		

	}

}
