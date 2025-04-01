import java.util.Scanner;
public class FunctionNatural
{
 static int i=1;
public static void main(String x[])
{


Scanner s=new Scanner(System.in);
System.out.println("Enter the limit");
int n=s.nextInt();
show(n);

}
public static void show(int n)
{
 
 if(i<n)
{
 System.out.println(i); 
 show(i+1); 
}

}
}
