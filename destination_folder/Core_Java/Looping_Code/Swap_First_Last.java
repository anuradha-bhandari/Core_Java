package org.code;
import java.util.*;
public class Swap_First_Last {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s.nextInt();
		int last=no%10;
		int temp=no;
		int c=0;
		while(no>10) 
		{
			no=no/10;
			c++;
		}
		int first=no;// 12345 /50000+234*10=4230+1
		no=temp;
		int mid=(int) (no%Math.pow(10,c))/10;
		System.out.println("Mid of the number "+mid);
		int rev=(int) (last*Math.pow(10,c))+mid*10+first;
		System.out.println("After Swapping fisrt and last digit "+rev);
	}

}
