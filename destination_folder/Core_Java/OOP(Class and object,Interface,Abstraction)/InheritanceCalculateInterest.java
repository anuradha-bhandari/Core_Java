import java.util.*;
class Interest
{
	int p,rate,dur;
  void setPRD(int p,int rate,int dur)
  {
	this.p=p;
    this.rate=rate;
    this.dur=dur;	
  }  
  
}
class CalculateInterest extends Interest
{
   int p,rate,dur,si;
  void setPRD(int p,int rate,int dur)
  {
	this.p=p;
    this.rate=rate;
    this.dur=dur;	
  }  
	void calInterest()
	{
	  si=(p+rate+dur)/100;
     System.out.println("Simple interest"+si);	  
	}
}
public class InheritanceCalculateInterest
{
  public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
    int p,r,t;
	System.out.println("Enter the Principle amount");
	p=s.nextInt();
	System.out.println("Enter the rate");
	r=s.nextInt();
	System.out.println("Enter the time");
	t=s.nextInt();
	
	CalculateInterest c=new CalculateInterest(); 
	c.setPRD(p,r,t);
	c.calInterest();
  }
}