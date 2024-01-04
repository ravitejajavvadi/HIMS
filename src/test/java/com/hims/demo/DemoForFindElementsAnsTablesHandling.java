package com.hims.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForFindElementsAnsTablesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://daaz.com/");
		driver.findElement(By.xpath("//ul[@id='responsive-menu']//li[2]")).click();

		Thread.sleep(2000);
		
		//FindElements
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='domainsGrid']//tbody/tr"));
		System.out.println("Number of Rows in Table::"+rows.size());
		

		for(WebElement e:rows) {
			
			
			System.out.println("row_data ::"+e.getText());
		}
		
		//Handling Cell Values
		
		List<WebElement>cellvalues=driver.findElements(By.xpath("//table[@id='domainsGrid']//tbody/tr[1]/td"));
		System.out.println("Number of cells  in Table::"+cellvalues.size());
		
		for(int i=1;i<rows.size();i++) {
			
			  for(int j=1;j<=cellvalues.size();j++) {
			String domain_name=driver.findElement(By.xpath("//table[@id='domainsGrid']//tbody/tr["+i+"]/td["+ j+"]")).getText();
			System.out.println("Cell Values ::"+domain_name);
			}
		}
		
		
		//FIndElement
		
		                              /*Table Handling */
//		String domain_name=driver.findElement(By.xpath("//table[@id='domainsGrid']//tbody/tr[2]/td[3]")).getText();
//		System.out.println("domain_name row  data ::"+domain_name);
		
//		String Entire_Row_Data=driver.findElement(By.xpath("//table[@id='domainsGrid']//tbody/tr[2]")).getText();
//		System.out.println("domain_name row  data ::"+Entire_Row_Data);
//		
//		String Entire_Table_Row_Data=driver.findElement(By.xpath("//table[@id='domainsGrid']//tbody")).getText();
//		System.out.println("domain_name row  data ::"+Entire_Table_Row_Data);
		
		                           /*Handling Table Header Section*/
		
//		String Header_Cell_Value=driver.findElement(By.xpath("//table[@id='domainsGrid']//thead/tr/th[1]")).getText();
//		System.out.println("Header Cell Value ::"+Header_Cell_Value);
//		
//		String Header_AllCell_Values=driver.findElement(By.xpath("//table[@id='domainsGrid']//thead/tr")).getText();
//		System.out.println("Header Cell Value ::"+Header_AllCell_Values);
		
		
	}

}
