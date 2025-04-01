//Q5. Fetch file whose size is more than 2kb?

import java.io.*;

public class  Filehandling_23JanQue5
{
  public static void main(String x[])
  {
     File f=new File("C:\\");
	 
	 File list[]=f.listFiles(); // to get files and folders
	 
	  
	 for(int i=0;i<list.length;i++)
	  {
		 if(list[i].isFile())
		 {
			long size=list[i].length()/1024; // to get size of file byte in kb , 
			 if(size>2)
              {
				System.out.println("Files are: "+list[i]+"\t"+size+"KB"); 
			 }
		 }
		 
		 else
		 {
			 long s=list[i].length()/1024;
			System.out.println("Folders are: "+list[i]+"\t"+s+"KB"); 
		 }
	  }		 
	 
  }
}
