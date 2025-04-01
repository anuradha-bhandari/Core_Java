import java.util.*;
interface Employee
{
 void performTask();
 void calculateSalary();
}

class Manager implements Employee
{
  String name;
  double baseSalary;
  int teamSize;
  Manager(String name,double baseSalary,int teamSize)
	{
	  this.name=name;
	  this.baseSalary=baseSalary;
	  this.teamSize=teamSize;
	}
 public void performTask()
  {
    System.out.println("Manager is the managing the team"); 
  }
 public void calculateSalary()
  {
	System.out.println("Salary=" +(baseSalary+(teamSize*1000)));
  }
}


class Developer implements Employee
{
  String name;
  double baseSalary;
  int completedTasks;
  Developer(String name,double baseSalary,int completedTasks)
	{
	  this.name=name;
	  this.baseSalary=baseSalary;
	  this.completedTasks=completedTasks;
	}
 public void performTask()
  {
    System.out.println("Developer is coding"); 
  }
  public void calculateSalary()
  {
	System.out.println("Salary="+(baseSalary+(completedTasks*200)));
  }
}

public class InterfaceApp
{
  public static void main(String x[])
  {
    Scanner s=new Scanner(System.in);
    Employee e;
    e=new Manager("anu",1233,4);
	e.performTask();
	e.calculateSalary();
	
	e=new Developer("sneha",2356,4);
	e.performTask();
	e.calculateSalary();  
  }
}