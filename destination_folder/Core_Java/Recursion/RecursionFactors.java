import java.util.*;
public class RecursionFactors
{
static int i=1;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
int i=1;
System.out.println("Display All factors of number:");
Fact(no);

}
public static void Fact(int no)
{
 if(i<=no/2)
{
 
   if(no%i==0)

 {
 
  System.out.println(i);
}
 
  i++;
   
Fact(no);


}
}
}
 