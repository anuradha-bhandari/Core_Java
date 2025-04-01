import java.util.*;
public class RecursionTable
{ 
static int i=1;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
System.out.println("Display the Table");
Table(no);
}
 
public static void Table(int no)
{
  
   if(i<=10)
    {
      System.out.println(no*i);  
      i++;
     Table(no);
    } 
   

}
}

