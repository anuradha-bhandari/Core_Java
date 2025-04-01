//Q2. Create File using File class?
import java.io.*;

public class Filehandling_23JanQue2
{
 public static void main(String x[]) throws Exception
 {
   File f=new File("C:\\FileHandling\\new_file.txt");
   
   if(f.exists())
   {
	   System.out.println("File is already exists");
   }
   else
   {  
    boolean b=f.createNewFile();// to create the file
    if(b)
    {
	 System.out.println("File created successfully");   
    }
    else
    {
	   System.out.println("some problr is there");
    }
   }
 }
}
