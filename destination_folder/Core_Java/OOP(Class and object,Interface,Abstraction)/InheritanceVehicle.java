class Vehicle
{   String modl,reg;
    int fc,fcon,dis,Tfuel,fuel,t;
	
	Vehicle(String modl,String reg,int fc,int fcon)
	     {
		   this.modl=modl;
		   this.reg=reg;
		   this.fc=fc;
		   this.fcon=fcon;
	     }
	
}
class Truck extends Vehicle
{
	int Tfuel,speed,cargowght,fuel,dis;
	Truck(String modl,String reg,int fc,int fcon,int fuel,int dis,int t,int cargowght)
	{
		super(modl,reg,spd,fc,fcon);
       this.fuel=fuel;
	   this.dis=dis;
	   this.t=t;
	   this.cargowght=cargowght;
	}

	void  fuelNeeded()
	{	
	   Tfuel=dis*fuel;
	   System.out.println("Total amount of fuel required"+Tfuel);
	}
	void distanceCovered()
	{
	int spd=dis/t;
	System.out.println("Speed of vehicle"+spd);
	}
	void Display()
	{
		System.out.println("Model of Vehicle "+modl+"\nSpeed of vehicle"+spd+"\nfuel Capacity "+fc+"\nfuel Consumption "+fcon,"Total Fuel "+Tfuel+" cargowght "+cargowght);
	}
}

class Bus
{	
     int Npassenger;
     Bus(String modl,String reg,int fc,int fcon,int fuel,int dis,int t,int Npassenger)

	 {
	   super(modl,reg,spd ,fc,fcon);
	   this.Npassenger=Npassenger;
	   this.t=t;
	   
	 }	
	 void distanceCovered()
	  {
	  spd=dis/t;
	  System.out.println("Speed of vehicle"+spd);
	 }
	void Display()
	  {
		System.out.println("Model of Vehicle "+modl+"\nSpeed of vehicle"+spd+"\nfuel Capacity "+fc+"\nfuel Consumption "+fcon+"Total Fuel "+Tfuel+"Total no of passenger "+Npassenger);
	  }

}



public class InheritanceVehicle
{
 public static void main(String x[])
 {
   Vehicle v1=new Vehicle();
   Truck t1=new Truck("Honda","RCO869",60,110,20,90,2,200);
   t1.distanceCovered();
   t1.Display();
   
   Bus b1=new Bus("PMPML","KA3467",60,90,30,10,80,2); 
   b1.distanceCovered();
   b1.Display(); 
 }
}