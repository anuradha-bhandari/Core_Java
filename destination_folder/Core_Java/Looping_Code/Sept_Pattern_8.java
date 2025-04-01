/*A B C D E F 
B C D E F A 
C D E F A B
D E F A B C 
E F A B C D 
F A B C D E  */
public class Sept_Pattern_8
{
public static void main(String x[])
{
int i,j,c,c1=1;

for(i=1;i<=6;i++)
{
  c=i;
  for(j=1;j<=6;j++)
    {
	 if(j<=7-i)
	 {
	 System.out.printf("%c",c+64);
	 c++;
	 }	
	  else
	  {
	  	 System.out.printf("%c",c1+64);
       c1++;
	  }
	}
	System.out.println();
	c1=1;
}	
}
}


