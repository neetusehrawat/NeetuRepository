package com.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoBing extends ReusableCode {

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		getUrl("https://www.bing.com/#");
		
		enterTextValue(By.xpath("//*[@id='sb_form_q']"),"selenium");
		List <WebElement> autocomplete= driver.findElements(By.xpath("//*[@id='sa_ul']/li"));
		for(int i=0;i<autocomplete.size();i++) {
			String search= autocomplete.get(i).getText();
			System.out.println(search);
			if (search.equals("selenium benefits")) {
				autocomplete.get(i).click();
				break;
			}
		}			
	}
}
