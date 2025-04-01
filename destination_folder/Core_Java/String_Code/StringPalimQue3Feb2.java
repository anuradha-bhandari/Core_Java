//Q3. WAP to Create class name as StringPalim 
import java.util.*;
class StringPalim
{
	String str;
	String str1="";
	StringPalim(String str)
		{
		  this.str=str;
		}
	String getRevString()
		{
			
			char ch[]=str.toCharArray();
			int mid=ch.length/2;
			int end=ch.length-1;
			for(int i=0;i<mid;i++,end--)
				{
					char temp=ch[i];
					ch[i]=ch[end];
					ch[end]=temp;	
					
				}
				for(int i=0;i<ch.length;i++)
					{
						str1=str1+ch[i];
					}
				return str1; 
		}	
	boolean isPalim()
		{
			return str.equals(str1)?true:false;		
		}
}
public class StringPalimQue3Feb2
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		StringPalim sp=new StringPalim(s1);
		System.out.println("Reverse: "+sp.getRevString());
		System.out.println(sp.isPalim());
	}
}
