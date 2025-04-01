import java.util.*;
class Fact{
int no;


void Setvalue(int x)
{
no=x;
}
int ShowFact()
{
int f=1;
for(int i=1;i<=no;i++)
{
f=f*i;
}
//System.out.println("Factorial of no is "+f);
return f;
}
}
 
public class ClassFact
{
public static void main(String x[])
{
 Fact f1=new Fact();
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int no=s.nextInt();
 f1.Setvalue(no);
   System.out.println("fact is "+f1.ShowFact());
 }
 }
 