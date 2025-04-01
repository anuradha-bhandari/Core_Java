import java.util.*;
public class RecursionPrintReverse
{
static int rem=0,rev=0; 

public static void main (String x[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int no=s.nextInt();
 Rev(no);
 System.out.println("Display the Reverse number\n"+rev);

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