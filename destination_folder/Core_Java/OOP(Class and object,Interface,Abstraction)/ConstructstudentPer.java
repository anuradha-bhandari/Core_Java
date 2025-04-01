import java.util.*;
class StudentPer
{
 int a[];
 int sum;
 String str;
 double per;
  StudentPer(int a[])
    {
	  this.a=a;
	}
  void CalPer()
    {
	 for(int i=0;i<a.length;i++)
	    {
		  sum=sum+a[i];
		}
	 	per=sum/a.length;
		System.out.println("Percentage"+per);
	}

void checkGrades()
    {
	  str=(per>=90)?"Grade A":
	 (per<90 && per>=80)?"Grade B":
	 (per<80 && per>=70)?"Grade C":
	 (per<70 && per>=60)?"Grade D":
	 (per<60 && per>=50)?"Grade E":
	(per>=40)?"Grade F":"Fail";
	 System.out.println(str);
	}	
 
}

public class ConstructstudentPer
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter the array in elemnts");
for(int i=0;i<a.length;i++)
  {
   a[i]=s.nextInt();
  }
  StudentPer st=new StudentPer(a);
  st.CalPer();
  st.checkGrades();
}
}