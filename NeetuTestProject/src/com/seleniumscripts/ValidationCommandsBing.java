package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommandsBing {
	static boolean status;
	static int i=0;
	
	static String text;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("id_sc")).click();
		Thread.sleep(3000);
		
		//click on settings		
		driver.findElement(By.xpath("//*[@id='hbsettings']/div")).click();
		Thread.sleep(2000);
		
		//Click on More under Settings
		driver.findElement(By.xpath("//*[@id='hbsettree']/a[5]/div")).click();
		status =driver.findElement(By.id("adlt_set_moderate")).isSelected();
		if (status==true) {
			System.out.println("Moderate is preselected");
			
			}
		else {
			System.out.println("Moderate is not preselected");
			
		}
		
		Thread.sleep(1500);
		
		status =driver.findElement(By.id("enAS")).isSelected();
		if (status==true) {
			System.out.println("Readresult loud is preselected");
			
			}
		else {
			System.out.println("Readresult loud is not preselected");
			
		}
		Thread.sleep(1500);
		
		//Navigate back to main window		
		driver.navigate().back();
		Thread.sleep(3000);	
		
		WebElement abc = driver.findElement(By.id("rightNavCaro"));
		
		String test="rightNav disabled";
			
			
			do { 
				text =abc.getAttribute("class");
				System.out.println(text);
				Thread.sleep(3000);
				if(test.equals(text)==false) {
				abc.click();
				i++;
				Thread.sleep(3000);
				}else {
					System.out.println("Right Arrow is no more clickable");
					break;
				}
				
			}while(test.equals(text)==false);
			System.out.println("Right arrow clicked count " + i);
			driver.close();
	
				
		}
}
	
/*for(i=0;abc.isEnabled()==true ;i++) {
abc.click();
Thread.sleep(3000);	
System.out.println("click Count" + i);
}*/


// Different ways
	
/*while(abc.isEnabled()==true) {
	
	
	if (abc.isEnabled()==false) {
		break;
	}
	abc.click();
	Thread.sleep(3000);

	
}*/

/*status = abc.isEnabled();
		do {
			System.out.println(status);
			abc.click();
			Thread.sleep(3000);		
				i++;
				System.out.println(i);
		
			}while (abc.isEnabled()==true);	
			*/
		
		
		
		
		



	


	
			
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	



