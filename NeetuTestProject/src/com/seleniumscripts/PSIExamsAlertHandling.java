package com.seleniumscripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PSIExamsAlertHandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://candidate.psiexams.com/index.jsp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//*[@id='tb3']/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/font/a/font")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("testlast");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.navigate().back(); */
		
		
		//Actions act =new Actions(driver);
		//Thread.sleep(3000);
		//act.sendKeys(Keys.F5);
		//driver.findElement(By.name("emailid")).sendKeys(Keys.F5);
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
				
		
	}

}
