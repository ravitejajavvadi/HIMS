package com.hims.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to java");
		
		//Initializing the WebDriver
		WebDriver driver= new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("https://daaz.com/");
		
		//Wait for Some time
		Thread.sleep(2000);
		
	//**********Get the Title of  the Webpage getTitle() ************//	
	String titlevalue = driver.getTitle();
	System.out.println("----------Title of the Webpage ::"+titlevalue+"------------");
	
	//**********Get the Cuurent URL of the Webpage getCurrentUrl() ************//	
	
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println("-----------Current URl::"+CurrentUrl+"-----------");
	
	String pagesourcedata = driver.getPageSource();
	System.out.println("Page source of the Webpage ::"+pagesourcedata);
	
	
	
	/*-------DataTypes---------
	datatype varibale= value;
	int num = 123;
	String s="abcgf54655$#%$^&";
	char c = 'a';
	boolean res= true ;
	*/
	     
		
//		driver.close();
	}

}
