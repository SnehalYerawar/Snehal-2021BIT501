import java.util.Scanner;
class calFact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a num");
int n=sc.nextInt();
if(n==0)
  System.out.println("0");
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
