/*WAP Create class name as Bill with method int getBill(int qty,int rate)
this method can calculate the bill without any discount or without GST
and you have to two classes name as RegularCustomer and BulkPurchseCustomer
you have to inherit Bill class in RegularCustomer and override int getBill(int qty,int rate) in RegularCustomer and give 20% discount on Bill and you have to inherit the Bill class in BulkPucharseCustomer and override getBill(int qty,int rate) method and calculate bill and give 10% discount on it.
*/
import java.util.*;
class Bill
{
 double Bill,dis,TBill;
 void Bill(int qty,int rate)
 {
 	Bill=qty*rate; 
 }
}
class RegularCustomer extends Bill
{
	void Bill(int qty,int rate)
     {
 	  Bill=qty*rate; 
     }
    double Reg()
      {
	   dis=Bill*0.2;
	   TBill=Bill-dis;
	  return TBill; 
      }
  
}
class BulkPurchseCustomer extends Bill
{
	void Bill(int qty,int rate)
     {
 	  Bill=qty*rate; 
     }
    double Bulk()
      {
	  dis=Bill*0.1;
	  TBill=Bill-dis;
	  return TBill; 
      }
}

public class InheritanceOverridingBill
{
public static void main(String x[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the Qty");
 int qty=s.nextInt();
 
 System.out.println("Enter the rate");
 int rate=s.nextInt();
 
 RegularCustomer s1=new RegularCustomer();
 s1.Bill(qty,rate);
 double r1=s1.Reg();
 System.out.println("Total Bill Of regular Customer with discount"+r1);
 
 BulkPurchseCustomer s2=new BulkPurchseCustomer();
 s2.Bill(qty,rate);
 double r2=s2.Bulk();
 System.out.println("Total Bill Of regular Customer with discount"+r2);
 
 
}
}

