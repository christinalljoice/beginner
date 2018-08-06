import java.io.*;
import java.util.*;
class Three
{
public static void main(String args[])
{
System.out.println("Enter a character");
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
if(a=='a'||'e'||'i'||'o'||'u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
