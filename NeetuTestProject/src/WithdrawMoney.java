
public class WithdrawMoney {
	
	
	double balance=10000;			
	
	  void Withdraw( String Bnkname,double amount) {
				
		  //WithdrawMoney b=new WithdrawMoney();
		 balance= balance - amount;
		 
		 System.out.println("Remaining Balance in bank:" + ' ' + Bnkname + '=' + balance);
		 
		//return balance              ;
	}
	 
	 
	 public static void main(String[] args) {
		 WithdrawMoney b=new WithdrawMoney();  // create one instance call methods with different set of value
		 //b.balance=10000;
		 
		 b.Withdraw("HDFC",2000.0);	

		 b.Withdraw("SBI",2000.0);		 
		 
		 b.Withdraw("AXIS",2000.0);
		 
		 WithdrawMoney b1=new WithdrawMoney();  // create separate instance for same method--instance1
		 
		 b1.Withdraw("HDFC",2000.0);
		 
		 WithdrawMoney b2=new WithdrawMoney();  // create separate instance for same method--instance1
		 
		 b2.Withdraw("HDFC",2000.0);	
		 WithdrawMoney b3=new WithdrawMoney();   // create separate instance for same method--instance1
		 
		 b3.Withdraw("HDFC",2000.0);	
		
		 
		// Static varaibles- Shares same copy with updated value accross all instance
		//Instance variable shares different copy across different instance and same copy of updated value to same instance.
		 
		
}
}