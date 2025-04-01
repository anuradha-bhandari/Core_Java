/*Q2. Notification System with Notifiable Interface 
Objective: Implement an interface and two classes to demonstrate a notification system 
that can send different types of notifications. 
Requirements: 
Define an Interface: 
Create an interface named Notifiable with a method sendNotification(). 
Implementing Classes: 
Create a class named EmailNotification that: 
Implements the Notifiable interface. 
Contains a private field to store the notification message. 
Implements the setMessage(String message) method to set the content of the email 
notification. 
Implements the sendNotification() method to display the message in the format: "Sending 
Email: [message]". 
Create a class named SMSNotification that: 
Implements the Notifiable interface. 
Contains a private field to store the notification message. 
Implements the setMessage(String message) method to set the content of the SMS 
notification. 
Implements the sendNotification() method to display the message in the format: "Sending 
SMS: [message]". 
Demonstration: 
In the main method of a separate class, create an array of Notifiable objects. 
Create instances of EmailNotification and SMSNotification, and add them to the array. 
Use the setMessage(String message) method to set different messages for each 
notification type. 
Call sendNotification() on each object in the array to demonstrate the functionality of 
sending notifications. 
Expected Output:- 
The program should display the messages for both email and SMS notifications when 
executed. For example: 
Sending Email: Welcome to our service! 
Sending SMS: Your verification code is 123456. 
Constraints:- 
Ensure proper encapsulation by keeping the message field private in both classes. 
Follow good coding practices, including meaningful variable names and comments. 
Make sure to handle potential null values for the message in the sendNotification() 
method.*/

import java.util.*;
interface Notifiable
{
   void sendNotification();	
}

class EmailNotification implements Notifiable
{
	String message;
  void setMessage(String message) 
	{
	 this.message=message;
	}
  public void sendNotification()
	{
		System.out.println("Sending Email: "+message);
	}
}

class SMSNotification  implements Notifiable
{
  String message;	
  void setMessage(String message) 
	{
	  this.message=message;	
	}
   	
  public void sendNotification()
	{
	  System.out.println("Sending SMS: "+message);	
	}
	
}


public class Interface_Notification_System_App
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Email");
		String email=s.nextLine();
		
		System.out.println("Enter the SMS");
		String sms=s.nextLine();
		
		EmailNotification e1=new EmailNotification();
		e1.setMessage(email);
		e1.sendNotification();
		
		SMSNotification s1=new SMSNotification();
		s1.setMessage(sms);
		s1.sendNotification();
		
	}
}