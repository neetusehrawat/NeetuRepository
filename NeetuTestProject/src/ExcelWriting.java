import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\neetu\\Excel\\Excelwriting.xlsx");
		FileInputStream file= new FileInputStream(f);
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		// Need to create row and column before entering data
		
//		XSSFRow row1=sheet.createRow(0);
//		XSSFCell cell=row1.createCell(0);
//		cell.setCellValue("Name1");
//			
//
//		XSSFCell cell1=row1.createCell(1);
//		cell1.setCellValue("Age");
//		
//		XSSFCell cell2=row1.createCell(2);
//		cell2.setCellValue("Rollno");
//		
//		XSSFRow row2=sheet.createRow(1);
//		XSSFCell cell21=row2.createCell(0);
//		cell21.setCellValue("Name1");
//			
//
//		XSSFCell cell22=row2.createCell(1);
//		cell22.setCellValue("Age");
//		
//		XSSFCell cell23=row2.createCell(2);
//		cell23.setCellValue("Rollno");
//		
//		
//		
//			
//		FileOutputStream fileOutput= new FileOutputStream(f);
//		wb.write(fileOutput);
		
		
		//Note- XSSFRow and XSSFCell are class and provide inbuilt methods which can be directly used.
		
		XSSFRow row=sheet.createRow(2);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("Age");
		row.createCell(2).setCellValue("RollNo");
		
		FileOutputStream fileOutput= new FileOutputStream(f);
		wb.write(fileOutput);
		
		
		fileOutput.close();
		wb.close();
		file.close();
		
		
		
		

	}

}
