class command5
{
public static void main(String ar[])
{
int n=Integer.parseInt(ar[0]);
int rem, i,sum=0;
while(n>0)
{
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println("reverse of given number="+sum);

}
}

