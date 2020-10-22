import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {
				
		File f= new File("C:\\Users\\neetu\\Excel\\ExcelReading.xlsx");
		FileInputStream file= new FileInputStream(f);
		
		//FileInputStream file= new FileInputStream("C:\\Users\\neetu\\Excel\\ExcelReading.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		XSSFRow rownum=sheet.getRow(1);
		XSSFCell coulmnCell= rownum.getCell(1);
		System.out.println(coulmnCell.getStringCellValue());
		
		
//Note: XSSFRow,XSSFCell are classes which provides some methods which can be directly used instead writing multiple line of code
	
		
		String excelValue=sheet.getRow(2).getCell(3).getStringCellValue();
		System.out.println(excelValue);
		
// to read entire Excel data - first total row count using any last row count
//to get column count use any row 
		
		int totalRows=sheet.getLastRowNum();
		int totalCoulmn=sheet.getRow(0).getLastCellNum();
		XSSFRow row;
		String cellValue;
		
		for(int i=0; i<=totalRows;i++) {
			row=sheet.getRow(i);
			for(int j=0;j<totalCoulmn;j++) {
				cellValue=row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
		}
		
		wb.close();
		file.close();
		
}	
		
		

	}


