/*Q1. Statement: Employee Management System 
Objective: Develop a system to manage employees and calculate their salaries. 
Abstract Class Definition: 
o Create an abstract class named Employee with the following abstract 

methods: 
▪ calculateSalary(): This method should return the salary of the 
employee as a double. 
▪ displayInfo(): This method should print the details of the employee. 
Subclasses Implementation: 
o Implement two subclasses of Employee: 
▪ FullTimeEmployee 
▪ Add a constructor that takes the employee's name and 
monthly salary as parameters. 
▪ Implement the calculateSalary() method to return the 
monthly salary. 
▪ Implement the displayInfo() method to display the 
employee's name and monthly salary. 
▪ PartTimeEmployee 
▪ Add a constructor that takes the employee's name and hourly 
wage along with the number of hours worked per week as 
parameters. 
▪ Implement the calculateSalary() method to return the weekly 
salary (hourly wage multiplied by hours worked). 
▪ Implement the displayInfo() method to display the 
employee's name, hourly wage, and weekly salary. 
Array of Employees: 
o Create an array of Employee objects that includes at least one 
FullTimeEmployee and one PartTimeEmployee. 
o Loop through the array to: 
▪ Call the displayInfo() method on each employee. 
▪ Call the calculateSalary() method and display the salary. 
Example Output: 
Full-Time Employee: John Doe 
Monthly Salary: $3000.00 
Part-Time Employee: Jane Smith 
Hourly Wage: $20.00 
Weekly Salary: $200.00 
Requirements: 
• Ensure proper use of inheritance and abstraction in your implementation. 
• Use appropriate access modifiers (public, protected, etc.) where necessary. 
• The program should be designed to easily add more employee types in the future.*/
import java.util.*;
abstract class Employee
{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class FullTimeEmployee extends Employee
{
	String name;
	double MonSal;
	FullTimeEmployee(String name,double MonSal)
	{
	  this.name=name;
      this.MonSal=MonSal;	  
	}
    void calculateSalary()
	 {
		 
     }		 
	 
	void displayInfo()
	{
		System.out.println("Full-Time Employee: "+name+" \nMonthly Salary: "+MonSal);
	}
 	
}

class PartTimeEmployee extends Employee
{
	String name;
	double WSal,hrsWk,Wg;
    PartTimeEmployee(String name,double hrsWk,double Wg)
	{
	  this.name=name;
      this.hrsWk=hrsWk;	  
      this.Wg=Wg;	  
	}
	void calculateSalary()
	 {
		WSal=hrsWk*Wg; 
     }		 
	 
	void displayInfo()
	{
		System.out.println("Part-Time Employee: "+name +"\nHourly Wage: "+Wg+"\n Weekly Salary: "+WSal);
	}
}
public class EmployeeManagementSystem_29_10
{
  public static void main(String x[])
  {
    Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee Name ");
	String n=s.nextLine();
	  
	System.out.println("Enter Employee Monthly salary ");
	double sal=s.nextDouble(); 
	
    Employee e1=new FullTimeEmployee(n,sal);
    e1.calculateSalary();
	e1.displayInfo();
	s.nextLine();
    System.out.println("Enter Employee Name ");
	String nm=s.nextLine();
	  
	System.out.println("Enter Employee  Hours work");
	double hr=s.nextDouble(); 	
	
	System.out.println("Enter Employee  Hourly Wage");
	double wg=s.nextDouble(); 	
	e1=new PartTimeEmployee(nm,hr,wg);
	e1.calculateSalary();
	e1.displayInfo();
  }
} 