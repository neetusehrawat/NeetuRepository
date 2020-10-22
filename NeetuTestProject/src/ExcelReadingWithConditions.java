import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingWithConditions {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\neetu\\Excel\\ExcelReadingCondition.xlsx");
		FileInputStream file= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalCoulmn=sheet.getRow(0).getLastCellNum();
		XSSFRow row;
		for(int i=0;i<=totalRows;i++) {
			if(sheet.getRow(i)!=null) {
				row=sheet.getRow(i);
				for (int j=0;j<totalCoulmn;j++) {
					if(row.getCell(j)!=null) {
						CellType type=row.getCell(j).getCellType();
						if(type==CellType.STRING) {
						String cellvalue=row.getCell(j).getStringCellValue();
						System.out.println("String value " + cellvalue);	
						}
						else if(type==CellType.NUMERIC) {
							Double cellvalue=row.getCell(j).getNumericCellValue();
							System.out.println("Numberic Value "+ cellvalue);	
							
						}
						else if(type==CellType.BOOLEAN) {
							Boolean cellvalue=row.getCell(j).getBooleanCellValue();
							System.out.println("Boolean Value "+ cellvalue);	
							
						}
																	
					}
				}
				
				
			}
			
		}
		
		wb.close();
		file.close();
		
		
	
		
		
		
		

	}

}
