package com.seleniumscripts;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReusableCode {
	
	
	public static WebDriver driver;
	
	 public static void launchBrowser(String browser) throws InterruptedException {
		 if(browser.equalsIgnoreCase("chrome")==true) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //Thread.sleep(3000);
			
	 } else if(browser.equalsIgnoreCase("firefox")==true){
		 	System.setProperty("webdriver.gecko.driver", "C:\\Users\\neetu\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Thread.sleep(3000);
			
		 
	 }else if(browser.equalsIgnoreCase("edge")==true){
		 	System.setProperty("webdriver.edge.driver", "C:\\Users\\neetu\\edgedriver_win64\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//Thread.sleep(3000);
			
	 }
	 }
	 
	 	 
	 
	 
	 public static void getUrl(String url) throws InterruptedException {
		 	driver.get(url);
			driver.manage().window().maximize();
			//Thread.sleep(3000);
		 
	 }
	

	
	 public static void clickElement(By locatorname) throws InterruptedException {
		
			driver.findElement(locatorname).click();
			//Thread.sleep(3000);
		

	}
	 

	 public static void enterTextValue(By locatorname,String text) throws InterruptedException {
		
			driver.findElement(locatorname).sendKeys(text);
			//Thread.sleep(3000);
		

	}
	 
	 public static void mouseHoverToElement(By locator) throws InterruptedException {
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(locator)).perform();
			//Thread.sleep(3000);
		
		
	}
	
	 
	 public static void moveToAndClickElement(By locator) throws InterruptedException {
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(locator)).click().perform();
			//Thread.sleep(3000);
		
		
	}
	 
	 public static void selectFromDropdown(By locator,String dropdownValue) {
		 Select sel=new Select(driver.findElement(locator));
		 sel.selectByVisibleText(dropdownValue);
	 }
	 
	 public static String getTextValue(By locator) throws InterruptedException {
			
			String text= driver.findElement(locator).getText();
			
			return text;
			
	 }	
			
				 
	 
	 
	 public static By storeWebElement(By locatorname) {
			
			WebElement web = driver.findElement(locatorname);
			return locatorname;
			
		}
	 public static void dragAndDRop(By locator1,By locator2) throws InterruptedException {
			Actions act=new Actions(driver);
			act.dragAndDrop(driver.findElement(locator1), driver.findElement(locator2)).perform();
			//Thread.sleep(3000);
		
		
	}
	 
	 public static String switchTochildWindow() {
		 String parentWindow= driver.getWindowHandle();
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> itr= windows.iterator();
			while(itr.hasNext()) {
				String childWindow=itr.next();
				if(!childWindow.equals(parentWindow)) {
					driver.switchTo().window(childWindow);
					
				}
				
			}
			return parentWindow;
	 }
		
	 public static void scrollPage(By locatorname) throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locatorname));
			//Thread.sleep(3000);
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy(0,250)");
		
	}
	
	 public static void closeBrowser() throws InterruptedException {
			//Thread.sleep(3000);
			driver.close();
		
	}
}
