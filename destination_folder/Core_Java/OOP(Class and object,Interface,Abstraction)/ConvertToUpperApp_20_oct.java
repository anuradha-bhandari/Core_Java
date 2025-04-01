/*6. create the class name as ConvertToUpper with a following methods
class ConvertToUpper
{  char c[];
   void setCharArray(char ch[])
   { //here accept the character array and store in instance variable in character array
     c=ch;
   }
   void convertToUpperCase()
   { //here we need to write the manual logics for converting lower case array
	//to upper case
   }
}
public class ConvertToUpperApp
{
   public static void main(String x[])
   {   //here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
	  //here create the object of ConvertToUpper class 
     //call setCharArray() function and pass ch array in setCharArray() function
    //call convertToUpperCase() function and see the result
   }
}*/
import java.util.*;
class ConvertToUpper
{  char c[];
   void setCharArray(char ch[])
   { 
     c=ch;
   }
   void convertToUpperCase()
   {
	   for(int i=0;i<c.length;i++)
	   {
		 if(c[i]>=65&&c[i]<=90)
		  {
			System.out.println((char)(c[i]+32)); 
		  }
		 
		 else
		  {
			System.out.println((char)(c[i]-32)); 
		  }
      		 
	   }
   }
}
public class ConvertToUpperApp_20_oct
{
   public static void main(String x[])
   { 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Character in array");
	char ch[]=new char[6];
    for(int i=0;i<ch.length;i++)
    {
	  ch[i]=s.next().charAt(0);
	}

    ConvertToUpper c1=new ConvertToUpper();
    c1.setCharArray(ch);
	c1.convertToUpperCase();
   }
}