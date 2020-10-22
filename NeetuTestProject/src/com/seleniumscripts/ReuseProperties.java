package com.seleniumscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReuseProperties {
	String filename;
	FileInputStream file;
	
	public ReuseProperties(String filename) throws IOException {
		this.filename=filename;
	}
	
	public String getProperty(String key) throws IOException {
		File f= new File(filename);
		file= new FileInputStream(f);
		Properties p= new Properties();
		p.load(file);
		String value= p.getProperty(key);
		//file.close();
		return value;
		
	}
	
	public void closePropertiesFile() throws IOException {
		file.close();
		
	}
	

}
