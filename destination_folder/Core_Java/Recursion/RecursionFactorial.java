import java.util.*;
public class RecursionFactorial
{
 static int f=1,i=1;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
System.out.println("Display factorial of number");
Fact(no);
System.out.println(Fact(no));

}
public static int Fact(int no)
{
      
  if(i<=no)
     { 
      f=f*i;
      i++;       
     Fact(no); 
     }
return f;

}
}
