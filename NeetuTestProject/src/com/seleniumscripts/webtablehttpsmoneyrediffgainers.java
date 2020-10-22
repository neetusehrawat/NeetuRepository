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


public class webtablehttpsmoneyrediffgainers extends ReusableCode {
	
	static Boolean status;
	public static void main(String[] args) throws InterruptedException, IOException {
	
	ReuseProperties p= new ReuseProperties(System.getProperty("user.dir") +"\\configuration.properties");
	
	launchBrowser(p.getProperty("browser"));
	
	
	//launchBrowser("chrome");
	
	getUrl("https://money.rediff.com/gainers");
	
	File f= new File(System.getProperty("user.dir") + "\\Webtable.xlsx");
	FileInputStream file= new FileInputStream(f);
	XSSFWorkbook wb= new XSSFWorkbook(file);
	
	int numberOfSheet=wb.getNumberOfSheets();
	for(int i=0;i<numberOfSheet;i++) {
		String Sheet=wb.getSheetName(i);
		if(Sheet.equals("webtablehttpsmoneyrediffgainers")) {
			status= true;
			break ;
		}
		
		else {
			status= false;
		}
		
	}
		
		if (status.equals(false)) {
			
			wb.createSheet("webtablehttpsmoneyrediffgainers");
			
		}
		
	
	XSSFSheet sheet = wb.getSheet("webtablehttpsmoneyrediffgainers");
	
	List<WebElement> tableHeader = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	XSSFRow headRowsheet=sheet.createRow(0);
	for(int i=0;i<tableHeader.size();i++) {
		String header=tableHeader.get(i).getText();
		headRowsheet.createCell(i).setCellValue(header);
		FileOutputStream fileOutput= new FileOutputStream(f);
		wb.write(fileOutput);
		fileOutput.close();
		
		
	}
	List<WebElement> tableBodyrow = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
	
	//for time being change table tableBodyrow.size() to 10 just to get data quickly
	for(int i=0;i<10;i++) {
		XSSFRow bodyRow=sheet.createRow(i+1);
		List<WebElement> tableBodyColumn=tableBodyrow.get(i).findElements(By.tagName("td"));
		for(int j=0;j<tableBodyColumn.size();j++) {
			String body=tableBodyColumn.get(j).getText();
			bodyRow.createCell(j).setCellValue(body);
			FileOutputStream fileOutput= new FileOutputStream(f);
			wb.write(fileOutput);
			fileOutput.close();
			
			
		}
		
		
		
	}
		

		
	
	
		p.closePropertiesFile();
		wb.close();
		file.close();
		
		System.out.println("Printing Completed");
		driver.close();
		
		
}
}
