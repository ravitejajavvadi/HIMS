package com.hims.testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParalletTest {
  @Test
  public void launchbrowser() {
	  System.out.println("Thread count ID ::"+Thread.currentThread().getId());
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.get("https://daaz.com/");
  }
  
  @Test (groups="regression")
	public void f2() {
	  System.out.println("Thread count ID ::"+Thread.currentThread().getId());
		  Assert.assertTrue(true);

	  }
	  @Test(groups="smoke")
	public void f3() {
		  System.out.println("Thread count ID ::"+Thread.currentThread().getId());
		  Assert.assertTrue(false);

	}
  
}
