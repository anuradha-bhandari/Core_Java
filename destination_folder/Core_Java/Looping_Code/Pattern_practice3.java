public class Pattern_practice3
{
public static void main (String x[])
{
	int i,j;
for(i=1;i<=5;i++)
{
  for(j=1;j<=5;j++)
    {
      if(j==1)
	     {
		 System.out.printf("1");
		 }
		 else if(i==5)
		    {
			System.out.printf("%d",j);
			}
		else if(j==i){
			System.out.printf("%d",j);
			}
			
		else
			{
			System.out.printf(" ");
			}
    }
	System.out.println();
}
}
}