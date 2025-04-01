import java.util.*;
public class RecursioncheckArmStrong
{
static int temp=0,rem,p=1,c,sum=0,i;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
 
Arm(no);
   if(no==sum)
      {
        System.out.println("Number is An armstrong number");
      }
  else
     {
      System.out.println("Number is not armstrong number");
     }
System.out.println(sum);


}
public static void Arm(int no)
  {   
   no=temp;
      c=0; 
while(no>0)
         {            
              no=no/10;
               c++;    
         }
 System.out.println(c); 
        

    
    if(no>0)
        {
          rem=no%10;
          no=no/10;
              p=1;
               for(i=1;i<=c;i++)
                  {
                   p=p*rem;               
                   
                  } 
         no=temp;
        sum=sum+p;         
         Arm(no); 
          
        }

}



