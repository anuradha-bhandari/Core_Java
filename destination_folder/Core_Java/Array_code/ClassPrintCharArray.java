class CharArray
{
char ch[];
void setArray(char a[])
{
ch=a;
}
void showArray()
{
  for(int i=0;i<ch.length;i++)
    {
	  System.out.println(ch[i]); 
    }
}
}
public class ClassPrintCharArray
{
public static void main(String x[])
{
char m[]=new char[]{'a','b','c','e','f'};

CharArray s=new CharArray();
s.setArray(m);
s.showArray();
}
}
 