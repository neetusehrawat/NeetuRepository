import java.util.Scanner;

public class GetInputDataRuntimeScanner {
	
	 int a ,b , sum;
	
	 String name;
	
	
	void Sum() {
		
		 Scanner scan= new Scanner(System.in); // System is class and in is methhod that returns Inputstream
		 
		 System.out.println("Enter Integer a");
		 a= scan.nextInt();
		 
		 System.out.println("Enter Integer b");
		 b= scan.nextInt();
		 
		 sum= a+b;
		 System.out.println("Sum" + '=' + sum);
	}
	
	void printName() {
		
		 Scanner scan= new Scanner(System.in);
		
		 name=scan.next();
		System.out.println("Name" + '=' + name);
		
		name =scan.next();
		System.out.println("Name" + '=' + name);		
		
	}
		 
		
	public static void main(String[] args) {
		GetInputDataRuntimeScanner data = new GetInputDataRuntimeScanner();
		data.Sum();
		data.printName();
		 
		}
	}
		
		
	
	
	 
	 
	 
	
	 
	 



