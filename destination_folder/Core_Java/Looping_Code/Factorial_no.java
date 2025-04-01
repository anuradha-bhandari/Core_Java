package org.code;
import java.util.*;
public class Factorial_no {

	public static void main(String[] args) {
		int f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s.nextInt();
		int i=1;
		while(i<=no)
			{
				f=f*i;
				i++;
			}
		System.out.println("Factorial of the number "+f);

	}

}
