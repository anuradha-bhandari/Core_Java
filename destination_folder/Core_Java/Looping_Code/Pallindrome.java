package org.code;
import java.util.*;

public class Pallindrome {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the limit");
       int no=s.nextInt();
       int rev=0;
       int temp=no;
       while(no>0)
       {
    	   rev=rev*10+no%10;
    	   no=no/10;
       }
       System.out.println(rev);
       if(temp==rev)
       {
    	   System.out.println("number is pallindrome");
       }
       else
       {
    	   System.out.println("No is not pallindrome");
       }
	}

}
