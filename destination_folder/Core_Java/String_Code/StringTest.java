//Q1. You have to draw the memory diagram of given code?
public class StringTest
{
   public static void main(String x[])
   {
       String s="good";
       String s1=s;
      System.out.println("Hashcode of s "+System.identityHashCode(s));
      System.out.println("Hashcode of s1 "+System.identityHashCode(s1));
   }
}
