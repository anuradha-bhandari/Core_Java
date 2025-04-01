/*Q1. Define an interface Shape with a method calculateArea(). Implement this interface in classes Circle and Rectangle.*/

interface Shape 
{
  void calculateArea();  
}

class Circle implements Shape
{
   int r; 
   Circle(int r)
	{
	 this.r=r;
	}
   public void calculateArea()
    {
      System.out.println("Area of Circle is: "+(3.14*r*r));   
	}   

}

class Rectangle implements Shape
{
   int b,l;
    Rectangle(int b,int l)
     {
	   this.l=l;
	   this.b=b;
	 }	
    public void calculateArea()
    {
	 System.out.println("Area of Circle is: "+(l*b));   
	}   
}

public class InterfaceAreaApp
{
   public static void main(String x[])
   {
      Shape s;
	  s=new Circle(2);
	  s.calculateArea();
	  s=new Rectangle(3,2);
	  s.calculateArea();

   }
}