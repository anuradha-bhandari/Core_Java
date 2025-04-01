 /*Q4. Create an interface Transaction with methods deposit() and withdraw(). Implement this interface in SavingsAccount and CurrentAccount.*/
 interface Transaction 
 {
	void deposit();
    void withdraw();	
 }
 
 class SavingsAccount implements Transaction 
 {
	public void deposit() 
	{
	  System.out.println("Payment has deposited successfully to saving account");	
	}
	
	public void withdraw()
	{
	 System.out.println("Payment has withdraw successfully to saving account");	
	} 
	
 }
 
 class CurrentAccount implements Transaction 
 {
	 public void deposit() 
	 {
	  System.out.println("Payment has deposited successfully to current account");	
	 }
	
	public void withdraw()
	{
	 System.out.println("Payment has withdraw successfully to current account");	
	} 
 }
 public class InterfaceTransactionApp
 {
   public static void main(String x[])
   {
	  Transaction t1;
      t1=new SavingsAccount();
	  t1.deposit();
	  t1.withdraw();
	  
      t1=new CurrentAccount();
      t1.deposit();
	  t1.withdraw();	  
   }
 }