
public class WithdrawMoney2 {
	
	
	static double balance=10000;			
	
	  void Withdraw(double amt) {
		 
		
		 balance= balance - amt;
		 
		 System.out.println("Remaining Balance in bank:" + balance);
		 
		
	}
	 
	 
	 public static void main(String[] args) {
		
		WithdrawMoney2 hdfc= new WithdrawMoney2();
		 hdfc.Withdraw(2000);
			 
		WithdrawMoney2 sbi= new WithdrawMoney2();
		 sbi.Withdraw(2000);
		 
		 WithdrawMoney2 axis= new WithdrawMoney2();
		 axis.Withdraw(2000);
		 
		
		
		
}
}