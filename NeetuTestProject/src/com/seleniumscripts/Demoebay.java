package com.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class Demoebay extends ReusableCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchBrowser("chrome");
	
		getUrl("https://www.ebay.co.uk/");
		
		enterTextValue(By.xpath("//*[@id='gh-ac']"),"mobile");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		List <WebElement> autocomplete= driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		for(int i=0;i<autocomplete.size();i++) {
			String search= autocomplete.get(i).getText();
			System.out.println(search);
			if(search.equals("mobile home")) {
				//autocomplete.get(i).click();
				
				WebElement searchautocomplete =autocomplete.get(i);
	            js.executeScript("arguments[0].scrollIntoView()", searchautocomplete);
	            js.executeScript("arguments[0].click();", searchautocomplete);
	           	break;
			}
			
			
		}
//		
//		List <WebElement> listitems= driver.findElements(By.xpath("//*[@id='gh-cat']/option"));
//		for(int i=0;i<listitems.size();i++) {
//			String search= listitems.get(i).getText();
//			System.out.println(search);
//		}
		
		//*[@id="ui-id-1"]/li[5]
		//*[@id="ui-id-97"]
		//*[@id="ui-id-163"]
		//*[@id="ui-id-1"]/li[6]
		//*[@id="ui-id-162"]
		//*[@id="ui-id-1"]/li[5]
		//*[@id="ui-id-1"]/li[7]
		//*[@id="ui-id-1"]/li[1]
		//*[@id="ui-id-54"]
		//html/body/div[5]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[2]/ul/li[1]/a
		////*[@id="ui-id-1"]/li[2]
			
//		List <WebElement> allItems= driver.findElements(By.xpath("//*[@id='x-refine__group__0']/ul/li/ul/li"));
//		for( int i=0;i<allItems.size();i++) {
//			String items= allItems.get(i).getText();
//			System.out.println(items);
//			
//		}
//		
//		
//		List <WebElement> checkboxItems= driver.findElements(By.xpath("	//*[@id=\"x-refine__group_1__0\"]/ul/li"));
//		for( int i=0;i<checkboxItems.size();i++) {
//			String items= checkboxItems.get(i).getText();
//			System.out.println(items);
//			
//		}
//		

	}

}
