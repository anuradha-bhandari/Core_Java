package org.code;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		
		int a=0;
		int b=1;
		int fib;
		System.out.print(a+" "+b);
		for(int i=1;i<n-1;i++)
		{
			fib=a+b;
			System.out.print(" "+fib);
			a=b;
			b=fib;
		}
	}

}
