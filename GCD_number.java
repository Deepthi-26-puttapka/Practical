package javaprograms.Arrays1;

public class GCD_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12, b=8, gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i; // 1, 2, 4
			}
			
		}
		System.out.print("GCD of a number "+ a +" and "+b+" is "+gcd);

	}

}
