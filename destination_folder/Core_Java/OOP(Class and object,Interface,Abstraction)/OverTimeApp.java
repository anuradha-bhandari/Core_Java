/*Q2. Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate 
is Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
Note- for a week only 40 hours of working are allowed.
1. Create class Employee with data member ID, Name, total working, salary, overtime
 Set Information by using a parameterized constructor and create a display 
Information() method to display all information with salary.
2. Create another class name as OverTime with method setEmployee(Employee emp[]) 
and void calculateOvertime() to calculate overtime.*/
import java.util.*;
class Employee
{ int id,tW,sal,oT;
  String name;
	Employee(int id,int tW,int sal,int oT,String name)
	{
		this.id=id;
		this.tW=tW;
		this.sal=sal;
		this.oT=oT;
		this.name=name;
	}
  
    void displayInformation()
   {
	  System.out.println("id: "+id+" Total Working: "+" Salary: "+sal+" Over Time: "+oT+" name: "+name); 
   }   
	
}

class OverTime
{
   Employee emp[];
  void setEmployee(Employee emp[])
	{
	  this.emp=emp;
	}	
  void calculateOvertime()
   {
	  for(int i=0;i<emp.length;i++)
	  { 
	    if(emp[i].oT>0)
	     {
		   int total_sal=emp[i].sal+emp[i].oT*50;
		    emp[i].sal=total_sal; 
	     }
	  }	 
	  for(int i=0;i<emp.length;i++)
	  { 
	   System.out.println(emp[i].id+"\t"+emp[i].tW+"\t"+emp[i].sal+"\t"+emp[i].oT+" \t"+emp[i].name); 
	  }	 
   }
    
	
}
public class OverTimeApp
{
	public static void main(String x[])
	{
	  Scanner s=new Scanner(System.in);	
	  OverTime o1=new OverTime();
	  Employee e1[]=new Employee[2]; //array of reference
	  
	  for(int i=0;i<e1.length;i++)
	  {
		System.out.println("Enter the Employee Id");
        int id=s.nextInt();
		
		System.out.println("Enter the Employee total working day");
        int tw=s.nextInt();	
		
		System.out.println("Enter the Employee salary ");
        int sal=s.nextInt();	
		
		System.out.println("Enter the Employee overtime");
        int ot=s.nextInt();	
		s.nextLine();
		System.out.println("Enter the Employee Name");
        String n=s.nextLine();	
		 		
		e1[i]=new Employee(id,tw,sal,ot,n);  //array of object  
	    e1[i].displayInformation();
		
		
	  }
	  o1.setEmployee(e1);
	  o1.calculateOvertime();
	}
}