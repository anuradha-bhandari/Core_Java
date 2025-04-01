/*13).WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int x[][]) and    showMatrix() sample code given below 
class PrintMatrix
{  int a[][];
    void acceptTwoDArray(int x[ ][ ])
    { //here we store the two dimensional array in instance variable declared as two d in class e.g a
      a=x;
    }
  void showMatrix()
   { //here we can display the matrix logics
   }
}
public class PrintMatrixApp
{
    public static void main(String x[])
    { //here we need to declare the two dimensional array with a 3 x 3 and store all values in it using a Scanner class
      //create the object of PrintMatrix class and call the acceptTwoDArray() function and pass two d matrix in it
     //call the showMatrix() function for display the matrix.}
}
*/
import java.util.*;
class PrintMatrix
{  int a[][];
   void acceptTwoDArray(int x[][])
    { 
      a=x;
    }
   void showMatrix()
   { 
     for(int i=0;i<a.length;i++)
	 {
		for(int j=0;j<a.length;j++)
        {
		  System.out.print(" "+a[i][j]);
		}
      System.out.println();		
	 }
   }
}
public class PrintMatrixApp_20_oct
{
    public static void main(String x[])
    { 
	 Scanner s=new Scanner(System.in); 
	 PrintMatrix p1=new PrintMatrix();
	 int a[][]=new int[3][3];
	 System.out.println("Enter the Elements in 2d array");
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a.length;j++)
		 {
		  a[i][j]=s.nextInt(); 
		 }
	 }
	 
	 p1.acceptTwoDArray(a);
	 p1.showMatrix();
	}
}
