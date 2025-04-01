import java.util.*;
class Product
{
	int id,qty;
	String name;
	double price;

   void setId(int id)
   {
	 this.id=id;  
   }
   
   int getId()
   {
	 return id;
   }
   
   void setName(String name)
   {
	 this.name=name;  
   }
   
   String name()
   {
	 return name;
   }
   
   void setPrice(double price)
   {
	this.price=price;   
   }
   
   double getPrice()
   {
	 return price;
   }
   
   void setQnty(int qty)
   {
	  this.qty=qty; 
   }
   
   int getQnty()
   {
	  return qty;
   }
}

class ProductApp
{
	Product p[];
	double total,totalbill=0;
	double max=0;
	String n;
	void setProduct(Product p[])
	{
	  this.p=p;	
	}
	
   void totalBill()
   {
	   for(int i=0;i<p.length;i++)
	   {
	    total=p[i].getQnty()*p[i].getPrice();
		totalbill=total+totalbill;

	   }
	   System.out.println("Total bill of all products: "+totalbill);
	   
	   for(int i=0;i<p.length;i++)
	   {
		   if(p[i].getQnty()>max)
		   {
			 max=p[i].getQnty();
			 // n=p[i].getName();
		   }
	   }
	   System.out.println("Product with highest quqntity: "+max+"\t"); 
   }   
}
public class PojoClassApp_12_11
{
   public static void main(String x[])
   {
	 Scanner s=new Scanner(System.in);
     ProductApp p1=new ProductApp();
     Product p2[]=new Product[2];  // array of refernce
	 
	 for(int i=0;i<p2.length;i++)
	 {
		p2[i]=new Product();  //Array of Object 
		System.out.println("Enter the Product id");
		int id=s.nextInt();
		
		System.out.println("Enter the Product Quantity");
		int q=s.nextInt();
		s.nextLine();
	 System.out.println("Enter the Product name");
	 String n=s.nextLine();
	 
	 System.out.println("Enter product price");
	 double p=s.nextDouble();
	 
	 p2[i].setId(id);
	 p2[i].setName(n);
	 p2[i].setPrice(p);
	 p2[i].setQnty(q);
	 
	 }
	 
	 p1.setProduct(p2);
	 p1.totalBill();
   }
}