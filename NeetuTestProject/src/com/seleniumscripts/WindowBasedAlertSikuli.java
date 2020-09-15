package com.seleniumscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class WindowBasedAlertSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Ele = driver.findElement(By.xpath("//*[@id=\"post-body-4105674242499183386\"]/div[1]/form/input[10]"));
		Actions act =new Actions(driver);
		act.moveToElement(Ele).click(Ele).perform();
		
		Thread.sleep(3000);
		Screen s= new Screen();
		Pattern filepath= new Pattern("C:\\Users\\neetu\\Sikuli\\Capture1.PNG");
		Pattern filepath1= new Pattern("C:\\Users\\neetu\\Sikuli\\Capture2.PNG");
		
		s.wait(filepath,20);
		s.type(filepath,"C:\\Users\\neetu\\Desktop\\BingLoop.txt");
		
		s.wait(filepath1,20);
		s.click(filepath1);
		Thread.sleep(3000);
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		Pattern printbutton= new Pattern("C:\\Users\\neetu\\Sikuli\\PrintButton.PNG");
		s.wait(printbutton,20);
		s.click(printbutton);
		
		Thread.sleep(3000);
		Pattern save= new Pattern("C:\\Users\\neetu\\Sikuli\\Save.PNG");
		Pattern saveButton= new Pattern("C:\\Users\\neetu\\Sikuli\\SaveButton.PNG");
		s.wait(save,20);
		s.type(save,"C:\\Users\\neetu\\Desktop\\Sikulidemo.txt");
		
		s.wait(saveButton,20);
		s.click(saveButton);
		
		Thread.sleep(3000);
		Pattern yesButton= new Pattern("C:\\Users\\neetu\\Sikuli\\yesButton.PNG");
		s.wait(yesButton,20);
		s.click(yesButton);
		
		driver.close();	
		

	}

}
