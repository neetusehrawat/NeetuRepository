package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchEdgeBrowser {
	
	static String titlename,currenturl ;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\neetu\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("https://www.bgsbuniversity.org/category/admission/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		currenturl=driver.getCurrentUrl();
		titlename=driver.getTitle();
		System.out.println("Home Title"  + '=' + titlename);
		
		
		driver.findElement(By.linkText("Admission")).click();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Admission Title"  + '=' + titlename);
		
		driver.findElement(By.linkText("Result")).click();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Result"  + '=' + titlename);
		
		
		
		driver.findElement(By.linkText("Syllabus")).click();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Syllabus"  + '=' + titlename);
		
		
		driver.findElement(By.linkText("Merit List")).click();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Merit List"  + '=' + titlename);
		
		
		driver.findElement(By.linkText("Date Sheet")).click();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Date Sheet"  + '=' + titlename);

		driver.navigate().back();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Back to Merit List"  + '=' + titlename);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		titlename=driver.getTitle();
		System.out.println("Forward to Date Sheet"  + '=' + titlename);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		//driver.get(currenturl);
		
		driver.navigate().to(currenturl);      //Navigate back to home Screen
		Thread.sleep(3000);
		driver.findElement(By.name("s")).sendKeys(Keys.F5);   // keys is enum - F5 keyboard is used for refresh
		
		driver.close();
		



}



	}


