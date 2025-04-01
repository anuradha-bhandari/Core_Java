
import java.util.*; 
public class Arrayprime
{
public static void main(String x[])
{
int a[]=new int[7];
int i,j;
boolean flag=false;
Scanner s=new Scanner(System.in);
System.out.println("Enter the elements in array");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<a.length;i++)
{
	flag=false;
   for(j=2;j<a[i];j++)
{   
    if(a[i]%j==0)
   {
	   flag=true;   
   } 
}
}
for(i=0;i<a.length;i++){
if(a[i]>1&&!flag){
	System.out.println(a[i]);
}
}


}
}