  /*    *
  * * * * * * *
  *     * 
  * * * * * * *
        *     *
  * * * * * * * 
        *  */
public class Sept_Pattern_7
{
public static void main(String x[])
{
int i,j;

for(i=1;i<=7;i++)
{
 
  for(j=1;j<=7;j++)
    {
	 if(i==2||i==4||i==6||j==4||(i==3&&j<=4-i)||(i==5&&j>=i+2))
	 {
	 System.out.printf("*");
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
