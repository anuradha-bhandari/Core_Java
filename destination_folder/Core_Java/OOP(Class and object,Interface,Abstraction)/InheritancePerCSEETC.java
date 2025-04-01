import java.util.*;
class Per
{
   int s[],per,sum=0;
	void calPer(int s[])
	{
	 this.s=s;	
	for(int i=0;i<s.length;i++)
	 {
		sum=sum+s[i]; 
	 }
	 per=sum/s.length;
	  
	}
}
class CSE extends Per
{
	String name,address,Year;
	int id,per,sum=0,s[];
 CSE(String name,int id,String address,String Year)
  {
	this.name=name;
	this.id=id;
	this.address=address;
	this.Year=Year;
  }
  void calPer(int s[])
	{
	 this.s=s;	
	 for(int i=0;i<s.length;i++)
	  {
		sum=sum+s[i]; 
	  }
	  per=sum/s.length;
	//System.out.println("Percentage of CSE"+per); 
	  
	}
 void showCsePer()
  {
  System.out.println("Name of Student: "+name+"\nId: "+id+"\nAddress: "+address+"\nYear: "+Year+"\nPercenatge: "+per); 
  } 
}
class ETC extends Per
{
   String name,address,Year;
	int id,per,sum=0,s[];
 ETC(String name,int id,String address,String Year)
  {
	this.name=name;
	this.id=id;
	this.address=address;
	this.Year=Year;
  } 
  void calPer(int s[])
	{
	 this.s=s;	
	 for(int i=0;i<s.length;i++)
	  {
		sum=sum+s[i]; 
	  }
	  per=sum/s.length;
	 // System.out.println("Percentage of ETC"+per); 

	}
 void showETCPer()
 {
	System.out.println("Name of Student: "+name+"\nId: "+id+"\nAddress: "+address+"\nYear: "+Year+"\nPercenatge: "+per); 	 
 } 
}


public class InheritancePerCSEETC
{
public static void main (String x[])
{
 Scanner s=new Scanner(System.in);
 int a[]=new int[5];
 System.out.println("Enter the Marks of subject");
  for(int i=0;i<a.length;i++)
  {
	a[i]=s.nextInt();  
  }	  

 CSE c=new CSE("Anu",1,"Pune","BE");
 c.calPer(a); 
 c.showCsePer();
 ETC e=new ETC("saki",3,"busstand","BE");
 e.calPer(a);
 e.showETCPer();
}
}