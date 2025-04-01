import java.util.*;
class StringOperation
{
	void stringOperation(String s)
		{
			char ch[]=s.toCharArray();
			int i,j;
			
			for( i=0;i<ch.length;i++)
				{
					for(j=i+1;j<ch.length;j++)
						{
							if(ch[i]>ch[j])
								{
									char temp=ch[i];
									ch[i]=ch[j];
									ch[j]=temp;
								}
						}
				}
			System.out.println("After sorting the String in Ascending order: "+new String(ch));	
				
					
		}
	void stringOperation(String first,String second)
		{
			boolean flag=true;
			if(first.length()!=second.length())
				{
					System.out.println("Length are mismatch");
					return;
				}
			
			for(int i=0;i<first.length();i++)
			{
				if(first.charAt(i)!=second.charAt(i))
					{
						flag=false;
						break;
					}
			}
			if(flag)
				{
					System.out.println("Strings are equal");
				}
			else
				{
					System.out.println("Strings are not equal");
				}
		}
	void stringOperation(String s,char ch)
		{
			boolean flag=false;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				System.out.println("Character found");
			}
			else
			{
				System.out.println("Character not found");
			}
		}
}
public class StringOperationOverloadingQue4Feb3
{
 public static void main(String x[])
 {
	Scanner s=new Scanner(System.in);
	StringOperation so=new StringOperation();
	
	do
		{
			System.out.println("Enter the choice");
			int choice=s.nextInt();
			s.nextLine();
			switch(choice)
				{
					case 1:
							System.out.println("Enter the String");
							String s1=s.nextLine();
							so.stringOperation(s1);
					break;
					case 2:
							System.out.println("Enter the String");
							String s2=s.nextLine();							System.out.println("Enter the second String");
							String s3=s.nextLine();
							so.stringOperation(s2,s3);
	
					break;
					case 3:
					 
							System.out.println("Enter the String");
							String s4=s.nextLine();
							System.out.println("enter the character");
							char ch=s.next().charAt(0);	
							so.stringOperation(s4,ch);

					break;
					case 4:
					 System.exit(0);
					default:
						System.out.println("Invalid input");
					break;
				}
		}while(true);
	
 }
}