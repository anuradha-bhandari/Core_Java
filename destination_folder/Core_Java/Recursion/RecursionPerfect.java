import java.util.*;
public class RecursionPerfect
{
 static int i=1,sum=0;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
Perfect(no);
String str=(sum==no)?"Perfect":"not perfect";
System.out.println(str);
}
public static void Perfect(int no)
{
       if(i<=no/2)
          {
              if(no%i==0)
                        {
               
          }
            sum=sum+i;
             i++;
           Perfect(no);
          }

}
} 