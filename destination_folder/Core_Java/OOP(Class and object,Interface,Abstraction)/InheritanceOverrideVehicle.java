class Vehicle
{
  protected String Vm,VReg;
  protected  int speed,cons,cap; 
	Vehicle(String Vm,String VReg,int speed,int cons,int cap)
	    {
		 this.Vm=Vm;
		 this.VReg=VReg;
		 this.speed=speed;
		 this.cons=cons;
		 this.cap=cap;
	    }
		
	void display()
	{
		
	}	
	void fuelNeeded()
	{
		
	}	
	void distanceCovered()
	{
		
	}
	  
}
class Truck extends Vehicle
{
	private int CargoW,dis,d,t,fNeed,spd;
    Truck(String Vm,String VReg,int speed,int cons,int cap,int CargoW)
	{
		super(Vm,VReg,speed,cons,cap);
		this.CargoW=CargoW;
	}
	void fuelNeeded(int dis)
	{
		this.dis=dis;
		fNeed=cons*dis;
	
	}	
	void distanceCovered(int d,int t)
	{
		this.d=d;
		this.t=t;
	    spd=d/t;	
	}
	
	void display()
	  {
		System.out.println("Vehicle model: "+Vm+ " \nRegistration number:"+VReg+" \nVehicle speed (km/hour):"+speed+"\n Fuel consumption (kilo meters/liter):"+cons +"\nFuel capacity (liters): "+cap+"\nCargo Weight:"+CargoW+"\nFuel Needed:"+fNeed+"\nDistance Cover:"+spd);
		System.out.println("______________________________________________");
	  }	

}
class Bus extends Vehicle
{
    private int dis,d,t,fNeed,spd,nPasg;
    Bus(String Vm,String VReg,int speed,int cons,int cap,int nPasg)
	{
		super(Vm,VReg,speed,cons,cap);
		this.nPasg=nPasg;
	}
	void fuelNeeded(int dis)
	{
		this.dis=dis;
		fNeed=cons*dis;
	
	}	
	void distanceCovered(int d,int t)
	{
		this.d=d;
		this.t=t;
	    spd=d/t;	
	}
	
	void display()
	  {
		System.out.println("Vehicle model: "+Vm+ " \nRegistration number:"+VReg+" \nVehicle speed (km/hour):"+speed+"\n Fuel consumption (kilo meters/liter):"+cons +"\nFuel capacity (liters) :"+cap+"\n no of passenger: "+nPasg+"\nFuel Needed:"+fNeed+"\nDistance Cover:"+spd);
	  }	 	 
}
public class InheritanceOverrideVehicle
{
  public static void main(String x[])
    {
	  Truck t=new Truck("V_Mod_123","V_Reg_89",30,20,70,5000);
      t.fuelNeeded(20);
      t.distanceCovered(10,2);	
      t.display();

     Bus b=new Bus("V_Mod_123","V_Reg_89",30,20,70,36);
      b.fuelNeeded(10);
      b.distanceCovered(8,2);	
      b.display();	  
    }
}
