import java.util.*;
public class RecursionArray
{
 static int i=0,k=0;
 public static void main(String x[])
 {
   Scanner s=new Scanner(System.in);
    char ch[]=new char[3];
    char ch1[]=new char[3];
    char ch2[]=new char[6];
    
     for(int i=0;i<ch.length;i++)
         {
		  ch[i]=s.next().charAt(0);
		 }	    
     for(int i=0;i<ch1.length;i++)
         {
		  ch1[i]=s.next().charAt(0);
		 }
		  
		 MergeArray(ch,ch1,ch2);	
		 
		 for(int i=0;i<ch2.length;i++)
		          {
		 		  System.out.print(" "+ch2[i]);
         		  }	
 }		 
		 
     public static void MergeArray(char ch[],char ch1[],char ch2[])
          {
			if(i<ch2.length)
			    {
				 if(k<ch2.length)
				  {
				     ch2[k++]=ch[i];
				     ch2[k++]=ch1[i];
				  }
				 
				 i++;	
				 MergeArray(ch,ch1,ch2);
				}
		
			
		  }		
             
 
}