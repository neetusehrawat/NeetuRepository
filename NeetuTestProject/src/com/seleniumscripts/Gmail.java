package com.seleniumscripts;

import org.openqa.selenium.By;

public class Gmail extends ReusableCode {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		getUrl("https://mail.google.com/mail/u/1/#inbox");
		enterTextValue(By.xpath("//input[@id='identifierId']"),"neetus41");
		clickElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		


		
		
		
	}

}
