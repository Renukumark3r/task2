import java.util.Scanner;
import java.util.Random;
class sps
{
Scanner sc=new Scanner(System.in);
int uc,cc;
sps()
{
uc=sc.nextInt();
}
public void get()
{
Random a=new Random();
cc=a.nextInt(3);
}
public void check()
{
System.out.println("comp"+cc);
System.out.println("user"+uc);
if(cc==uc)
{
System.out.println("draw");
}
else if(cc<uc)
{
System.out.println("user win");
}
else
{
System.out.println("computer win");
}}}
class ap
{
public static void main(String[]args)
{
/*Scanner sc=new Scanner(System.in);
int a=sc.nextInt();*/
sps v=new sps();
v.get();
v.check();
}}

