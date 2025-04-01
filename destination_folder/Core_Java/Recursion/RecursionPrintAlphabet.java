public class RecursionPrintAlphabet
{

public static void main(String x[])
{
 int i='A';
 Alphabet(i);
}

public static void Alphabet(int i)
{
 if(i<='Z')
{
 System.out.printf("%c\n",i);
i++;
 Alphabet(i);
}
return;
}


}
