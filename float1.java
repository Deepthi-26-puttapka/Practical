import java.util.Scanner;
public class float1{

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
     System.out.println("enter float number");
        float a=sc.nextFloat();
       System.out.println("value="+(int)a);
     System.out.println("ceiling value="+(int)Math.ceil(a));
     System.out.println("floor value="+(int)Math.floor(a));
}
    }
