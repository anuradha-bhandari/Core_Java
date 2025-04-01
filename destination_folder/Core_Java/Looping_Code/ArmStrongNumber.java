package org.code;
import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=s.nextInt();
		int c=0;
		int temp=no;
		while(no>0)
			{
				no=no/10;
				c++;
			}
		no=temp;
		int rem=0;
		int sum=0;
		 while(no>0)
		 {  
			 rem=no%10;
		     no=no/10;
 
    	     int p=1;
			for(int i=1;i<=c;i++)
			{
				p=p*rem;
			}
			sum=sum+p;
		 }	
		 no=temp;
		 if(no==sum)
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("no");
		 }
	}

}
