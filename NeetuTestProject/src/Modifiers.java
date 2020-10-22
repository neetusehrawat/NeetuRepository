
public class Modifiers {
	
	private int data=40;  
	private void msg(){
			System.out.println("Hello java"); 
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Modifiers obj=new Modifiers();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error  
		   }  
		

	}


