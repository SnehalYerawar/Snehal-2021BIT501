import java.util.*;
class onlyEven
{
public static void main (String args[])
{

Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int arr1[]=new int[n];
int arr[]=new int[n];
System.out.println("Enter elements of array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
  arr1[i]=arr[i];
}
for(int i=0;i<n;i++)
{
System.out.print(arr1[i]);
}
}
}

