package Org.String;
import java.util.*;
public class StringQue4 {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the String");
     String s1=s.nextLine();
     /*String s2=" ";
     //converts its into char array
     char ch[]=s1.toCharArray();
     int end=ch.length-1;
     for(int i=0;i<ch.length/2;i++,end--)
      {
    	  char temp=ch[i];
    	  ch[i]=ch[end];
    	  ch[end]=temp;
    	  
      }
     for(int i=0;i<ch.length;i++)
      {
    	 s2+=ch[i];
      }
     System.out.println("Reverse string "+s2);*/
     s1=s1+"#";
     int i=0;
    while(s1.charAt(i)!='#')
     {
    	 i++;
     }
     System.out.println("length of the string is "+i);
	}

}
