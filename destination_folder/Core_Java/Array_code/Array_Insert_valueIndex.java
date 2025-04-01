package org.Array;

import java.util.Scanner;

public class Array_Insert_valueIndex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the Elements in array");// 1 2 3 4 5 
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the value");
		int value=s.nextInt();
		
		System.out.println("Enter the index");
		int indx=s.nextInt();
		
		for(int i=a.length-1;i>indx;i--)
		{
			a[i]=a[i-1];
		}
		a[indx]=value;	
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
