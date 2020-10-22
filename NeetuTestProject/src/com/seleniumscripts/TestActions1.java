package com.seleniumscripts;

import java.awt.AWTException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestActions1 {
	
		public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		Actions act =new Actions(driver);
		
		
		 
	      //draggable
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//*[@id='draggable']/p"));
		act.dragAndDropBy(ele,100,60).build().perform();
		
		//drag and drop
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(0);
		Thread.sleep(3000);		
		WebElement ele1=driver.findElement(By.xpath("//*[@id='draggable']/p"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']/p"));
		act.dragAndDrop(ele1, drop).perform();
		Thread.sleep(3000); 	
		 
		
		
		
		//Resizeable
		
		driver.switchTo().parentFrame();		
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.switchTo().frame(0);
	        
	    WebElement resizeElement = driver.findElement(By.xpath("//div[@id='resizable']/div[3]")); 	    
	    act.dragAndDropBy(resizeElement,100,130).build().perform();
		Thread.sleep(3000);
		
		//sortable
		
		driver.switchTo().parentFrame(); 
		Thread.sleep(3000);	 
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);	
		js.executeScript("window.scrollBy(0,200)");
		driver.switchTo().frame(0);
		Thread.sleep(3000);			
		 
		 
		    
		WebElement Sort2= driver.findElement(By.xpath("//*[@id='sortable']/li[2]/span"));
		WebElement Sort7= driver.findElement(By.xpath("//*[@id='sortable']/li[7]/span"));
				
		//sorting is working only from bottom towards Top
		act.dragAndDrop(Sort7, Sort2).perform();
		
		Thread.sleep(3000);	
		int product_count = driver.findElements(By.xpath("//*[@id='sortable']/li")).size();	
		Thread.sleep(3000);	
		System.out.println(product_count);
		String[] expectedArray= {"Item 1","Item 7","Item 2","Item 3","Item 4","Item 5","Item 6",};
		String[] items= new String[product_count];
		
		for(int i=1; i<=product_count; i++) {
			
			WebElement a=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li["+i+"]"));
			String count=a.getText();
			System.out.println(count);
			items[i-1]=count;
		}
		
		if(Arrays.equals(items,expectedArray)){
			
			System.out.println("Successful");
		
		} else {
			System.out.println("failed");
		}
		
	
				
				
		//act.clickAndHold(Sort2).moveToElement(Sort7).perform();
		//Thread.sleep(3000);
		//act.release(Sort6).build().perform();	
		
		
		
		//Selectable
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);		
		js.executeScript("window.scrollBy(0,200)");
		driver.switchTo().frame(0);
		Thread.sleep(3000);			
		WebElement item1= driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		WebElement item2= driver.findElement(By.xpath("//*[@id='selectable']/li[2]"));
		WebElement item5= driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
		WebElement item7= driver.findElement(By.xpath("//*[@id='selectable']/li[7]"));
		act.keyDown(Keys.CONTROL).click(item1).click(item2).click(item5).click(item7).perform(); 
		Thread.sleep(3000);	 
		
		
			
		driver.close(); 
			
		
	}

}
