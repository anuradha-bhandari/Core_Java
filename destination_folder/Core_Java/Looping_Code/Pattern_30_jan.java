public class Pattern_30_jan
{
   public static void main(String x[])
   {
	     int i,j;
		 boolean flag=true;
		 for(i=1;i<=10;i++)
		 {
			for(j=1;j<=9;j++)
			{
				if(j>10-i*2&&j%2==0&&i<=5)
				{
				 System.out.print("#");
				 //flag=false;
				} 
				else if(j>10-i*2&&j%2!=0&&i<=5)
				{
				 System.out.print(i);
                // flag=true;				 
				}
				else if(j>=i*2-11&&j%2!=0&&i>5)
				{
					System.out.print(11-i);
					//flag=false;
				}
				
			 else if(j>=i*2-11&&j%2==0&&i>5)
				{
					System.out.print("#");
					//flag=false;
				}
				else
				{
					System.out.print(" ");
				}
			}
            System.out.println();			
		 }
		 
   }
} 