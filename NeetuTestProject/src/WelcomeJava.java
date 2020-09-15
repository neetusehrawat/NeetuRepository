
// it is not necessary to write Public while creating class - Class name start with cap letter
public class WelcomeJava {
	
//standard main method
	public static void main(String[] args)	{
		
// A variable declared inside method must be initialized,called as local variable
		// int accno; Declaration
		final int num=123;
		// num=345; cannot assign value to final varibale 
// variable should start with small letter, cannot contain spaces	
		int myNum = 5, myNum1=2, myNum2=3;
			myNum=9; // this will overrite mynum variable
		float myFloatNum = 5.99f;
		
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";	
		
//Casting - assinging value of one datatype variable to another datatype variable
		
		int myNum4=45;		// print 45
		double double1=myNum4;		//45.0
		
		double mydouble=123.569; //print 123.569
		int myNum5= (int) mydouble;  //123
		
		++myNum; //increment myNum values by 1 similary --myNum will reduce by 1
		
		System.out.println("welecome to  Java world");
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myNum);
		System.out.println(myText);
		System.out.println(num);
		System.out.println(myText +' ' + "Neetu");
		System.out.println(num + myNum);
		System.out.println("Double datatype convereted to integer" + ' ' + myNum5);
		
		 int x = 5, y= 3; 
		 System.out.println("Arithmetic operatos" + ' ' + (x + y)) ;  //Arithmetic operators
		 System.out.println(x - y);  //2
		 System.out.println(x * y);  //15
		 System.out.println(x / y);  //1
		 System.out.println(x % y); //2
		 System.out.println(x++);
		 
	
		 
		 
		  //Assignment operators
		 System.out.println("Assignment operators" + ' ' + (x += 5));  //10
		 System.out.println(x -= 3); //7
		 System.out.println(x *= 3);  //21
		 System.out.println(x /= 3);  //7
		 System.out.println(x %= 3); //1
		 
		 x += 4;	
		 System.out.println(x);  // 5
		 System.out.println("comparison operators" + ' ' + (x >= y));   // comparison operators return true or false
		 System.out.println(x == y);
		 System.out.println(x <= y);
		 System.out.println(x > y);
		 System.out.println(x < y);
		 System.out.println(x != y);
		 
		 System.out.println("Logical Operators" + ' ' + (x > 3 && x < 10)); // Logical operators - returns true
		 System.out.println(x > 3 || x < 4); // returns true
		 boolean k= !(x > 3 && x < 10);
		 System.out.println(k); // returns false
		 
		 String text= "Elephant", text1= "Lion";   //lenth of string starts from 0
		 System.out.println("length of string" + ' ' + text.length());
		 System.out.println("Uppercase" + ' ' + text.toUpperCase());
		 System.out.println("LowerCsae" + ' ' + text.toLowerCase());
		 System.out.println("Index of text or char " + ' ' + text.indexOf("ant"));
		 System.out.println("Concatenation of text" + ' ' + text + ' ' + text1);
		 System.out.println("Concatenation of text" + ' ' + text.concat(text1));
		  
		 System.out.println("Hello \nworld");  // new line 
		 String txt = "It\'s alright.";
		 System.out.println(txt);
		 
		 x= 16;
		 y= 15;
		 System.out.println("max value is" + ' ' + Math.max(x,y));  // Math Class
		 System.out.println("max value is" + ' ' + Math.min(x,y));
		 System.out.println("max value is" + ' ' + (int)Math.sqrt(x));
		 System.out.println("max value is" + ' ' + (Math.random() * 10)); // any num between 0 to 9
		 
		 
		 
		//if else
		 int time = 20;
		 if (time < 18) {
		   System.out.println("Good day."); // if true
		 } else {
		   System.out.println("Good evening.");  //if false
		 }
		 
		 //if else if else
		 time = 23;
		 if (time < 10) {				
		   System.out.println("Good morning.");  // condition1 is true
		 } else if (time < 20) {
		   System.out.println("Good day.");   // condition is 2 and 1 is false
		 } else {
		   System.out.println("Good evening."); // condition1 and condition 2 both are false
		 }
		 
		 //Switch
		 int day = 4;
		 switch (day) {
		   case 6:
		     System.out.println("Today is Saturday");
		     break;
		   case 7:
		     System.out.println("Today is Sunday");
		     break;
		   default:
		     System.out.println("Looking forward to the Weekend");
		 }
		 
		 //while loop
		 int i = 0;
		 while (i < 5) {
		   System.out.println(i);
		   i++;
		 }
		 
		 //while with break and continue
		 
		 i=0;
		 while (i < 10) {
			 if (i == 4) {
			     break;
			   }
		  
			 System.out.println("break" + i);
			   i++;
			
		   
		 }
		 
		 i=0;
		 while (i < 10) {
			 
			
			 if (i == 4) {
				 i++;
			     continue;
			   }
		  System.out.println("Continue" + i);
		   i++;
		   
		 }
		 
		 // do while loop
		 i= 0;
		 do {
		
			  System.out.println(i);
			  i++;
		 }
			while (i < 5);
		 
		 //for loop
		
		 for (int j = 0; j < 5; j++) {
			 
			  if (j==2) {
				  
				  break;   // continue
			  }
			  System.out.println("for loop" + j);
			}
		 
		 
		 //for loop for array
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		 System.out.println(cars[0]);
		 cars[0]= "Toyota";     // update element of an array
		 System.out.println(cars[0]);
		 System.out.println(cars.length);  // number of element in array
		 
		 for (String j : cars) {               // for oop for array way 1
		   System.out.println(j);
		 }
		 
		 for(int j=0;j<cars.length;j++) {		// for oop for array way 2
			 System.out.println(cars[j]);
			 
		 }
		 
		 //mutidimesnsional arrary
		 int[][] mynum=	{{1,2,3,4},{5,6,8,9,10}};
		 System.out.println(mynum.length);
		 System.out.println(mynum[1].length);
		 for (int j=0; j<mynum.length; j++) {
			 for (int l=0;l<mynum[j].length; l++) {
			 System.out.println("multidimensional arrayu" + mynum[j][l]);
			 }
		 }
	
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	

		 
		
		
		
	
	
//User defined method- returntype methodname()
	void display(int pinnmum){
		
		int securitycode=1234;
				if (pinnmum==securitycode) {
		System.out.println("Pin mumber is verified");
				}
	}
	

}
