package com.seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorFlipkart extends ReusableCode {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ReuseProperties p= new ReuseProperties(System.getProperty("user.dir") +"\\configuration.properties");
		
		launchBrowser(p.getProperty("browser"));
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		//getUrl("https://www.flipkart.com/");
		js.executeScript("window.location='https://www.flipkart.com/'");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/button"))).click();

		// click Element
		WebElement element1= driver.findElement(By.linkText("Nikon Camera"));
		js.executeScript("arguments[0].scrollIntoView(true);",element1);
		js.executeScript("arguments[0].click();",element1);
		
		//highlight
		WebElement element2=driver.findElement(By.xpath("//*[@class='LM6RPg' and @name='q']"));
		js.executeScript("arguments[0].style.border='3px dotted red'", element2);
		
		//enter text value
		js.executeScript("arguments[0].value='mobile';",element2);

		p.closePropertiesFile();
		driver.close();
		
	}

}
