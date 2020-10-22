
public class MethodOverridingBank {
	  
	void getRateOfInterest(float roi){
			System.out.println(roi);
		}  
	}  

		//Creating child classes.  
		class SBI extends MethodOverridingBank{
			void getRateOfInterest(float roi){
				System.out.println("SBI " + roi);
			}  
			
			
		}  
		  
		class ICICI extends MethodOverridingBank{ 
			void getRateOfInterest(float roi){
				System.out.println("ICICI" + roi);
			}  
		}
		 
		class AXIS extends MethodOverridingBank{  
			void getRateOfInterest(float roi){
				System.out.println("AXIX " + roi);
			}  
		
	}
