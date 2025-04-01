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
 
 public class EmployeeDeleteData
 {
  public static void main(String x[])
   {
    Scanner s=new Scanner(System.in);
	Employee []e1=new Employee[5]; //array of reference
 for(int i=0;i<e1.length;i++)
{
	e1[i]=new Employee();
	   
	System.out.println("Enter Employee id");
	int id=s.nextInt();
	s.nextLine();
	
	System.out.println("Enter Employee Name");
	String name=s.nextLine();
	
	System.out.println("Enter Employee salary");
	int sal=s.nextInt();
	
	e1[i].setId(id);
	e1[i].setName(name);
	e1[i].setSal(sal);
}

System.out.println("Enter the employee deleting id");
 int Delete=s.nextInt();
  
  for(int i=0;i<e1.length;i++)
     {
	   if(Delete==e1[i].getId())
	     {
		   for(int j=i;j<e1.length-1;j++)
		      {
			   e1[j]=e1[j+1];
			  }
		 }
	 }
	 
	   System.out.println("After sorting according to the Employee Salary"); 
      System.out.println("Name"+"\t"+"Id"+"\t"+"Salary"); 
      for(int i=0;i<e1.length-1;i++)
      {
        System.out.println(e1[i].getName()+"\t"+e1[i].getId()+"\t"+e1[i].getSal()); 
       }		  
   
	    
   }
 }
 