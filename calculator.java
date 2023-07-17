import java.io.*;
import java.util.*;
public class Operations
{
    int add(int a,int b)
    {
        return (a+b);
    }
    int sub(int a,int b)
    {
        return (a-b);
    }
    int mul(int a,int b)
    {
        return (a*b);
    }
    int div(int a, int b)
    {
        return (a/b);
    }
}
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Operations o=new Operations();
        System.out.println(o.add(a,b));
        System.out.println(o.sub(a,b));
        System.out.println(o.mul(a,b));
        System.out.println(o.div(a,b));
    }
}
