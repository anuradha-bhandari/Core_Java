import java.util.*;
class Employee
{
 int id,presentday,perdaysal,sal;
 char name[];
 int contact[];
  Employee(int id,int presentday,int perdaysal,char name[],int contact[])
           {
		    this.id=id;
		    this.presentday=presentday;
		    this.perdaysal=perdaysal;
		    this.name=name;
		    this.contact=contact;
     	   }
  void CalSal()
        {
		 sal=presentday*perdaysal; 
		 System.out.println("Salary is"+sal);
		} 

  void showDetails()
       {
	    System.out.println("Employee id is"+id);
	    System.out.println("Employee Present salary is"+presentday);
        System.out.println("Employee per day salary is"+perdaysal);
       	System.out.println("Employee total salary of present day is"+sal);
        
       	System.out.println("Employee name");
		for(int i=0;i<name.length;i++)
		   {
            System.out.printf("%c",name[i]);
		   }
		
       	System.out.println("Employee Contact");
        for(int i=0;i<contact.length;i++)
		   {
            System.out.printf("%d",contact[i]);
		   }

	   }  
}

public class ConstructEmployeeApp
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the id");
int id=s.nextInt();

System.out.println("Enter the presentday");
int p=s.nextInt();

System.out.println("Enter the perday salary");
int perdaysal=s.nextInt();

char n[]=new char[3];
int c[]=new int[10];
System.out.println("Enter the name");
for(int i=0;i<n.length;i++)
   {
    n[i]=s.next().charAt(0);	
   }
   
System.out.println("Enter the contact");
for(int i=0;i<c.length;i++)
   {
    c[i]=s.nextInt();	
   } 
Employee e1=new Employee(id,p,perdaysal,n,c);
e1.CalSal();
e1.showDetails();
   
}
}
