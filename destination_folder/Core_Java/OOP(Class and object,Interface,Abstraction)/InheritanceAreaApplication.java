import java.util.*;
 abstract class Area
{
  abstract void showArea();
  {
	  
  }  
}
class Circle extends Area
{
	int radius;
	double area;
 void setRadius(int radius)
	{
	 this.radius=radius;	
	}
 void showArea()
  {
	 area=3.14*radius*radius;
	 System.out.println("Area of Circle"+area);
  }
	
}
class Rectangle extends Area
{
	int len,wid;
	double area;
 	void setLenWid(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	void showArea()
	{
		area=len*wid;
	  System.out.println("Area of Rectangle"+area);

	}
}

public class InheritanceAreaApplication
{
	public static void main(String x[])
	{
	 Circle c=new Circle();
	 c.setRadius(5);
     c.showArea();
    
     Rectangle r=new Rectangle();
	 r.setLenWid(3,4);
	 r.showArea();
	}
}
