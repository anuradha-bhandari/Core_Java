/*15) WAP to create the class name as Employee with a following setter and getter method and create the array of objects with a 5 elements or values and store data in it and show it.
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
 public class EmployeeArrApp_20_oct
 {
   public static void main(String x[])
   {
     Scanner s=new Scanner(System.in);
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
	 
	 System.out.println("Name\t"+"id\t"+"sal");
	 for(int i=0;i<p.length;i++)
	 {
	    System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getSal());
		
	 }
	 
   }
 }

