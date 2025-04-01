/*Q2. Design a Java class named Employee to manage employee details and apply performance-based bonuses.
The program should include the following:
Attributes:
id (int): A unique identifier for the employee.
name (String): The name of the employee.
designation (String): The job title of the employee.
salary (double): The base salary of the employee.
Methods:
Constructor: Initialize the attributes id, name, designation, and salary.
displayDetails: Print the employee's details in a formatted manner.
applyBonus: Apply a bonus to the employee's salary based on performance rating:
'excellent': 20% bonus
'good': 10% bonus
'average': 5% bonus
If the rating is invalid, print an error message and do not apply a bonus.
Functionality:
Create an Employee instance with the specified attributes.
Use methods to display details and apply bonuses based on the provided performance rating.*/

import java.util.*;
class Employee
{
 	int id;
	String name;
	String deg,rating;
	double salary;
  Employee(int id,String name,String deg,double salary,String rating)
  {
	this.id=id;
    this.name=name;
    this.deg=deg;
    this.salary=salary; 
    this.rating=rating;	
  }
}

class EmployeeApp
{
	Employee e[];
   void setEmployee(Employee e[])
	{
	  this.e=e;	
	}
   void displayDetails()
	{
		System.out.println("Id"+"\t"+"Name"+"\t"+"Degination"+"\t"+"salary");
		for(int i=0;i<e.length;i++)
		{
		  System.out.println(e[i].id+"\t"+e[i].name+"\t"+e[i].deg+"\t"+e[i].salary);
		}
	}
   void applyBonus()
	{
	 System.out.println("Total salary with Bonus of employee salary");
	 for(int i=0;i<e.length;i++)
	 {   
		 if(e[i].rating.equalsIgnoreCase("excellent"))
		 {
		   System.out.println(e[i].salary+(e[i].salary*0.2)); 
		 }
	   else if(e[i].rating.equalsIgnoreCase("good"))
	     {
		   System.out.println(e[i].salary+(e[i].salary*0.1)); 
	     }
	   else if(e[i].rating.equalsIgnoreCase("average"))
	    {
		 System.out.println(e[i].salary+(e[i].salary*0.05));
	    }
	  else
	   {
	     System.out.println("rating is invalid ");   
	   }		  
	 }		 
	}

}
public class EmployeeManageApp
{
   public static void main(String x[])
   {
	  Scanner s=new Scanner(System.in);
	  EmployeeApp emp=new EmployeeApp();

	  Employee e[]=new Employee[2];
	  for(int i=0;i<e.length;i++)
	    {
	     System.out.println("Enter the id , name ,degination,salary");	
         int id=s.nextInt();
		  s.nextLine();
         String n=s.nextLine();	
         String d=s.nextLine();	
         double sal=s.nextDouble(); 
		 s.nextLine();
         System.out.println("enter the rating to Employee");
	     String r=s.nextLine();		 
		 e[i]=new Employee(id,n,d,sal,r);
         		 
	    }
		
		emp.setEmployee(e);
		emp.displayDetails();
		
		emp.applyBonus();
   }
}