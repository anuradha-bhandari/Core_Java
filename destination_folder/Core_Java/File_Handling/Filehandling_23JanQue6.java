//Q6. Fetch files whose extension is .png or jpeg etc
import java.io.*;

public class  Filehandling_23JanQue6
{
  public static void main(String x[])
  {
     File f=new File("C:\\HTML");
	 File list[]=f.listFiles();// to access the file and folder
	 
	 for(int i=0;i<list.length;i++)
	 {
		if(list[i].isFile()&&(list[i].getName().endsWith(".jpg"))||(list[i].getName().endsWith(".jpeg")))
		{
			System.out.println(list[i]);
		}			
	 }
	 
  }
}  