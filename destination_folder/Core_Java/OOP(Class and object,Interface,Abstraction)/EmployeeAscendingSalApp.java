/*16) WAP to create the class name as Employee class and create the array object of Employee class of size 5 and store all data in it and arrange all employee data in ascending order salary wise.
 */
 import java.util.*;
 class Employee
 {
   private int id,sal;
   private String name;
   public void setId(int id)
	{
	 this.id=id;	
	}
	public int getId()
	{
	 return id;
	}
	public void setName(String name)
	{
	 this.name=name;	
	}
	public String getName()
	{
	 return name;
	}
	
	public void setSal(int sal)
	{
	 this.sal=sal;	
	}
	public int getSal()
	{
	 return sal;
	}
 }
 
 class Ascending
 {
	Employee p[];

    void setEmployee(Employee p[])
     {
		this.p=p; 
	 }	
 
    void ShowEmployeeDetails()
   {
	 System.out.println("Input Data");
	 System.out.println("Name\t"+"id\t"+"sal");
	 for(int i=0;i<p.length;i++)
	 {
	    System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getSal());
		
	 }
	 
	 System.out.println("Output Data sort by salary");
	 System.out.println("Name\t"+"id\t"+"sal");
	 for(int i=0;i<p.length;i++)
	 {
		for(int j=i+1;j<p.length;j++)
		{
	     if(p[i].getSal()>p[j].getSal())
		 {
            Employee temp=p[i];
			p[i]=p[j];
			p[j]=temp;
		 }
	   }
	 }
	 
	 for(int i=0;i<p.length;i++)
	 {
	    System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getSal());
		
	 }	
  }	
 }
 public class EmployeeAscendingSalApp
 {
 public static void main(String x[])
 {
	 Scanner s=new Scanner(System.in);
	 Ascending a1=new Ascending();
	 Employee p[]=new Employee[5]; //Array of Reference
	 for(int i=0;i<p.length;i++)
	 {
		p[i]=new Employee(); //Array of Object
	    System.out.println("Enter the Employee id");
	    int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Employee name");
	    String n=s.nextLine();
		System.out.println("Enter the Employee sal");
	    int sal=s.nextInt();
		p[i].setId(id);
		p[i].setName(n);
		p[i].setSal(sal);
	
	 }
	 a1.setEmployee(p);
	 a1.ShowEmployeeDetails();
	 
	 
 }
 }
