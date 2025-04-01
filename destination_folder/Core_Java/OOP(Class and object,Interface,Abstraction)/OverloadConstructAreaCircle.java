import java.util.*;
class Area
{
 int r,l,b,bs;
 float h;
 Area(int r)//circle
     {
	  this.r=r;
      System.out.println("Area of circle is"+(3.14*r*r));
	 }
 Area(int l,int b) //rectangle
     {
	  this.l=l;
	  this.b=b;
	  System.out.println("Area of Rectangle is"+(l*b));
	  System.out.println("Area of circle is"+(0.5*l*b));
	 }
 Area(int bs,float h)
     {
	  this.bs=bs;
	  this.h=h;
	  System.out.println("Area of circle is"+(0.5*bs*h));
	 }
}
public class OverloadConstructAreaCircle
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Radius");
int r=s.nextInt();
Area a1=new Area(r);

System.out.println("Enter the length");
int l=s.nextInt();
System.out.println("Enter the Breadth");
int b=s.nextInt();
Area a2=new Area(l,b);

/*System.out.println("Enter the Base");
int bs=s.nextInt();

System.out.println("Enter the Height");
float h=s.nextFloat();
//Area a3=new Area(bs,h);*/

}
}