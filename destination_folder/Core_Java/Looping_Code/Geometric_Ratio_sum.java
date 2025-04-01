//Calculate the sum of the first N terms of a geometric series

package org.series_code;
import java.util.*;

public class Geometric_Ratio_sum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		System.out.println("Enter the ratio for geometric series");
		int r=s.nextInt();
		int c=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(c);
			sum+=c;
			c=c*r;
			
		}
		System.out.println("sum of the series " +sum);
	}

}
