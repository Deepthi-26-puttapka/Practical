import java.util.Scanner;
class arithmatic
{
public static void main(String a[])
{
System.out.println("Enter the Radius and height");
Scanner s=new Scanner(System.in);
double r=s.nextDouble();
double h=s.nextDouble();
double area=3.14*r*r*h;
System.out.println("volume of cylinder="+area);
}
}