import java.util.*;
public class FunctionCheckArmstrong
{
static int temp,p,sum,rem,c;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
Arm(no);
}
public static void Arm(int no)
{
  temp=no;

  c=0;
  while(temp>0)
        {
         temp=temp/10;
         c++;
        } 
       temp=no;
       rem=0;
       sum=0;
       while(temp>0)
                   {
                    rem=temp%10;
                    temp=temp/10;
                            p=1;
                          for(int i=1;i<=c;i++)
                                 {
                                  p=p*rem;
                                } 
                       sum=sum+p;

                    }

if(sum==no)
{
System.out.println("number is Armstrong number");
}
else
{
System.out.println("number is Armstrong number");
}

}
}

 
