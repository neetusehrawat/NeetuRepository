
class InheritanceBankConstructors {
	
	String ifsc;
	float roi;
	
	//Constructors
	
	InheritanceBankConstructors(String ifsc,float roi) {
		this.ifsc=ifsc;
		this.roi=roi;
		System.out.println(this.ifsc);
		System.out.println(this.roi);
	}
		void display() {
		System.out.println("Method can access constructor variable " + ifsc);
		}
}
	
	class HdfcBank extends InheritanceBankConstructors{			
		
			HdfcBank(String ifsc, float roi) {
			super(ifsc, roi);
			// TODO Auto-generated constructor stub
		}
			
			
	}
	class SbiBank extends InheritanceBankConstructors{

		SbiBank(String ifsc, float roi) {
			super(ifsc, roi);
			// TODO Auto-generated constructor stub
		}
		//we can define constructor as
 
		
		
	}
	class AxisBank extends InheritanceBankConstructors{

		AxisBank(String ifsc, float roi) {
			super(ifsc, roi);
			// TODO Auto-generated constructor stub
		}
		
	
}



