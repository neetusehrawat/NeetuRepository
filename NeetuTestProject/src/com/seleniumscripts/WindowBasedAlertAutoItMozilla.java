package com.seleniumscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class WindowBasedAlertAutoItMozilla {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\neetu\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"post-body-4105674242499183386\"]/div[1]/form/input[10]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		
		WebElement Ele = driver.findElement(By.xpath("//*[@id=\"post-body-4105674242499183386\"]/div[1]/form/input[10]"));
		Actions act =new Actions(driver);
		act.moveToElement(Ele).click(Ele).perform();
		
		
		// After this go to Auto it Scite Editor and write Script for handling window pop and convert .au3. file to .exe
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\neetu\\UploadToSelenium\\uploadtoSeleniumMozilla.exe");
		Thread.sleep(3000);
		
		
		//act.sendKeys(Keys.chord(Keys.LEFT_CONTROL + "p")).perform();
		//driver.findElement(By.id("tooltip-1")).sendKeys(Keys.chord(Keys.LEFT_CONTROL + "p"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.print()");
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		//Click on Print and Save as Pdf
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\neetu\\UploadToSelenium\\forCtrlP.exe");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\neetu\\UploadToSelenium\\ReplaceExistingFile.exe");
			


	}

}
