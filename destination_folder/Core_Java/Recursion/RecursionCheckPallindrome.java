import java.util.*;
public class RecursionCheckPallindrome
{
static int rem=0,rev=0; 

public static void main (String x[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int no=s.nextInt();
 int temp=no;
 Rev(no);
 if(rev==temp)
  {
   System.out.println("Number is pallindrome");
  }
 else
{
 System.out.println("Number is not pallindrome");
}
}
public static void Rev(int no)
{
   if(no>0)
     {
       rem=no%10;
       no=no/10;
       rev=rev*10+rem;
       Rev(no);

      }
 }

}