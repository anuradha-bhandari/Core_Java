//Q3. Fetch folder whose name start with m from particular path


import java.io.*;

public class Filehandling_23JanQue3
{
 public static void main(String x[])
 {
   File f=new File("C:\\"); // files in c drive
   File list[]=f.listFiles(); // list in given path
   
  for(int i=0;i<list.length;i++) //list[i].isDirectory() this method access the folder in drive
   {
	 if(list[i].isDirectory()&&list[i].getName().startsWith("F")) 
	 {
		System.out.println(list[i]); 
	 } 		 
   }
 }
}