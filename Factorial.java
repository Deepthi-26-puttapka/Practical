package javaprograms.Arrays1;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++) {
        	fact=fact*i;
        	 
        }
        System.out.print("factorial of a number:"+fact);
		
		
	}

}
