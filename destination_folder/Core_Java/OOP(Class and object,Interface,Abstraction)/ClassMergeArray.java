import java.util.*;
class MergeArray
{
	int a[],b[],c[];
	void setArray(int m[],int n[],int o[])
	{
		a=m;
        b=n;
		c=o; 
	}
	void mergeArray()
	{ int k=0;
		for(int i=0;i<a.length;i++)
		{
		 c[k]=a[i];
		 k++;
		}
		
		for(int i=0;i<b.length;i++)
		{
		 c[k]=b[i];
		 k++;
		}
	}
	int [] getArray()
	{
	 return c;	
	}
}
class  ClassMergeArray
{
	public static void main(String x[])
	{
   	  MergeArray m1=new MergeArray();
	   Scanner s=new Scanner(System.in);
	   int p[]=new int[5];
	   int q[]=new int[5];
	   int r[]=new int[10];
      System.out.println("Enter the five elements in 1st array ");	  
		for(int i=0;i<p.length;i++)
		{
		 p[i]=s.nextInt();	
		}
      System.out.println("Enter the five elements in 2nd array ");	  
		for(int i=0;i<q.length;i++)
		{
		 q[i]=s.nextInt();	
		}
		m1.setArray(p,q,r);
		m1.mergeArray();
		int []result=m1.getArray();
       System.out.println("After merge of 2 arrays ");	  
		for(int i=0;i<result.length;i++)
		{
		 System.out.println(result[i]);
		}			
	}
}