/*Q. WAP to Create parent class name as Bank with one method name as 
public float getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration)
: this method can calculate the monthly emi using simple interest rate 9%
Note: you have to create two more child class name as Cooperative and Nationalize and you have to inherit Bank class in Cooperative and Nationalize class and override getMonthlyEmiUsingSimpleInterest(int loanAmont,int duration) in both classes and Cooperative class calculate monthly EMI using interest rate 10% and Nationalize class calculate monthly EMI using 7% interest.
*/
import java.util.*;
class Bank
{
  float ActualAmt,EMI;
  void getUsingSInterest(int Loanamt,int Dur)
  {
   ActualAmt=Loanamt+(Loanamt*(9/100));
   EMI=ActualAmt/(12*Dur);
  
  }
}

class Cooperative extends Bank
{
  void getUsingSInterest(int Loanamt,int Dur)
  {
   ActualAmt=Loanamt+(Loanamt*10/100);
   EMI=ActualAmt/(12*Dur);
  }
   float getCoEmi()
   {
    return EMI;
   }
} 

class Nationalize extends Bank  
{
  void getUsingSInterest(int Loanamt,int Dur)
  {
   ActualAmt=Loanamt+(Loanamt*7/100);
   EMI=ActualAmt/(12*Dur);
  
  }
  float getNaEmi()
   {
    return EMI;
   }
} 

public class InheritanceOverriding
{
 public static void main(String x[])
	{
	 Scanner s=new Scanner(System.in);
     System.out.println("Enter the  Loan amount");	
     int LoanAmt=s.nextInt();	

     System.out.println("Enter the  Duration in yr");  
	 int Dur=s.nextInt();	
	 
	 Cooperative s1=new Cooperative();
	 s1.getUsingSInterest(LoanAmt,Dur);
	 float r=s1.getCoEmi();
	 System.out.println("EmI of Cooprative Bank is"+r);
	 
	 Nationalize s3=new Nationalize();	 
	 s3.getUsingSInterest(LoanAmt,Dur);
	 float r2=s3.getNaEmi();
	 
	System.out.println("EmI Nationalize of  Bank is"+r2);

	 
     	 
}
}