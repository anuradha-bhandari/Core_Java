/*Q2. Transportation System with Abstract Class and Interface
 
Objective: Implement an interface and an abstract class to create a transportation system 
that allows different types of vehicles to move and stop.
 
Requirements: 

Define an Interface: 
Create an interface named Transport with the following methods: 
void move(); - for moving the transport. 
void stop(); - for stopping the transport. 

Define an Abstract Class: 
Create an abstract class named Vehicle that: 
Implements the Transport interface. 
Leaves the move() method abstract, requiring subclasses to provide their own 
implementation. 
Provides a concrete implementation of the stop() method that displays a message 
indicating the vehicle has stopped.
 
Implementing Classes: 

Create a class named Car that: 
Extends the Vehicle class. 
Implements the move() method to display a message like: "The car is moving." 

Create a class named Bus that: 
Extends the Vehicle class. 
Implements the move() method to display a message like: "The bus is moving."
 
Demonstration: 
In the main method of a separate class, create an array of Transport objects. 
Create instances of Car and Bus, and add them to the array. 
Call the move() and stop() methods for each object in the array to demonstrate the 
functionality of moving and stopping different transport types. 

Expected Output: 
The program should display messages indicating the movement and stopping of both the 
car and the bus when executed. For example: 
The car is moving. 
The bus is moving. 
The car has stopped. 
The bus has stopped.*/ 

interface Transport 
{
	void move(); //interface method
	void stop();//interface method
}

abstract class Vehicle implements Transport
{
	abstract public void move();// //abstract method i,e.no need to performs operation
	public void stop() 
	{
	 System.out.println("vehicle has stopped");
	}
}

 class Car extends Vehicle
 {
	public void move()
    {
	  System.out.println("The car is moving");	
	}	
 }
 
 class Bus extends Vehicle
 {
	public void move()
    {
	  System.out.println("The bus is moving");	
	}	 
 }

public class Interface_Jan_26
{
  public static void main(String x[])
  { 
     
	Transport t1[]=new Transport[2];// array of Transport objects.
	
	t1[0]=new Car();//  instances of class and store into it
	//t1.move();
	//t1.stop();
	
    t1[1]=new Bus();
    //t1.move();
	//t1.stop();	
	  for(int i=0;i<t1.length;i++)
	  {
		  t1[i].move();
		  t1[i].stop();
	  }
  }
}

