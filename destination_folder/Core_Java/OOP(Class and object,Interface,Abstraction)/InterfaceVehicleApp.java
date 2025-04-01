/*Q3. Define an interface Vehicle with methods startEngine() and stopEngine(). Implement this interface in Car and Bike classes.*/

interface Vehicle
{
	void startEngine();
	void stopEngine();
}

class Car implements Vehicle
{
  public void startEngine()
	{
	 System.out.println("Car Engine get Start");
	}
	
   public void stopEngine()
	{
	  System.out.println("Car Engine get End");
	}
}

class Bike implements Vehicle
{
	public void startEngine()
	{
	 System.out.println("Bike Engine get Start");
	}
	
   public void stopEngine()
	{
	System.out.println("Bike Engine get End");
	}
}

public class InterfaceVehicleApp
{
  public static void main(String x[])
  {
	  Vehicle v;
	  v=new Car();
	  v.startEngine();
	  v.stopEngine();
	  v=new Bike();
	  v.startEngine();
	  v.stopEngine();


    
  }
}
