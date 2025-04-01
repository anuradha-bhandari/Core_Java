//import java.util.*;
public class RecursionAsciiWithValue
{
// static int ch=1;

public static void main(String x[])
{
 int ch=0;
 System.out.printf("Display Ascii with value\n");
 Ascii(ch);

}

public static void Ascii(int ch)
{
  if(ch<255)
       {
         System.out.printf("%d---->%c\n",ch,ch);
          ch++;
         Ascii(ch);
        }
 
}
} 