import java.util.*;
class Reverse
{
int no,rev=0;
void SetValue(int x)
     {
	  no=x;
     }
int showRev()//123
	 {
	  while(no>0)
	  {
	   int rem=no%10;
	   no=no/10;
	   rev=rev*10+rem;
	  }
	  return rev;
	 }
}
public class ClassReverse
{
public static void main(String x[])
{
Reverse r=new Reverse();
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
r.SetValue(no);
System.out.println("Reverse number is "+r.showRev());	  

}
}