import java.util.*;
interface ArrayOperation
{   
   void performOperation(int a[]);	
}
class Sort implements ArrayOperation
{
	int a[],temp=0;
   public void performOperation(int a[])
	{
	 this.a=a;
     for(int i=0;i<a.length-1;i++)
	 {
		for(int j=i+1;j<a.length-1;j++)
		{ 
		   if(a[i]>a[j])
		      {
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
		      }
		} 
	 }
	 System.out.println("After sorting Array");
	  for(int i=0;i<a.length-1;i++)
      {		  
       System.out.println(a[i]);
	  } 
	}
}

class Insertion implements ArrayOperation
{
  	int a[],value,indx;
	 void setValue(int value,int indx)
	{
		this.value=value;
		this.indx=indx;
	}
   public void performOperation(int a[])
	{
	 this.a=a; 
	 for(int i=a.length-1;i>indx;i--)
	 {
		a[i]=a[i-1];
	 }
	 a[indx]=value;
	 System.out.println("After inserting element");
	 for(int i=0;i<a.length;i++)
	 {
		System.out.println(a[i]);
	 }
	}	 
}
class Deletion implements ArrayOperation
{
	int a[],indx;
	void setValue(int indx)
	{
		this.indx=indx;
	}
   public void performOperation(int a[])
	{
	 this.a=a; 
	 for(int i=indx;i<a.length-1;i++)
	 {
		a[i]=a[i+1];
	 }
	 
	 System.out.println("After Deletion element");
	 for(int i=0;i<a.length-1;i++)
	 {
		System.out.println(a[i]);
	 }
	}
}
class Reverse implements ArrayOperation
{
     int a[];
	public void performOperation(int a[])
    {
	 this.a=a;	
	 int end=a.length-2;
	 int mid=a.length/2;
     for(int i=0;i<mid;i++,end--)
     {  int temp=a[i];
	     a[i]=a[end];
         a[end]=temp;		
     }
	 System.out.println("After Reverse the array");
	 for(int i=0;i<a.length-1;i++)
	 {	 
	  System.out.println(a[i]);
	 }
    }   
}

public class InheritanceArrayOperation
{
public static void main(String x[])
{
 Scanner s=new Scanner(System.in);
 int a[]=new int[7];
 System.out.println("Enter the elements in array");
 for(int i=0;i<a.length-1;i++)
 {
   a[i]=s.nextInt(); 
 }
  Sort s1=new Sort();
  s1.performOperation(a);
 
  Insertion I1=new Insertion();
  I1.setValue(44,2);
  I1.performOperation(a);
  
  Deletion d=new Deletion();
  d.setValue(2);
  d.performOperation(a);
  
  Reverse r1=new Reverse();
  r1.performOperation(a);
}
}