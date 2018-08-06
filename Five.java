import java.io.*;
import java.util.*;
class Five
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b && a>c)
{
System.out.println("the largest number is:"+a);
}
else if(b>c)
{
System.out.println("the largest number is:"+b);
}
else
{
System.out.println("the largest number is:"+c);
}
}
}
