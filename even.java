import java.util.Scanner;
class even
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enetre the values i");
int i=sc.nextInt();
System.out.println("enter the value of n");
int n=sc.nextInt();
int sum=0;
while(i<=n)
{
if(i%2!=0)
{
System.out.print(i+" ");
sum=sum+i;
}
i++;
}
System.out.println("sum="+sum);
}
}

