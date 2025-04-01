import java.util.*;
class Number
{
  int rev=0,rem=0,no,i=2,c=0,sum=0;
  boolean flag=false;
  void setNo(int no)
    {
	 this.no=no;
	}
}
 
 class Rev extends Number
 { 
  int getRev()
    {
	 while(no>0)
	     {
		  rem=no%10;
		  no=no/10;
		  rev=rev*10+rem;
		 }
	 return rev;	 
	} 
 }	

  
class CountDigit extends Number
{
   int getCountDigit()
    {
	 while(no>0)
	     {
		  no=no/10;
		  c++;
		 }
	 return c;	 
	}
}
	
 class DigitSum extends Number
 { 
  int getDigitSum()
    {
	 while(no>0)
	     {
		  rem=no%10;
		  no=no/10;
		  sum=sum+rem;  
		 }
	 return sum;	 
	}  
 }	

  class Prime extends Number
  {
   boolean getIsPrime()
    {
	 while(i<=no/2)
	  {
		 if(no%i==0)
		 {
		   flag=true;
           break;		   
		 }	
        i++;		 
	  }
	 return flag;	 
	} 
 }	


public class InheritanceHierarchy
{
public static void main(String x[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
  int no=s.nextInt();
  
	Rev s1=new Rev();
	CountDigit s2=new CountDigit();
	DigitSum s3=new DigitSum();
	Prime s4=new Prime();
	 
	s1.setNo(no);
	System.out.println("After reverse "+s1.getRev());
	
	s2.setNo(no);
	System.out.println("count "+s2.getCountDigit());
	
	s3.setNo(no);
	System.out.println("Sum of digit "+s3.getDigitSum());
	
	s4.setNo(no);
	boolean r=s4.getIsPrime();
	if(!r)
	{
	 System.out.println("Prime");	
	}
	else
	{
	System.out.println("Not Prime");	
	}
	
	
	
}
} 