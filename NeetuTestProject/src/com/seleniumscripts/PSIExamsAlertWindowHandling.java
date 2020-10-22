package com.seleniumscripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PSIExamsAlertWindowHandling extends ReusableCode {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed, IOException {
		launchBrowser("chrome");
		
		getUrl("https://candidate.psiexams.com/index.jsp");
		
		File f= new File("C:\\Users\\neetu\\Excel\\psiexams.xlsx");
		FileInputStream file= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		clickElement(By.linkText("Certification/Professional Associations"));
	
		List<WebElement> dropdown= driver.findElements(By.xpath("//*[@id='c0']/option"));
		
		for(int i=0;i<dropdown.size();i++) {
			String text=dropdown.get(i).getText();
			
			sheet.createRow(i).createCell(0).setCellValue(text);
			FileOutputStream fileOutput= new FileOutputStream(f);
			wb.write(fileOutput);
			fileOutput.close();
					
			
		}
		System.out.println("Excel Writing Completed");
		wb.close();
		file.close();
		
		driver.navigate().back();
		
		
		
		 		  	
		
		clickElement(By.linkText("PSI Bookstore"));
		
		String parentWindow= driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr= windows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				
			}
			
		}
		
		enterTextValue(By.xpath("//*[@id='search_queryispbxi_']"),"test value");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
			
		Thread.sleep(3000);	
		clickElement(By.xpath("//*[@id='tb3']/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/font/a/font"));
		
		enterTextValue(By.name("emailid"),"test@gmail.com");
		enterTextValue(By.name("firstname"),"test");
		enterTextValue(By.name("lastname"),"testlast");
		clickElement(By.name("Submit"));
		
		driver.switchTo().alert().accept();
		driver.navigate().back(); 
		
		
		//code to press cntrl+p	
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Screen s= new Screen();
		Pattern destination= new Pattern("C:\\Users\\neetu\\Sikuli\\Dropdown.PNG");
		s.wait(destination,20);
		s.click(destination);
		Pattern Printas= new Pattern("C:\\Users\\neetu\\Sikuli\\PrintasPdf.PNG");
		s.wait(Printas,20);
		s.click(Printas);
		
		
		Pattern printbutton= new Pattern("C:\\Users\\neetu\\Sikuli\\PrintButton.PNG");
		s.wait(printbutton,20);
		s.click(printbutton);
		
		Thread.sleep(3000);
		Pattern save= new Pattern("C:\\Users\\neetu\\Sikuli\\Save.PNG");
		Pattern saveButton= new Pattern("C:\\Users\\neetu\\Sikuli\\SaveButton.PNG");
		s.wait(save,20);
		s.type(save,"C:\\Users\\neetu\\Desktop\\Sikulidemo.pdf");
		
		s.wait(saveButton,20);
		s.click(saveButton);
		
		Thread.sleep(3000);
		Pattern yesButton= new Pattern("C:\\Users\\neetu\\Sikuli\\yesButton.PNG");
		s.wait(yesButton,20);
		s.click(yesButton);
		
		
		driver.close();
	
	}

}
