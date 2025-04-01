    /*  1
		2 # 2
		3 # 3 # 3
		4 # 4 # 4 # 4
		5 # 5 # 5 # 5 # 5
		5 # 5 # 5 # 5 # 5
		4 # 4 # 4 # 4
		3 # 3 # 3
		2 # 2
		1
	*/
	public class Pattern_6_11
	{
	 public static void main(String x[])
	 {
	  
	   for(int i=1;i<=10;i++)
	   {
		    boolean flag=true;
	      for(int j=1;j<=9;j++)
		    {
			   if(j<=4+i&&j>=6-i&&i<=5&&flag)
                {
				 System.out.printf("%d",i);
				 flag=false;
			    }
				
				else if(j<=15-i&&j>=i-5&&i>5&&flag)
                 {
				  System.out.printf("%d",11-i);
				  flag=false;
			     }
                else if(j<=4+i&&j>=6-i&&j<=15-i&&j>=i-5&&!flag)
                  {
				   System.out.print("#");
				    flag=true;
				  }	
              else
			   {
				 System.out.print("");
			   }				 
			}
	   System.out.println();
	   }
	 }
	}
	
    
     