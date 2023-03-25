class ab
{
public static int add(int a,int b)
{
int c=a+b;
return(c);

}
public static void evenodd(int n)
{
if(n%2==0)
System.out.println("even");
else
System.out.println("odd");
}
public static void prime(int n)
{
int count=0;
for(int i=1;i<=n;i++)
if(n%i==0)
count++;
if(count==2)
System.out.println("prime");
else
System.out.println("not ");
}
public static void main(String[]args)
{
int s=add(5,2);
System.out.println(s);
evenodd(2);
prime(5);
}}

