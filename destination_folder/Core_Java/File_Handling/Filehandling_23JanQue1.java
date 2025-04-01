//Q1. Create folder using File class 
import  java.io.*;

public class Filehandling_23JanQue1
{
 public static void main(String x[])
 {
    File f=new File("C:\\FileHandling");
	boolean b=f.mkdir(); // to create the folder
	
	if(f.exists())
	{
		System.out.println("Folder is already exist");
	}
	else
	{
	 if(b)
	 {
		System.out.println("Folder created successfully"); 
	 }
	 else
	 {
		System.out.println("some problem is there");  
	 }
	} 
	
 }
}