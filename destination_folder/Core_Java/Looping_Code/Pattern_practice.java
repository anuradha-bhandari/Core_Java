import java.util.*;
public class Pattern_practice
{
public static void  main(String x[])
{
int i,j;
for(i=1;i<=10;i++)
{
   for(j=1;j<=10;j++)
    {
	    if(j<=6-i||j>=5+i||j<=i-5||j>=16-i)
		{
		System.out.printf("*");
		}
		else
		{
	    System.out.printf(" ");
     	}
		
    }
	System.out.println("");
}
}
}
