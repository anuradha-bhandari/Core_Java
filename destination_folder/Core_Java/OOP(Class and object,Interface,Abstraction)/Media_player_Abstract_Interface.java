/*Q1. Media Player System with Abstract Class and Interfaces 
Objective: Implement an abstract class and interfaces to demonstrate a media player 
system capable of playing and stopping different types of media. 
Requirements: 
Define an Abstract Class: 
Create an abstract class named Media with an abstract method play(). 
Include a method stop() in the Media class that provides a default implementation for 
stopping media playback. 
Define Interfaces: 
Create an interface named Playable with a method play(). 
Create an interface named Stoppable with a method stop(). 
Implementing Classes: 
Create a class named Song that: 
Extends the Media class. 
Implements the Playable and Stoppable interfaces. 
Provides its own implementation of the play() method to display a message like: "Playing 
song: [song name]". 
Implements the stop() method to display a message like: "Stopping song: [song name]". 
Create a class named Video that: 
Extends the Media class. 
Implements the Playable and Stoppable interfaces. 
Provides its own implementation of the play() method to display a message like: "Playing 
video: [video title]". 
Implements the stop() method to display a message like: "Stopping video: [video title]". 
Demonstration: 
In the main method of a separate class, create an array of Media objects. 
Create instances of Song and Video, and add them to the array. 
Call play() and stop() methods for each object in the array to demonstrate the functionality 
of playing and stopping different media types. 
Expected Output: 
The program should display messages indicating the playback and stopping of both songs 
and videos when executed. For example: 
Playing song: Imagine song playing(give appropriate message) 
Stopping song: Imagine song stoped(give appropriate message) 
Playing video: Inception(give appropriate message) 
Stopping video: Inception(give appropriate message) 
Constraints: 
Ensure proper encapsulation by managing the fields required for song and video titles. 
Follow good coding practices, including meaningful variable names and comments. 
Ensure that the stop() method in the Media class can be overridden by subclasses if 
needed.*/

abstract class Media
{
 abstract void play(String name);
 abstract void stop(String name);
}

interface Playable 
{
  void play(String name);
}
interface Stoppable
{
  void stop(String name);
}
 
 class Song extends Media implements Playable,Stoppable
 {
    
	 public void play(String name)
	  {
	    System.out.println("Playing song: "+name);
	  }
	
	
       public void stop(String name)
		{
		 System.out.println("Stopping song: "+name);
		}
	
  }	
 class Video extends Media implements Playable,Stoppable
  {
    
	 public void play(String name)
	  {
	   System.out.println("Playing video: "+name);
	  }
	
	
	
	    public void stop(String name)
		{
		 System.out.println("Stopping video: "+name);
		}
	
  }
  
  public class Media_player_Abstract_Interface
  {
   public static void main(String x[])
   {
	 Media m[]=new Media[2];//Array of abstract class Media 
     m[0]=new Song(); //instance of song 
	 m[0].play("play song");
	 m[0].stop("stop song");
	 
	 m[1]=new Video(); // instance of video
	 m[1].play("play video");
	 m[1].stop("stop video");
   }
  }   
   
    