//Q4. Fetch file whose extension is .doc or .txt
import java.io.*;

public class Filehandling_23JanQue4
{
 public static void main(String x[])
 {
	 File f=new File("C:\\FileHandling\\");
	 File list[]=f.listFiles();
	 
	 for(int i=0;i<list.length;i++)
	 {
		if(list[i].isFile()&&list[i].getName().endsWith(".txt"))
		 {
			System.out.println(list[i]);
		 }			
	 }
 }
}

