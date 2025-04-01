public class Sept_Pattern_5
{
public static void main(String x[])
{
int i,j,c=1;

for(i=1;i<=7;i++)
{
 
  for(j=1;j<=7;j++)
    {
	 if(i<4&&j<=8-2*i)
	 {
	 System.out.printf("%c",c+64);
	 c++;
	 }	
	  else if(i>4&&j<=i*2-8)
	  {
	  	 System.out.printf("%c",c+64);
		 c++;
	  }
	 else if(i==4&&j<=5-i)
	     {
	  	 System.out.printf("%c",c+64);
		 c++;
	     }
	  else{
	  	  	System.out.printf(" ");	  
	      }
	}
 System.out.println("");


}
}
}
