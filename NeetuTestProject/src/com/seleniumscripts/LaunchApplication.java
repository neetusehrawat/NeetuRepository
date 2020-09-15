package com.seleniumscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[contains(text(),'Mortgage Calcs')]"))).perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath(".//*[contains(text(),'30 yr Fixed')]"))).click().perform();
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys("250000.50");
		
		driver.findElement(By.xpath("//input[@name='param[downpayment_type]' and @value='money']")).isSelected();
		driver.findElement(By.xpath("//input[@name='param[downpayment_type]' and @value='percent']")).click();
		
		
		
			
		
		driver.findElement(By.id("downpayment")).clear();
		driver.findElement(By.id("downpayment")).sendKeys("50000.00");
		
		
		driver.findElement(By.id("loanamt")).clear();
		driver.findElement(By.id("loanamt")).sendKeys("150000.00");
		
		
		driver.findElement(By.id("intrstsrate")).clear();
		driver.findElement(By.id("intrstsrate")).sendKeys("5.1");
		
		
		driver.findElement(By.id("loanterm")).clear();
		driver.findElement(By.id("loanterm")).sendKeys("40");
		Thread.sleep(3000);
		
		Select dropdown =new Select(driver.findElement(By.name("param[start_month]")));
		dropdown.selectByVisibleText("Apr");
		Thread.sleep(3000);	
		
		
		driver.findElement(By.id("pptytax")).clear();
		driver.findElement(By.id("pptytax")).sendKeys("3000");
		
		
		driver.findElement(By.id("pmi")).clear();
		driver.findElement(By.id("pmi")).sendKeys("1.25");
		
		
		driver.findElement(By.id("hoi")).clear();
		driver.findElement(By.id("hoi")).sendKeys("1500");
		
		
		driver.findElement(By.id("hoa")).clear();
		driver.findElement(By.id("hoa")).sendKeys("2500.00");
		
		Select dropdown1 =new Select(driver.findElement(By.name("param[milserve]")));
		dropdown1.selectByValue("3");
		Thread.sleep(3000);	
		
		
		
		driver.findElement(By.name("cal")).click();
		
		driver.close();	
		

	}

}
