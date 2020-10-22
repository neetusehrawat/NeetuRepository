package com.seleniumscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
	
	public String getBrowserName() throws IOException {
		
		File f= new File(System.getProperty("user.dir") +"\\configuration.properties");
		FileInputStream file= new FileInputStream(f);
		Properties p= new Properties();
		p.load(file);
		String browserName=p.getProperty("browser");
		System.out.println(browserName);
		file.close();
		return browserName; 
		
	}
	
	public static void main(String[] args) throws IOException {
		PropertyFileReading p = new PropertyFileReading();
		p.getBrowserName();
		
	}

	
}