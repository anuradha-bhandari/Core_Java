/*Q1. Write a java program to display following pattern.
	
		A 
		A B A
		A B C B A
		A B C D C B A
		A B C D E D C B A

*/

public class Pattern_3_12
{
   public static void main(String x[])
   {
     for(int i=1;i<=5;i++)
	  {
		   int c=1;
	     for(int j=1;j<=9;j++)
		  {
			  		

		     if(j<=4+i&&j>=6-i)
			  {
				   System.out.printf("%c",c+64);
				   if(j<5)
				   {  
			         
                	c++;			 
					 
				   }
				   
				   else
				   {  
			         c--;
				   }
			  }
			 else
			 {
			 System.out.printf("");
			 }				 
		  }
		  System.out.println();    
	  }
   }
}