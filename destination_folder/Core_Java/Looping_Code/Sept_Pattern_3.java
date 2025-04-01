public class Sept_Pattern_3
{
public static void main(String x[])
{
int i,j,a=0,b=1,sum=0;
boolean flag=true;
for(i=1;i<=5;i++)
{
  for(j=1;j<=9;j++)
      {
		  
		 if(j>=i&&j<=10-i&&flag)
		 {
          System.out.printf("%d",sum); 
		  flag=false;
			 
          sum=a+b;
          a=b;
          b=sum;		 

		 }
     else
	 {
     System.out.printf(" ");
      flag=true;	 
	 }		 
	}
	  System.out.println(); 
	        //flag=true;	 


}
}
}