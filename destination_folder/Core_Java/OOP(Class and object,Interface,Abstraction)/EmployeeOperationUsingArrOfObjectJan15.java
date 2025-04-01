
import java.util.*;
class Employee
{
	int id;
	String name;
	long sal;
	
	Employee(int id,String name,long sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
public class EmployeeOperationUsingArrOfObjectJan15
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		Employee emp[]=new Employee[0];
		
		System.out.println("Case 1--->Add New Employee details");
		System.out.println("Case 2---> View all employee details");
		System.out.println("Case 3---> Sort All employee records by using its id");
		System.out.println("Case 4---> Search employee by using name");
		System.out.println("Case 5--->Do you want to stop?If yes then type 0");
		
		do{
			System.out.println("Enter choice:");
			int choice=m.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("How many employee want to enter?");
					int size=m.nextInt();
					
					emp=new Employee[size];	//array of reference
		
					for(int i=0;i<emp.length;i++)
					{
						System.out.println("Enter id,name,salary of employee:");
						int id=m.nextInt();
						m.nextLine();
						String name=m.nextLine();
						long salary=m.nextInt();
			
						emp[i]=new Employee(id,name,salary);	//array of object
					}
		
						
					break;
					
					case 2:
						System.out.println("Display employee data:");
						System.out.println("Id"+"\tName"+"\tSalary");
						for(int i=0;i<emp.length;i++)
						{
							System.out.println(emp[i].id+"\t"+emp[i].name+"\t"+emp[i].sal);
						}
						
					break;
					
					case 3:
						for(int i=0;i<emp.length;i++)
						{
							for(int j=i+1;j<emp.length;j++)
							{
								if(emp[i].id>emp[j].id)
								{
									Employee temp=emp[i];
									emp[i]=emp[j];
									emp[j]=temp;
								}
							}
						}
						
						System.out.println("Display employee data sorted by id:");
						System.out.println("Id"+"\tName"+"\tSalary");
						for(int i=0;i<emp.length;i++)
						{
							System.out.println(emp[i].id+"\t"+emp[i].name+"\t"+emp[i].sal);
						}
						
					break;
					
					case 4:
							m.nextLine();
							System.out.println("Enter employee name to be search:");
							String searchname=m.nextLine();
							
							boolean flag=false;
							
							for(int i=0;i<emp.length;i++)
							{
								if(emp[i].name.equalsIgnoreCase(searchname))
								{
									flag=true;
									break;
								}
							}
							String str=(flag)?"Name found":"Name not found";
							System.out.println(str);
					break;
					
					case 5:
						System.exit(0);
					break;
					
					default:
					
						System.out.println("Invalid choice");
			}
		}while(true);
		
		
	}
}