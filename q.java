import java.util.Arrays;
class q
{
public static void main(String[]args)
{
String s="Polymorphism means many forms, and it occurs when we have many classes that are related to each other by inheritance";
String s1="Renu";
String s2="renu";
String s3="noor";
String s4="kumar";
String s5="    noor    ";
System.out.println("length method:"+s.length());
System.out.println("charAt:"+s1.charAt(3));
System.out.println("equal to:"+s1.equals(s2));
System.out.println("compare to:"+s2.compareTo(s4));
System.out.println("index of:"+s.indexOf('m'));
System.out.println("index string:"+s.indexOf("many"));
System.out.println("last index:"+s.lastIndexOf('a'));
System.out.println("substring:"+s.substring(10));
System.out.println("concat:"+s2.concat(s3));
System.out.println("replace:"+s2.replace("renu","noo"));
System.out.println("replace:"+s2.replace("nu","no"));
System.out.println("upper:"+s1.toUpperCase());
System.out.println("lower:"+s1.toLowerCase());
System.out.println("trime:"+s5.trim());
char[]ch=s2.toCharArray();
System.out.println("string array"+s2+Arrays.toString(ch));
String a=new String(ch);
System.out.println("arraystring"+a);
System.out.println("start with:"+s.startsWith("P"));
System.out.println("ends with:"+s1.endsWith("u"));
int n=10;
System.out.println("normal add:"+(n+10));
String sc=String.valueOf(n); 
System.out.println("method:"+(sc+20));
System.out.println("equal:"+s2.equals(s1));
System.out.println("equalignor:"+s2.equalsIgnoreCase(s1));
char[]ch3=new char[10];
String y="raju is a java boy";
y.getChars(0,10,ch3,0);
System.out.println("getchar;"+Arrays.toString(ch3));






}}