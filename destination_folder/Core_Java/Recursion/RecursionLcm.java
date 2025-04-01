import java.util.*;
public class RecursionLcm
{
static int max=1,lcm=0;
static boolean flag=true;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number 1");
int no1=s.nextInt();
System.out.println("enter the number 2");
int no2=s.nextInt();
Lcm(no1,no2);
System.out.println("lcm is:"+lcm);

if(no1>no2)
         {
          max=no1; 
          }
 else
     {
       max=no2;
      }
}

public static void Lcm(int no1,int no2)
{
    if(flag)
        {
           if(max%no1==0 && max%no2==0) 
               {
                 lcm=max;
                }
           if(max%no1==0 && max%no2==0)
               {
                flag=false;
                } 
          max++;

          Lcm(no1,no2);

        }
	
	
}
}

 