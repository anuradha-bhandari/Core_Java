package Org.String;
import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		int end=ch.length-1;
		for(int i=0;i<ch.length/2;i++,end--)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
		}
		boolean flag=true;
		for(int i=0;i<ch.length;i++)
		{
			if(s1.charAt(i)!=ch[i])
			{
				flag=false;
				//System.out.print(" "+ch[i]);
			}	
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
