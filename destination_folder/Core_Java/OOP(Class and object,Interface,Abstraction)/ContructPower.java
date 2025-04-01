import java.util.*;
class Power
{
 int p=1,idx,b;
 
 Power(int b,int idx)
   {
   this.b=b;
   this.idx=idx;
   }
  int getPower()
   {
    for(int i=1;i<=idx;i++)
	   {
	   p=p*b;
	   }
	 return p;  
   }  
   
}

public class ContructPower
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base");
int b=s.nextInt();

System.out.println("Enter the index");
int idx=s.nextInt();

Power p=new Power(b,idx);
System.out.println(p.getPower());

}
}