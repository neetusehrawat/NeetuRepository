
public class TestInstanceStaticMethodVvariables {
	
	int a;			//instance Variable
	static int b;   // static variable
	
	void display(){                   //Instance Method
		
		System.out.println(a);   // instance variable automatically called in instance Method
		System.out.println(b);  //  static varibale automatically called in instance method
		
		//TestInstanceStaticMethodVvariables tv=new TestInstanceStaticMethodVvariables();
		display1();         // to call static method in Instance Method create Instance
		
		
	}

	static void display1() {          //Static method
		
		TestInstanceStaticMethodVvariables tv= new TestInstanceStaticMethodVvariables();  //create instance to call instance variable in static method
		System.out.println(tv.a);
		
		System.out.println(b); //  static varibale automatically called in instance method
		
		tv.display();  // // to call Instance method in static Method create Instance
	}
	
	public static void main(String[] args) {
		
		TestInstanceStaticMethodVvariables tv= new TestInstanceStaticMethodVvariables(); // create instance to call instance variable
		System.out.println(tv.a);
		
		System.out.println(b);  //static varibale automatically called in instance method
		
		// to call instance method create Instance method
		tv.display();
		
		// to call static method
		display1();
		
		
		
	}
}
