/*Q5. Create an interface Role with a method performDuty(). Implement this interface in Manager and Developer classes.*/

interface Role
{
  void performDuty();	
}

class Manager implements Role
{
	public void performDuty()
	{
		System.out.println("Manager should work honestly");
	}
}

class Developer implements Role
{
	public void performDuty()
	{
	System.out.println("Developer  should work honestly");	
	}
}
public class InterfaceRoleApp
{
  public static void main(String x[])
  {
    Role r;
	r=new Manager();
	r.performDuty();
	
	r=new Developer();
	r.performDuty();
  }
}