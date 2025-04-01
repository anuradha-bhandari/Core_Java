import java.util.*;
public class RecursionCheckPrime1
{
static Boolean flag=false; 
static int i=2;
public static void main(String x[])
{
int no=2;

Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
no=s.nextInt();
prime(no);
if()
{
System.out.println("Number is prime");
}
else
{
System.out.println("Number is not prime");

}
}
public static boolean prime(int no)
{
  if(no<=n)
    { for(;i<=no/2;)
      {
      if(no%i==0)
          {
           flag=true;
          }
    i++;
    }
   prime(no);  
   }
return flag;  
}
}

