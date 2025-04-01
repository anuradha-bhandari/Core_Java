import java.util.*;
public class RecursionDuck
{
static int rem;
static boolean flag=false;
public static void main(String x[])
{ 
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
 boolean r=Duck(no);
String str=(r)?("Number is Duck"):("Number is not duck");
System.out.println(str);
}
public static boolean Duck(int no)
{
  if(no>0)
      {
        rem=no%10;
        no=no/10;
         if(rem==0)
                  {
                    flag=true;
                     }
        
       
       Duck(no);
       } 
return flag;

}
}