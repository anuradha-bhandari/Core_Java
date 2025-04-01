import java.util.*;
class Employee
{
	private long id,contact,sal;
    private String name,email,address;

    void setId(long id)
	{
		this.id=id;
	}
	
	long getId()
	{
		return id;
	} 
	
	void setContact(long contact)
	{
		this.contact=contact;
	}
	
	long getContact()
	{
		return contact;
	}
	
	void setSal(long sal)
	{
		this.sal=sal;
	}
	
	long getSal()
	{
		return sal;
	}
	
	void setName(String name)
	{
	  this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setEmail(String email)
	{
	  this.email=email;
	}
	
	String getEmail()
	{
		return email;
	}
	
	void setAddress(String address)
	{
	  this.address=address;
	}
	
	String getAddress()
	{
		return address;
	}
	
	
}

class Company
{
  Employee emp[];
  int sid;
  boolean flag=false;
  Company(Employee emp[])
  {
	this.emp=emp;  
  } 
  
  void showEmployeeDetails()
  {
	  for(int i=0;i<emp.length;i++)
	  {
	   System.out.println("Id is: "+emp[i].getId()+" Name: "+emp[i].getName()+" Email: "+emp[i].getEmail()+" Contact: "+emp[i].getContact()+" Address: "+emp[i].getAddress()+" Salary: "+emp[i].getSal()); 
      }	   
  }
  
  void searchEmployee(int sid)
  {
	  this.sid=sid;
	  System.out.println("Founded");
	  for(int i=0;i<emp.length;i++)
	  {
		if(emp[i].getId()==sid)
		{
		    flag=true;
			sid=i;
			break;
			
			/*System.out.println("Id is: "+emp[i].getId()+" Name: "+emp[i].getName()+" Email: "+emp[i].getEmail()+" Contact: "+emp[i].getContact()+" Address: "+emp[i].getAddress()+"Salary: "+emp[i].getSal()); 
			//break;*/
		}	
      else
	  {
		  flag=false;
	  }
   	  
	  }
	  
	  if(flag)
	  {
		 for(int i=sid;i<emp.length-1;i++)
		 {
			emp[i]=emp[i+1]; 
		 }			 
	  }
	  else
	  {
		System.out.println("Id is not found");  
	  }
	  System.out.println("After deleting");
	 for(int i=0;i<emp.length-1;i++)
	  {
	   System.out.println("Id is: "+emp[i].getId()+" Name: "+emp[i].getName()+" Email: "+emp[i].getEmail()+" Contact: "+emp[i].getContact()+" Address: "+emp[i].getAddress()+" Salary: "+emp[i].getSal()); 
      }	   
  }
  
 // void delete
  
  
}
public class Pojo_17_Oct
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Employee e1[]=new Employee[3];  //Array of refernce
		 for(int i=0;i<e1.length;i++)
		 {
			 e1[i]=new Employee(); //Array of Object
			 
			 System.out.println("Enter the Id of employee");
			 long id=s.nextLong();
			 
			 s.nextLine();
			 
			 System.out.println("Enter the Name of employee");
			 String n=s.nextLine();
			  
			 System.out.println("Enter the Email");
			 String email=s.nextLine();
			 
			 System.out.println("Enter the Contact of employee");
			 long con=s.nextLong();
			 	s.nextLine();
			 
			 System.out.println("Enter the Address of employee");
			 String ad=s.nextLine();
			 
			 
			 System.out.println("Enter the Salaray of employee");
			 long sal=s.nextLong();
			  
			 e1[i].setId(id);
			 e1[i].setName(n);
			 e1[i].setEmail(email);
			 e1[i].setContact(con);
			 e1[i].setAddress(ad);
			 e1[i].setSal(sal);
			 
		 }
		 System.out.println("enter the delete  id");
		 int sid=s.nextInt();
		 Company c=new Company(e1);
		 c.showEmployeeDetails();
		 c.searchEmployee(sid);
	}
}