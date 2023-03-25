import java.util.Scanner;
class a
{
public int add(int a,int b)
{
int c=a+b;
return c;
}
public void sub(int a,int b)
{
System.out.println(a-b);
}
public void mat()
{
int a=5;
int b=5;
System.out.println(a+b);
}
public void pri(int a)
{
if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}
public int p(int a)
{
if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}
public static void main(String args[])
{
a rc=new a();
int n=rc.add(10,5);
System.out.println(n);
Scanner sc=new Scanner(System.in);
System.out.println("enter a b");
int a=sc.nextInt();
int b=sc.nextInt();
rc.sub(a,b);
rc.mat();
int c=sc.nextInt();
int d=sc.nextInt();
rc.sub(c,d);
rc.pri(3);
rc.p(4);
}}