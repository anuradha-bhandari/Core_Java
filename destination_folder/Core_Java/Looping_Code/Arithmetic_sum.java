package org.series_code;
import java.util.*;

public class Arithmetic_sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		System.out.println("Enter the difference");
		int d=s.nextInt();
		int sum=0,c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(c+" ");
			sum=sum+c;
			c=c+d;
			
		}
		System.out.println("sum of first " +n +" terms "+sum);
	}

}
