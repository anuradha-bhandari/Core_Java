package org.code;
import java.util.*;
public class SumOfSquareFirstNnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+(i*i);
			i++;
		}
		System.out.println("Sum of square of first n number "+sum);
		
	}

}
