public class Sept_Pattern_6
{
public static void main(String x[])
{
int i,j,c=1;

for(i=1;i<=7;i++)
{
  c=i-1;
  for(j=1;j<=7;j++)
    {
	 if(i==7||i==1||j==1||j==7)
	 {
	 System.out.printf("*");
	 }	
	  else
	  {
	  	 System.out.printf("%d",c);
        c++;
	  }
	}
	System.out.println();
}	
}
}