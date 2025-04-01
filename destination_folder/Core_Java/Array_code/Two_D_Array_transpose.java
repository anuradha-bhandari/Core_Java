import java.util.*;
public class Two_D_Array_transpose
{
public static void main(String x[])
{
  int [][]a=new int[2][2];
  int [][]b=new int[2][2];
  int i,j,k=0;
  Scanner s=new Scanner(System.in);
 System.out.println("Enter the elements in array");
  for(i=0;i<a.length;i++)
     {
       for(j=0;j<a.length;j++)
          {
           a[i][j]=s.nextInt();
          }
    }
 for(i=0;i<a.length;i++)
      {
       for(j=0;j<a.length;j++)
          {
          b[j][i]=a[i][j];   
                     
          }
    }
  System.out.println("Display transpose matrix");  
 for(i=0;i<a.length;i++)
      {
       for(j=0;j<a.length;j++)
          {
          System.out.printf("%d",b[i][j]);  
                     
          }
            System.out.println("");  

    }
}
}



