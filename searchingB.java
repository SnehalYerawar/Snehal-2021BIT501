import java.util.Scanner;

class searchingB
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.print("Enter elements of array");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int left=0 , right=n-1;
int mid=(left+right)/2;
System.out.println("Enter element to search");
int k=sc.nextInt();
for(int i=0;i<n-1;i++)
{
if(arr[i]>arr[i+1])
{	int temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
}}
for(int i=0;i<n;i++)
{
if(arr[i]<k)
{left=mid+1;
}
else if(arr[i]>k)
{
right=mid-1;
}
else
{
System.out.print(arr[mid]);
}
mid=(left+right)/2;}
}}

