import java.util.*;
public class Recurtion_ArmStrong
{
	static int count=0,temp=0,sum=0,rem=0;
	public static void main(String x[])
	{	
		Scanner s = new Scanner(System.in);
		//int no,rem=0,count=0;
		System.out.println("Enter Number");
		int no=s.nextInt();
		temp=no;
		Arm(no);
		System.out.println("Count="+count);
		//temp=no;
		while(temp>0)
		{
			rem=temp%10;
			temp=temp/10;
			int p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*rem;
			}
			
			sum=sum+p;
		}
		System.out.println("Sum="+sum);
		if(no==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			{
			System.out.println("Number is Not Armstrong");
		}
		}
		
	}
	
	public static void Arm(int no)
	{    
		if(temp>0)
		{
			//rem=no%10;
			temp=temp/10;
			count++;
			Arm(no);
		}
		
	}
}