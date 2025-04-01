
public class Pattern_practice2
{
public static void  main(String x[])
{
int i,j;
boolean flag=true;
for(i=1;i<=6;i++)
{
   for(j=1;j<=11;j++)
    {
	    if(j>=i&&j<=12-i&&flag)
		{
		System.out.printf("*");
        flag=false;
		}
		else
		{
	    System.out.printf(" ");
		flag=true;
     	}
		
    }
	System.out.println("");
}
}
}
