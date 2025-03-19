class cmd2//command line argument  :: read the values at the time of execution time
{
public static void main(String ar[])
{
/*int n1=Integer.parseInt(ar[0]);
int n2=Integer.parseInt(ar[1]);
for(int i=0;i<ar.length;i++)

System.out.println(n1+n2);*/
int sum=0;
for(int i=0;i<ar.length;i++)
{
sum=sum+Integer.parseInt(ar[i]);
}
System.out.println("sum all arguments="+sum);
}
}