interface Payable  /// here an interface
{
  void calculateSalary(); // create an abstract method
  
	  
   
}

class FullTimeEmployee implements Payable  //subclass of inrface
{
	String name;
	double monthsal;
	FullTimeEmployee(String name,double monthsal)//intializing with contructor
	{
		this.name=name;
		this.monthsal=monthsal;
	}
	public void calculateSalary()//here calaculate the salary of Full ttime emp
	{
	 System.out.println("Full Time Employee name is: "+name+"\nmonthlye salary: "+monthsal);	
	}
}

class PartTimeEmployee implements Payable//subclass of inrface
{
	String name;
	double hourlyRate;
	int hrswk;
	
	PartTimeEmployee(String name,double hourlyRate,int hrswk)//intializing with contructor
	{
		this.name=name;
		this.hourlyRate=hourlyRate;
		this.hrswk=hrswk;
	}
	
	public void calculateSalary()// here calaculate the salary of parttime emp
	{
		double t=hrswk*hourlyRate;
		System.out.println("Part time Employee name: "+name+" \nhourly rate: "+hourlyRate+"\nworking hour: "+hrswk+"\n total salary: "+t);
	}
}
public class InterfaceApp_12_11
{
	 public static void main(String x[])
	 {
		 
		Payable f1=new FullTimeEmployee("anu",1000);//create an instances of implemneting class
		f1.calculateSalary();
		
		f1=new PartTimeEmployee("abc",50,6);
		f1.calculateSalary();//create and instances of second implementing class
	 }
}