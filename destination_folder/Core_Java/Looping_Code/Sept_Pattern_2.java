public class Sept_Pattern_2
{
public static void main(String x[])
{
int i,j;
for(i=1;i<=5;i++)
{
  for(j=1;j<=9;j++)
    {
	  if((i==1)||(i==2&&j<6)||(i==3&&j<=2)||(i==4&&j<=6)||(i==5&&j<=3))
	    {
	     System.out.printf("*");
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