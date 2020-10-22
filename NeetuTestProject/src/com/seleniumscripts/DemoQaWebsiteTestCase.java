package com.seleniumscripts;

import org.openqa.selenium.By;

public class DemoQaWebsiteTestCase extends ReusableCode{

	
	public static void main(String[] args)  throws InterruptedException {
		
		launchBrowser("chrome");
		
		getUrl("https://demoqa.com/");
		
		clickElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[5]"));
		
		scrollPage(By.cssSelector(".show #item-0 > .text"));
		
		clickElement(By.cssSelector(".show #item-0 > .text"));
		
		By web1= (By.xpath("//*[@id='demo-tabpane-list']/div/div[1]"));
		By web2= (By.xpath("//*[@id='demo-tabpane-list']/div/div[4]"));
		
		//DragAndDRop(By.xpath("//*[@id='demo-tabpane-list']/div/div[1]"),By.xpath("//*[@id='demo-tabpane-list']/div/div[4]"));
		dragAndDRop(web1,web2);
		
		
		clickElement(By.xpath("//*[@id='demo-tab-grid']"));
		
		By web3= (By.xpath("//*[@id='demo-tabpane-grid']/div/div/div[2]"));
		By web4= (By.xpath("//*[@id='demo-tabpane-grid']/div/div/div[9]"));
		
		dragAndDRop(web3,web4);
		
		closeBrowser();
		
		
		
		

	}

	

}
