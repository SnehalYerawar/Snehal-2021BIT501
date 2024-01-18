import java.util.Scanner;
class chepalin
{
public static void main(String args[])
{int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String str=sc.next();
StringBuilder s=new StringBuilder(str);
while(i<str.length())
{
if(str.charAt(i)==s.charAt(i))
{
  i++;
  
}System.out.print("is palindrome");}
}}


   