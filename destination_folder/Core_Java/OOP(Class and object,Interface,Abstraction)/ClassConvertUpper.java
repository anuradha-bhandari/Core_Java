/*Q3. WAP to create class name as ConvertToUpper with three functions 
void setArray(char ch[]): this function can accept array as input 
*/
import java.util.*;
class Upper
{
	char ch[],k=0;
  	void setArray(char ch[])
	{
	 this.ch=ch;
	}
	
	char [] getArray()
	{
	  for(int i=0;i<ch.length;i++)
	  {
		if(ch[i]>=65&&ch[i]<=90)
		 {
		  ch[i]=(char)(ch[i]+32);
		  
		 }

        else if(ch[i]>=90&&ch[i]<=122)
		 {
		  ch[i]=(char)(ch[i]-32);
		 
		 } 
		 
		 else
		 {
			ch[i]=0;
		 }	 
	  }
     return ch;	  
    }
}
public class ClassConvertUpper
{
 public static void main(String x[])
 {
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter the Elements Array");
	char ch[]=new char[5]; 
	for(int i=0;i<ch.length;i++)
	{
	  ch[i]=s.next().charAt(0);
	}
	Upper u=new Upper();
	u.setArray(ch);
	char r1[]=u.getArray();
	for(int i=0;i<r1.length;i++)
	{
	  System.out.println(r1[i]);	
	}
 }
}