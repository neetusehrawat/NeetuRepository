package com.seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutortestblog extends ReusableCode {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ReuseProperties p= new ReuseProperties(System.getProperty("user.dir") +"\\configuration.properties");
		
		launchBrowser(p.getProperty("browser"));
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		//getUrl("http://only-testing-blog.blogspot.com/");
		js.executeScript("window.location='http://only-testing-blog.blogspot.com/'");
		
		WebElement firstName= driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']//input[@name='fname']"));
		js.executeScript("arguments[0].scrollIntoView(true);",firstName);
		js.executeScript("arguments[0].value='Mike';",firstName);
		
		
		WebElement lastName=  driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']//input[@name='lname']"));
		//js.executeScript("arguments[0].value='Ross';",lastName);
		js.executeScript("arguments[0].removeAttribute('disabled');",lastName);
		lastName.sendKeys("Ross");
		
		WebElement hiddenElement=  driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']//input[@id='hidden1']"));
		
		js.executeScript("arguments[0].removeAttribute('type');",hiddenElement);
		//js.executeScript("arguments[0].value='neetu1234';",hiddenElement);
		hiddenElement.sendKeys("neetu1234");
		
		
		
		
		
		

		
	}

}
