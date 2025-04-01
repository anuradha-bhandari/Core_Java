/*Q1. Employee Management System 
Objective: Create a system to manage different types of employees in a company. 
Requirements: 
Define a Base Class: 
Create a class named Employee with attributes such as name, id, and salary. 
Include a method displayInfo() that prints employee details. 
Implement Subclasses: 
Create a class Manager that extends Employee and adds an attribute for department. 
Override displayInfo() to include department details. 
Create a class Intern that extends Employee and adds an attribute for duration (in 
months). 
Override displayInfo() to include duration details. 
Demonstration: 
Create an array of Employee objects. 
Initialize it with instances of Manager and Intern. 
Call displayInfo() for each employee to demonstrate functionality. 
Expected Output: 
Name: Alice, ID: 001, Salary: $70000, Department: Sales 
Name: Bob, ID: 002, Salary: $30000, Duration: 6 months */

class Employee 
{
	protected String name;
	protected int id;
	protected double sal;
	Employee(String name,int id,double sal)
	{   
	    this.name=name;
		this.sal=sal;
		this.id=id;
	}
	
	void displayInfo()
	{
	 System.out.println("Name: "+name+","+ "ID: "+id+","+" Salary: "+sal);
	}
}

class Manager extends Employee
{
	String department;
	Manager(String name,int id,double sal,String department)
	{
		super(name,id,sal);
		this.department=department;
	}
	 
	void displayInfo()
	{
		System.out.println("Name: "+name+","+ "ID: "+id+","+" Salary: "+sal+","+ "Department: "+department);
	}	
}

class Intern extends Employee
{
	int dur;
	Intern(String name,int id,double sal,int dur)
	{
		super(name,id,sal);
		this.dur=dur;	
	}
	
	void displayInfo()
	{
	System.out.println("Name: "+name+","+ "ID: "+id+","+" Salary: "+sal+","+" Duration: "+dur+" Months");	
	}	
}

public class  EmployeeManagementSystemApp
{
  public static void main(String x[])
   {
	   Employee e1[]=new Employee[2];
	   e1[0]=new Manager("Alice",001,70000,"Sales");
	   e1[0].displayInfo();
	   
	   e1[1]=new Intern("Bob",002,300000,6);
	   e1[1].displayInfo();
   }  
}