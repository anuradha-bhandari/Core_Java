import java.util.*;

class Employee  //Create employee class for initialize the constructor
{
  int id;
  String name;
  double sal;
  
  Employee(int id,String name,double sal)
   {
	this.id=id;
    this.name=name;
    this.sal=sal;	
   } 
}
 class EmployeeApp  /// create and adjacent class here calaculte the logic
 {
	Employee []e1;  // array of refernce of Employeec class
	 double bonus,total;
      void setEmp(Employee []e1)  // set employee
	  {
		this.e1=e1;  
	  }	  
   
   void calculateBonus()// calculate the bonus
   {
	   for(int i=0;i<e1.length;i++)
	   {
	    if(e1[i].sal>=100000)
	     {
		   bonus=e1[i].sal*0.15;
	       total=e1[i].sal+bonus; 
           System.out.println(" Bonus of emlpoyee is: "+bonus+ " Employee total salary: "+total);		   
	     }
       else if(e1[i].sal>=50000 && e1[i].sal<100000)
        {
	      bonus=e1[i].sal*0.10;
	      total=e1[i].sal+bonus;  
	     System.out.println(" Bonus of emlpoyee is: "+bonus+ " Employee total salary: "+total);		   
       }
      else
       {
	    bonus=e1[i].sal*0.05; 
	    total=e1[i].sal+bonus;  
		System.out.println(" Bonus of emlpoyee is: "+bonus+ " Employee total salary: "+total);		   
       }
   }
  }
   void displayEmployeeDetails()  // display the employee details
   {
   for(int i=0;i<e1.length;i++)
   {
   
    System.out.println("Employee id: "+e1[i].id+" Employee name: "+e1[i].name +"Employee Salary: "+e1[i].sal);		
	   
   } 
   }   
}
public class EmployeeApp_12_11
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		EmployeeApp emp=new EmployeeApp();
		Employee e1[]=new Employee[2];// array of refernce
		for(int i=0;i<e1.length;i++)
		{
			System.out.println("Enter the Employee id");
			int id=s.nextInt();
			s.nextLine();
		   System.out.println("Enter the Employee name");
		   String n=s.nextLine();
		   
		   System.out.println("Enter the Employee salary");
            double sal=s.nextDouble();
			e1[i]=new Employee(id,n,sal);   ///Array of Object
		}
		emp.setEmp(e1);
	    emp.calculateBonus();
        emp.displayEmployeeDetails();	 
			
	}
}

