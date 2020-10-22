
public class MultiLevelInheritanceDog {
	
	void eat(){
		System.out.println("eating...");
		}  
}  

	class Dog1 extends MultiLevelInheritanceDog{  
		void bark(){
			System.out.println("barking...");
			
		}
	}
		
	class BabyDog extends Dog1{  
		void weep(){
		System.out.println("weeping...");
				
			}
	}
