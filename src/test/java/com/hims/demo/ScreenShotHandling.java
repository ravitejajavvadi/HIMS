package com.hims.demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://daaz.com/");
		
		//Take screen shot and store file formate
		 LocalDateTime now = LocalDateTime.now();  
//		Date date= new Date();
		
		TakesScreenshot src =((TakesScreenshot)driver);
		File SourceFile=src.getScreenshotAs(OutputType.FILE);
		
//		File dest = new File(System.getProperty("user.dir") +"/screenshots/image1.png");
		File destinationlocation= new File("C:\\Users\\DELL-PC\\eclipse-workspace\\project1\\screenshots\\image.png");
	
			
			try {
				FileHandler.copy(SourceFile, destinationlocation);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

}
