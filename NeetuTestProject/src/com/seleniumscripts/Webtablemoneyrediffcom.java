package com.seleniumscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtablemoneyrediffcom extends ReusableCode{
	static Boolean status;

	public static void main(String[] args) throws InterruptedException, IOException {


		launchBrowser("chrome");
		getUrl("https://money.rediff.com/index.html");
		
		File f= new File("C:\\Users\\neetu\\Excel\\Webtable.xlsx");
		FileInputStream file= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		int numberOfSheet=wb.getNumberOfSheets();
		for(int i=0;i<numberOfSheet;i++) {
			String Sheet=wb.getSheetName(i);
			if(Sheet.equals("Webtablemoneyrediffcom")) {
				status= true;
				break ;
			}
			
			else {
				status= false;
			}
			
		}
			
			if (status.equals(false)) {
				
				wb.createSheet("Webtablemoneyrediffcom");
				
			}
		XSSFSheet sheet = wb.getSheet("Webtablemoneyrediffcom");
		
		
		WebElement table= driver.findElement(By.xpath("//*[@class='hmbseindicestable show']"));
		List<WebElement> tableRow= table.findElements(By.tagName("ul"));
		for(int i=0;i<tableRow.size();i++) {
			List<WebElement> tableColumn= tableRow.get(i).findElements(By.tagName("li"));
			XSSFRow row=sheet.createRow(i);
			
			for (int j=0;j<tableColumn.size();j++) {
				String text=tableColumn.get(j).getText();
				System.out.println(text);
						
// both ways work						
//				XSSFCell cell=row.createCell(j);
//				cell.setCellValue(text);
				
				row.createCell(j).setCellValue(text);
				
				FileOutputStream fileOutput= new FileOutputStream(f);
				wb.write(fileOutput);
				fileOutput.close();
				
						
			}
			
		}
		
		wb.close();
		file.close();
		
		System.out.println("Printing Completed");
		
		driver.close();
		
		
		
	}

}
