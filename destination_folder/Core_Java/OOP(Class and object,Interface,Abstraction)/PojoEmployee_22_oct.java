/*2) Write a Java program to creating a Plain Old Java Object (POJO) class 
named Employee to represent an employee in a company. 
The class should encapsulate the following attributes and operations:

Attributes:
name (String): The name of the employee.
jobTitle (String): The job title of the employee.
salary (double): The salary of the employee.
Methods:
	1 Constructor: A constructor that initializes the employee's attributes (name, job title, and salary).
	2 Getters: Getter methods for each attribute to retrieve their values.
	3 updateSalary(double newSalary): A method that updates the employee's salary to a new value.
	4 applyRaise(double percentage): A method that calculates and applies a percentage 
	  raise to the current salary.
	5 hasHigherSalary(Employee other): A method that compares the salary of the 
	  current employee with another employee and returns true if the current 
      employee has a higher salary.
	6 isEligibleForBonus(): A method that checks if the employee is eligible for 
      a bonus based on their salary (e.g., salary greater than $50,000).
    7 getFormattedSalary(): A method that returns the salary as a formatted string (e.g., "$75,000.00").
    8 displayInfo(): A method that prints the employee's information, including name, job title, and formatted salary.
	
*/
import java.util.*;
class Employee
{
	String name,jobTitle;
	double sal,n;
	Employee(String name,String jobTitle,double sal)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.sal=sal;
	}
}

class Company
{
	Employee e1[];
	double newsal;
	String n;
	void setEmployee(Employee e1[])
	{
	  this.e1=e1;	
	}
	 void getter()
	 {
		 for(int i=0;i<e1.length;i++)
		 {
		  System.out.println("Name: "+e1[i].name+" JobTitle: "+e1[i].jobTitle+" Salary: "+e1[i].sal);
		 }  
	 }
	
  void updateSalary(double newsal,String n)
  {
	this.newsal=newsal;
	this.n=n;
   	 for(int i=0;i<e1.length;i++)
		 {
		  if(n.equals(e1[i].name))
		  {
			 e1[i].sal=newsal; 
		  }
		 } 
  }  
  
 
}

public class PojoEmployee_22_oct
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Company c1=new Company();
		Employee e1[]=new Employee[3];  // array of reference
		for(int i=0;i<e1.length;i++)
		{
		  System.out.println("Enter the name");
		  String n=s.nextLine();
		  
		  System.out.println("Enter the Jobtitle");
		  String jt=s.nextLine();
		  
		  System.out.println("Enter the salary");
		  double sal=s.nextDouble();
		  s.nextLine();
		  
		   e1[i]=new Employee(n,jt,sal);
		}
		c1.setEmployee(e1);
		c1.getter();
		
		
		System.out.println("Enter the Name of employee which u want to update");
		String name=s.nextLine();
		
		System.out.println("Enter the Newsalary");
		double newsal=s.nextDouble();
		c1.updateSalary(newsal,name);
		c1.getter();
	}
}