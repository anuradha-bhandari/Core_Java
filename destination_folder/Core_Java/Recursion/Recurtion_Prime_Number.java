import java.util.*;
public class Recurtion_Prime_Number
{
	static int i=2,j=2,flag=0;
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Limit");
		
		int limit=s.nextInt();
		prime(limit);
	}
	public static void prime(int limit)
	{
		flag=0;
		if(i<=limit)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
				//flag=0;
			}
		  i++;
		prime(limit);
		}
		
	}
}