import java.util.*;
interface StringTemplate
 {
	void setString(String s);
	int getResult();
 }

class ExtractDigit implements StringTemplate
 {
	 String s;
	 int sum=0;
     public void setString(String s)
		{
			this.s=s; 
		}	

    public int getResult()
	{
		
		for(int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				sum+=s.charAt(i)-48;
			}
		}
		 return sum;
	}	
 }

class CountVowel implements StringTemplate
	{
        String s;
		int count=0;
		public void setString(String s)
			{
				this.s=s; 
			}
	    public int getResult()
			{
			 for(int i=0;i<s.length();i++)
			 {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
					{
					   count++;
					}		
			 }
			return count; 
     
			}
	}		

class StringHelper
 {
  void performOperation(StringTemplate template)
   {
          int result=template.getResult();
          System.out.println("Result is: "+result);		  
   }
 }

public class StringWithDynamicPolyApp_3_02Que1
 {
  public static void main(String x[])
  {
	 Scanner s=new Scanner(System.in);
      
     StringHelper sh=new StringHelper();
	 StringTemplate str;
	 
	 do		
		{
			System.out.println("Enter your Choice");
			int choice=s.nextInt();
			s.nextLine();
		   switch(choice)
				{
					case 1:
						
						    System.out.println("Enter the string");
							String s1=s.nextLine();
							 
							str=new ExtractDigit();
                            str.setString(s1); 
							sh.performOperation(str);	
							break;
						
					case 2:
						
							System.out.println("Enter the string");
							String s2=s.nextLine();
							 
							str=new CountVowel();
                            str.setString(s2); 
							sh.performOperation(str);	
							
							break;
						
					case 3:
						
							System.exit(0);
					default:
						
						 System.out.println("Wrong choice");
						 break;
						
						
				}
		}while(true);
      	 
		
  }
 }
 