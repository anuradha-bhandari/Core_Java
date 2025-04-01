import java.util.Scanner;
public class EmployeeWorkingEfficiency
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("To determine the working Efficiency");
System.out.println("Enter the time ");
int t=s.nextInt();

if((t>=2)&&(t<3))
{
System.out.println("Highly Efficient");
}

else if((t>=3)&&(t<4))
{
System.out.println("ordered to improve speed");
}

else if((t>=4)&&(t<=5))
{
System.out.println("give training to improve speed");
}

else
{
System.out.println("Employee should leave the company");
}
}
}





