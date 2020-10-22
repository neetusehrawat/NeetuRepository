package com.seleniumscripts;

import java.io.IOException;

public class ExceptionHandling {
	
	void div() {
		try {
		 int division=100/0;
		 System.out.println(division);
		 
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
	
	void display() {
		 System.out.println("I am in display method");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		

		ExceptionHandling e= new ExceptionHandling();
//		e.div();
//		e.display();
//		here the div method will fail this will not allow to execute display method. to avoid this use try catch
		
		e.div();
		e.display();	
		
// with try catch method dipaly method will exceute even if the div method will fails and throws exception
//THis type of Exception is called unchecked Exception or runtime Exception
//TYpe of Exception
//1. Checked - complile Time
//2. Unchecked - Runtime

//Can be handles with 5 Keywords
//1.try - logic code
//2.catch - handle exception
//3.throws are used with comile type exceptions
//4.throw -  to create user defined exception
//5.finally - always after try catch and with always execute

		
		
		
		
		
	}

}
