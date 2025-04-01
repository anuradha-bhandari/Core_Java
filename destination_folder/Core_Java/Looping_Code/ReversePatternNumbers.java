package org.code;
import java.util.*;
public class ReversePatternNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int rev=0;
		while(n>=1)
		{
			rev=rev*10+n;
			n--;
			
		}
		System.out.println("reverse of the number\n"+ rev);
		
	}

}
