package javaprograms;
import java.util.*;
public class studentgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value:");
		int n= sc.nextInt();
		
		int k= n%10;//19 9 last digit
		int l= n/10; //19 1 first digit
		
		int sum= k+l;
		int product=(k*l);
		if(sum+product==n)
		{
			System.out.println("Special number");
		}
		else
		{
			System.out.println("Not special number");
		}
		
		
		

	}

}
