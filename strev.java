import java .util.*;
class strev
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String str=sc.next();
StringBuilder s =new StringBuilder(str);
s.reverse();
System.out.println(s);
}}