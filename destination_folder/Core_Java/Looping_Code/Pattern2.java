public class Pattern2
{
 public static void main(String x[])
 {
	 int i=1,j=1;
	 for(i=1;i<=6;i++)// take outer loop 
	 {
		 for(j=1;j<=11;j++)// take inner loop
		 {
			 if(j>=7-i&&j<=12-i)// take if for to apply the condition
			 {
				 System.out.print("*");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();// for new line
	 }
 }
}