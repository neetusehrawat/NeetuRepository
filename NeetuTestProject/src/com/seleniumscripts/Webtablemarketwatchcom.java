package com.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtablemarketwatchcom extends ReusableCode {

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		getUrl("https://www.marketwatch.com/");
		
		WebElement table= driver.findElement(By.xpath("//*[@class='table table--primary align--right']/tbody"));
		List<WebElement> tableRow= table.findElements(By.tagName("tr"));
		for(int i=0;i<tableRow.size();i++) {
			List<WebElement> tableColumn= tableRow.get(i).findElements(By.tagName("td"));
			for (int j=0;j<tableColumn.size();j++) {
				String text=tableColumn.get(j).getText();
				System.out.println(text);
						
			}
			
		}
		
		driver.close();
		

	}

}
