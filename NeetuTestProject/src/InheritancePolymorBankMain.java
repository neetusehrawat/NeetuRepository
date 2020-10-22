class InheritancePolymorBankMain{
	
	public static void main(String[] args) {
		
		//inheritancebankk.java - you can create an object of child class ---constructors
		
		HdfcBank nk=new HdfcBank("hdfc00123", 5.23f);
		nk.display();
		SbiBank sb= new SbiBank("sbi123", 6.15f);
		
		//constructors acn also also be called uing runtime polymorphism
		InheritanceBankConstructors ibc;
		ibc= new SbiBank("sbi89", 1.25f);
		ibc= new HdfcBank("hdfc124", 2.255f);
		
		
		
		
		
		//MethodOverridingbank.java
		
		SBI s= new SBI();
		s.getRateOfInterest(5.6f);
		ICICI i= new ICICI();
		i.getRateOfInterest(7.5f);
		AXIS aa= new AXIS();
		aa.getRateOfInterest(8.5f);
		
		//or we can use runtime polymorphism and create object only once.
		MethodOverridingBank mov;
		mov= new ICICI();
		mov.getRateOfInterest(4.5f);
		
		mov=new AXIS();
		mov.getRateOfInterest(9.5f);
		
		mov=new SBI();
		mov.getRateOfInterest(3.5f);
		
		
		
		
		
		
	}
}
