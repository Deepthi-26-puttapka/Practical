package javaprograms.Arrays1;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=474,palinum;
		palinum=n;
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
		System.out.println("reverse of number:"+sum);
		if(sum==palinum) {
			System.out.print(" palindrome number:");
			
		}
		else{
			System.out.print("Not palindrome number:");
			
		}
			

	}

}
