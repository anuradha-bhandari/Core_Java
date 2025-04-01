
public class Pattern_practice4
{
public static void  main(String x[])
{
int i,j,c;
for(i=1;i<=7;i++)
{

   for(j=1;j<=4;j++)
    {   c=3;
	    if(j<=i&&i<=4)
		{
        System.out.printf("%d",i+2); 
		}
		 else if(j<=8-i&&i>4){
		    System.out.printf("%d",10-i); 
		 }
		
		else
		{
	    System.out.printf("");
     	}
		
    }
	System.out.println("");
}
}
}
