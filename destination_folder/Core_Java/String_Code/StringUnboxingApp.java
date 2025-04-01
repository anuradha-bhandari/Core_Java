/*Q1. Demonstrate manual boxing and unboxing for all primitive types in Java. 
	Write methods for each type, such as converting a double into a Double.

Example:

    Double dObj = Double.valueOf(12.5);
    double d = dObj.doubleValue(); // double to object
	*/
	
//import java.util.*;
public class StringUnboxingApp
 {
	 public static void main(String x[])
	 {
	   int a=10;
	   Integer b=a; // auto boxing , converts primitive to referencial
	   System.out.println("A: "+a +"\tB: "+b);
	   
	   Integer c=30;
	   int d=c; // auto-unboxing,coverts referencial to primitive
	   System.out.println("C: "+c +"\tD: "+d);

	   int m=100;
	   Double dobj=Double.valueOf(100);// auto-boxing
	   System.out.println("int(primitive) to Double(referencial)conversion (auto-boxing)M: "+dobj);
	   
	   //Integer dob=105; 
	   Double dob=105.0;
	   double d1=dob.doubleValue();       // auto-unboxing
	   System.out.println("Double (refernce)  to double (primitive)coversion (auto-Unboxing)d1: "+d1);
	   
	   String s=String.valueOf(dob); // Double reference to String reference
	   String s1=String.valueOf(m); //primitive int to string reference
	   System.out.println("string s: "+s+"\tstring s1:"+s1);
	   
	    Float fobj=Float.valueOf(20.3f); // auto-boxing
	    float f=fobj.floatValue(); //auto-unboxing
		System.out.println("float object is: "+fobj+" primitive f: "+f);
	   
	 }
 }