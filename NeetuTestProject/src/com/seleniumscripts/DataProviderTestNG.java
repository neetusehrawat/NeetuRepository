package com.seleniumscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void openApplication() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.mortgagecalculator.org/");
		 driver.manage().window().maximize();
			 
	}
	
	@Test(dataProvider="calculate")
	public void calculateInterest(String homeValue,String downPayment,String loanamt) {
		sendkeys(By.id("homeval"), homeValue, "Entering home value");
		sendkeys(By.id("downpayment"), downPayment, "entering downpayment");
		sendkeys(By.id("loanamt"), loanamt, "entering loan amount");
		
		
		
	}
	
	@DataProvider(name="calculate")
	public String[][] getMethod() throws IOException{
		
		String input[][]=getDataFromExcel("C:\\Users\\neetu\\Desktop\\MortageCal.xlsx","Sheet1");
	
		//String[][] input= {{"5465","56852","8565500"},{"8745","12345","95142"}};
		return input;
		
	}
	
	
	public String[][] getDataFromExcel(String path,String sheetname) throws IOException{
		String array[][]=null;
		FileInputStream fi= new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet(sheetname);
		int tot_rows= sh.getLastRowNum();
		int tot_cols=sh.getRow(2).getLastCellNum();
		array=new String[tot_rows][tot_cols];
		for(int i=1;i<=tot_rows;i++) {
			XSSFRow row= sh.getRow(i);
			
			for (int j=0;j<tot_cols;j++) {
				XSSFCell cell=row.getCell(j);
				array[i-1][j]=cell.getStringCellValue();
			
							
			}
				
		}
		return array;
		
	}


	
	
	public static void sendkeys(By locator,String input,String testcasestep) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(input);
		
	}
	
}
	
	
	
	


