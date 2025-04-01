package Org.String;
import java.util.*;
public class Count_Vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
