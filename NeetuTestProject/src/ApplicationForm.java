
public class ApplicationForm {
	
	void SubmitCustomerDetail (String name, String address,String gender) {
		
		System.out.println("Customer1 details are NAME ADRESS GENDER:" + ' ' + name + ' ' + address+ ' ' + gender);
	
	}

	void SubmitCustomerDetail (String name, String address,String gender,int mobno_pincode) {
		
		System.out.println("Customer1 details are NAME ADRESS GENDER MOB/PINCODE:" + ' ' + name + ' ' + address+ ' ' + gender + ' ' + mobno_pincode);
	
	}
	
	
	void SubmitCustomerDetail (String name, String address,String gender, int mobno, int pincode) {
	
	System.out.println("Customer1 details are NAME ADRESS GENDER Mobno Pincode:" + ' ' + name + ' ' + address+ ' ' + gender+ ' ' + mobno + ' '+ pincode);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationForm af= new ApplicationForm();
		af.SubmitCustomerDetail("John","Sibley street US","Male");
		af.SubmitCustomerDetail("Michael","North street, US","Male",651123456);
		af.SubmitCustomerDetail("Lisa","North street US","Female",55109);
		af.SubmitCustomerDetail("Lily","Jackson street US","Female",651789456,55896);
		

	}

}
