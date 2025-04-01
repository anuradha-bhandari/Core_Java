import java.util.*;
class Employee
{
int id;
String name;
int sal;

void setId(int id)
  {
   this.id=id;
  }
int getId()
 {
  return id;
 }

void setName(String name)
 {
  this.name=name;
 } 
String getName()
 {
  return name; 
 } 
 
 void setSal(int sal)
 {
  this.sal=sal;
 }
 int getSal()
  {
   return sal;
  }
}

public class EmployeeApp
{
public static void main(String x[])
{
 Scanner s=new Scanner(System.in);
 Employee []e1=new Employee[2];  //refernce;
   for(int i=0;i<e1.length;i++)
      {
	    e1[i]=new Employee();
		
		System.out.println("Enter the  employee id");
		int id=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the  employee Name");
		String name=s.nextLine();
		
		System.out.println("Enter the  employee Salary");
		int sal=s.nextInt();
		
		e1[i].setId(id);
		e1[i].setName(name);
		e1[i].setSal(sal);
	  }
	   System.out.println("Enter the Employee data");
	  for(int i=0;i<e1.length;i++)
	     {
		 System.out.println("Id is"+e1[i].getId()+"Name is"+e1[i].getName()+"Salary is"+e1[i].getSal());
		 }
		 
	  
}
}


 