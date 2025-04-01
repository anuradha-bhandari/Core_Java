/*2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
*/

class Employee
{
	String name,department;
	double salary;
	
	Employee(String name,String department,int salary)
	{
	 	this.name=name;
		this.department=department;
		this.salary=salary;
	}
}
public class Employee_Salary_IncrementA_10_12
{
  public static void main(String x[])
  {
    Employee e1=new Employee("anu","Comp",30000);
	double sal=e1.salary*0.1+e1.salary;
	System.out.println("Updated salary: "+sal);
	
  }
}