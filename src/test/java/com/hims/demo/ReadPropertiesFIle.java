package com.hims.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFIle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        Properties prop= new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\DELL-PC\\eclipse-workspace\\project1\\src\\test\\java\\seleniumDemo1\\project1\\config1.properties");
		prop.load(ip);
		prop.getProperty("url");
		String browsername= prop.getProperty("Browser");
		
	    System.out.println(prop.getProperty("url"));
	    System.out.println(browsername);
	    
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
//	    driver.get("www.daaz.com");
	    driver.get(prop.getProperty("url"));
	    
	    driver.findElement(By.id(prop.getProperty("search_box_id"))).sendKeys(prop.getProperty("search_item"));
	    
	}

}
