import java.util.*;
public class RecursionPowerNumber
{
static int p=1,i=1;
public static void main(String x[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the  base and index ");
 int b=s.nextInt();
 int indx=s.nextInt();

 Power(b,indx);
 System.out.println("Power is:"+p);


}
public static void Power(int b,int indx)
{
 
  if(i<=indx)
       {
        p=p*b;
        i++;
        Power(b,indx);
       }
}

}