import java.io.*;
import java.util.*;
class Four
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
char a=s.next().charAt(0);
int b=a;
if((b>=65 && b<=90) || (b>=97 && b<=122))
{
System.out.println("Alphabet");
}
else
{
System.out.println("No");
}
}
}
