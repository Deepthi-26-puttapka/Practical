package javaprograms.Arrays1;
import java.util.*;
public class Prime_Numbers {
	static boolean isprime(int n) {
		if(n<=1) 
			return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
			return true;
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("emter any number");
		int n=sc.nextInt();
		 if(isprime(n)) {
			 System.out.print("prime number");
		 }
		 else {
			 System.out.print("not prime");
		 }
		

	}

}
