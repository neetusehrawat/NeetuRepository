package com.seleniumscripts;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReusableExcelReader {
	
	String excelPath;
	XSSFWorkbook wb;
	FileInputStream fi;
	
	public ReusableExcelReader(String excelPath) throws IOException {
		
		this.excelPath=excelPath;
		fi=new FileInputStream(this.excelPath);
		wb=new XSSFWorkbook(fi);
	}
	
	public int getRowCount(String sheetName) {
		
		int totalRowCount=wb.getSheet(sheetName).getLastRowNum()+1;
		return totalRowCount;
		
	}
	
	public String getCellData(String sheetName, int row, int cell) {
		String cellValue=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
		
	}
	
	public void closeExcel() throws IOException {
		wb.close();
		fi.close();
	}
	
	

}
