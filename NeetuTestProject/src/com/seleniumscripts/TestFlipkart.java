package com.seleniumscripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestFlipkart extends ReusableCode {
	
	static String text;

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		getUrl("https://www.flipkart.com/");
		
		// click cross button on login confirmation window
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/button"))).click();
		
		
		// Navigate from Electronics to Mi and verify text
		mouseHoverToElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
		
		moveToAndClickElement(By.linkText("Mi"));
		
	    text=getTextValue(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/h1"));
		System.out.println(text);
		if(text.equals("Mi Mobiles")) {
			System.out.println("Navigated from Electronics to Mi was Successfull");
		} else {
			System.out.println("Navigated from Electronics to Mi failed");
		}
		
		// Navigate through pages until desired searched item is found. verify text and click element
	
			List<WebElement> pageNo= driver.findElements(By.xpath("//*[@class='_2zg3yZ']/nav/a"));
			System.out.println("total page count "+ pageNo.size());
					
				outer: for(int i=0;i<pageNo.size();i++) {
						System.out.println(pageNo.size());
						String href= pageNo.get(i).getAttribute("text");
						System.out.println("Page "+ href);
						clickElement(By.linkText(href));
						Thread.sleep(3000);
						
												
						List<WebElement> mobileNames= driver.findElements(By.xpath("//*[@class='_3wU53n']"));
						System.out.println("No of rows in page " +mobileNames.size());
						for(int j=0;j<mobileNames.size();j++) {
							String name= mobileNames.get(j).getText();
							System.out.println(name);
							if (name.equals("Redmi Note 9 (Scarlet Red, 64 GB)")) {
								//wait.until(ExpectedConditions.elementToBeClickable(mobileNames1.get(j))).click();
								mobileNames.get(j).click();
								break outer;
								
													
							
							}	
							
						} 
				}
				
			// switch to child window , perform action and close child window then switch to parent window and perform action and close browses
			String parentWindow=switchTochildWindow();
			
			
			clickElement(By.xpath("//*[@class='_1p7h2j']"));
			driver.close();
			driver.switchTo().window(parentWindow);
			
			enterTextValue(By.xpath("//*[@class='LM6RPg' and @name='q']"), "dresses");
			
			driver.quit();
			}
	
}
			
			
		
		
		
		
		
		