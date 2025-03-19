//find given character is alphabet
import java.util.Scanner;
class alpha
{
public static void main(String args[])
{
System.out.println("enter the String Name:");

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch=s.charAt(0);
if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
{
System.out.println(ch+ "is a alphabet");
}
else
{
System.out.println(ch+"is a not a alphabet");
}
}
}
