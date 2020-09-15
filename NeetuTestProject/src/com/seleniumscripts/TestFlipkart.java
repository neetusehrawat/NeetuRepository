package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestFlipkart {
	
	static String text;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/button"))).click();
	
		
		Actions act =new Actions(driver);
		
		// Navigate from Electronics to Mi
		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Mi"))).click().perform();;
		Thread.sleep(3000);
		text= driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1")).getText();
		System.out.println(text);
		if(text.equals("Mi Mobiles")) {
			System.out.println("Navigated from Electronics to Mi was Successfull");
		} else {
			System.out.println("Navigated from Electronics to Mi failed");
		}
		
		//navigate from TV and Appliances  to  Microwave ovens
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[2]"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Microwave Ovens"))).click().perform();;
		Thread.sleep(2000);
		text= driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/h1")).getText();
		System.out.println(text);
		if(text.equals("Microwave Ovens")) {
			System.out.println("Navigated from Tv's and Appliances to Microwave ovens was Successfull");
		} else {
			System.out.println("Navigated Tv's and Appliances to Microwave ovens failed");
		}
		
		//Select some value from dropdown
		Thread.sleep(1500);
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div/div[1]/div/div/section[2]/div[4]/div[1]/select")));
		sel.selectByVisibleText("₹10000");
		Thread.sleep(5000);
		sel=new Select(driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")));
		sel.selectByVisibleText("₹12500");
		Thread.sleep(3000);
		
		//To scroll page down and select Panasonic
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[4]/div[2]/div/div[11]/div/div/label/div[1]")).click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
