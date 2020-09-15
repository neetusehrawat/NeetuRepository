package com.seleniumscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMozilla {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\neetu\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys("250000.50");
		Thread.sleep(3000);
		
		driver.findElement(By.id("downpayment")).clear();
		driver.findElement(By.id("downpayment")).sendKeys("50000.00");
		Thread.sleep(3000);
		
		driver.findElement(By.id("loanamt")).clear();
		driver.findElement(By.id("loanamt")).sendKeys("150000.00");
		Thread.sleep(3000);
		
		driver.findElement(By.id("intrstsrate")).clear();
		driver.findElement(By.id("intrstsrate")).sendKeys("5.1");
		Thread.sleep(3000);
		
		driver.findElement(By.id("loanterm")).clear();
		driver.findElement(By.id("loanterm")).sendKeys("40");
		Thread.sleep(3000);
		
		driver.findElement(By.id("pptytax")).clear();
		driver.findElement(By.id("pptytax")).sendKeys("3000");
		Thread.sleep(3000);
		
		driver.findElement(By.id("pmi")).clear();
		driver.findElement(By.id("pmi")).sendKeys("1.25");
		Thread.sleep(3000);
		
		driver.findElement(By.id("hoi")).clear();
		driver.findElement(By.id("hoi")).sendKeys("1500");
		Thread.sleep(3000);
		
		driver.findElement(By.id("hoa")).clear();
		driver.findElement(By.id("hoa")).sendKeys("2500.00");
		Thread.sleep(3000);
		
		driver.findElement(By.name("cal")).click();
		
		driver.close();
		
	}

}
