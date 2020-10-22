package com.seleniumscripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SpiceJetDateHandling {
	
	static String expectedMonth ="March";
	static String actualMonth;
	static String todayDate;
	
	static String Currentdate() {
		DateFormat dateformat=new SimpleDateFormat("dd");
		Date date= new Date();
		String Date1= dateformat.format(date);
		System.out.println(Date1);
		return Date1;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("BOM");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("VNS");
		Thread.sleep(3000);
		
		
		String actualMonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		System.out.println(actualMonth);
		
		while(actualMonth.equals(expectedMonth)==false){
			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			Thread.sleep(3000);
			actualMonth= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();	
			
		}
		todayDate=SpiceJetDateHandling.Currentdate();
		
		
		driver.findElement(By.linkText(todayDate)).click();
		
		Thread.sleep(3000);	
				
		driver.close();
		

	}

}
