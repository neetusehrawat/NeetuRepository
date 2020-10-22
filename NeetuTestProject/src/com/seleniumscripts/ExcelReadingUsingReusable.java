package com.seleniumscripts;
import java.io.IOException;

public class ExcelReadingUsingReusable {

	public static void main(String[] args) throws IOException {
		ReusableExcelReader r= new ReusableExcelReader("C:\\Users\\neetu\\Excel\\ExcelReading.xlsx");
		int totalRow= r.getRowCount("Sheet1");
		String cellValue=r.getCellData("Sheet1", 0, 1);
		String cellValue1=r.getCellData("Sheet1", 0, 2);
		String cellValue2=r.getCellData("Sheet1", 2, 3);
		System.out.println(totalRow);
		System.out.println(cellValue);
		System.out.println(cellValue1);
		System.out.println(cellValue2);
		r.closeExcel();
		
		
		
		

	}

}
