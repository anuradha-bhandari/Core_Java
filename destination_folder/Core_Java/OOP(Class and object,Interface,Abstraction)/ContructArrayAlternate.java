/*Q1. Suppose consider we have two character array word1={‘a’,’b’,’c’} and word2={‘p’,’q’,’r’} 
Merge the two array in alternate order starting word1 
Note: set both character size same 
Example:
word1={‘a’,’b’,’c’}
word2={‘p’,’q’,’r’}
word3={‘a’,’p’,b’,’q’,’c’,’r’}
*/
import java.util.*;
class AlterMergeArr
{ char a[],b[],c[];
int i,k=0,m=1;
    AlterMergeArr(char a[],char b[],char c[])
	{
	 this.a=a;
     this.b=b;
     this.c=c;
	}	 

    void getArr()
	{
	 for(i=0;i<a.length;i++)
	 {
		
		c[k]=a[i];
        k=k+2;		
	 }
	 for(int i=0;i<b.length;i++)
	 {
		c[m]=b[i];
		m=m+2;
	 }
	for(int i=0;i<c.length;i++)
	 {
	  System.out.print(c[i]);
	 } 
	}	
}
public class ContructArrayAlternate
{
public static void main(String x[])
{
 Scanner s=new Scanner(System.in);
 
 char a[]=new char[3];
 
 
 char b[]=new char[3];
 
 char c[]=new char[6];
 
 System.out.println("Enter the elements in 1st array");
 for(int i=0;i<a.length;i++)
   {
	a[i]=s.next().charAt(0); 
   }
   
 System.out.println("Enter the elements in 2nd array");
 for(int i=0;i<b.length;i++)
   {
	b[i]=s.next().charAt(0); 
   } 
   
 AlterMergeArr a1=new AlterMergeArr(a,b,c);
 a1.getArr();
 
}
}