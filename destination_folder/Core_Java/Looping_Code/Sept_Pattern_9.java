/*
1 2 3 4 5 6
1 2     5 6
1   3 4   6
1   3 4   6
1 2     5 6
1 2 3 4 5 6 */
public class Sept_Pattern_9
{
public static void main(String x[])
{
int i,j;

for(i=1;i<=6;i++)
{

  for(j=1;j<=6;j++)
    {
	 if(j==1||j==6||i==1||i==6||j==i||j==7-i)
	 {
	 System.out.printf("%d",j);
	 
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
