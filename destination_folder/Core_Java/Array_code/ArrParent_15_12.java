/*Write Program to perform method overriding you have to create class name as ArrParent with method void setValue(int arr[]): this method can accept array as parameter void arrangeSeq(): this method can display array as per user input sequence You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.*/

import java.util.*;
class ArrParent
{
	int arr[]; 
  void setValue(int arr[])
   {
     this.arr=arr;
   }
   
  void arrangeSeq()
   {
      
   }
}

class ArrangeAscendingOrder extends ArrParent
{
    void arrangeSeq()
    {
      for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  } 
	  }
	   System.out.println("Array in sorting");
	   for(int i=0;i<arr.length;i++)
	   {
		 System.out.println(arr[i]);   
	   }
    }
}

class  ReverseArray extends ArrParent
{
   void arrangeSeq()
    {
		int mid=arr.length/2;
		int end=arr.length-1;
      for(int i=0;i<mid;i++,end--)
	  {
		 int temp=arr[i];
         arr[i]=arr[end]; 
          arr[end]=temp; 		 
	  }
	  
	  System.out.println("After reversing");
	  for(int i=0;i<arr.length;i++)
	  {
	   System.out.println(arr[i]);     
	  }
    }
}

public class ArrParent_15_12
{
   public static void main(String x[])
   {
	  Scanner s=new Scanner(System.in);
	  int a[]=new int[5]; 
      System.out.println("Enter the elements in array");
      for(int i=0;i<a.length;i++)
	  {
		  a[i]=s.nextInt();
	  }
     
      ArrangeAscendingOrder a1=new ArrangeAscendingOrder();
	  a1.setValue(a);
      a1.arrangeSeq();
	  
	  ReverseArray r1=new ReverseArray();
	  r1.setValue(a);
	  r1.arrangeSeq();
	 
   }
}