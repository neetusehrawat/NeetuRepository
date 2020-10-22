
public class TestConditional {

	int a=100 ,b=300 , c= 21;
	
	
	 void printLargestNumber() {
		if (a>b && a>c) {
			System.out.println("a is larger than b & c");  
																
	}else if (b>a && b>c) {
		System.out.println("b is larger than a & c");  
	}else {
		System.out.println("c is larger than a and b");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestConditional tc = new TestConditional();
		tc.printLargestNumber();
		

	}

}
