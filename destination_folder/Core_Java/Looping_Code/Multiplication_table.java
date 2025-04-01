package org.code;
import java.util.*;
public class Multiplication_table {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the no");
     int no=s.nextInt();
     int m=1;
     for(int i=1;i<=10;i++)
     {
    	 m=no*i;
    	 System.out.println(m);
     }
	}

}
