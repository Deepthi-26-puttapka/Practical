import java.util.Scanner;
class array5
{
public static void main(String ar[])
{
System.out.println("eneter the limit of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s1[]=new String[n];
System.out.println("enter the elements of the array");
for(int i=0;i<n;i++)
{
s1[i]=sc.next();
}
System.out.println("elements of an array are");
for(int i=0;i<n;i++)
{
System.out.print(s1[i]+",");
}
}
}