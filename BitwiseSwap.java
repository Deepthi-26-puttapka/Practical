package javaprograms.Arrays1;

public class BitwiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		        int a = 5, b = 10;
		        System.out.println("Before swap: a = " + a + ", b = " + b);
		        // Swap using XOR
		        a = a ^ b; // Step 1
		        b = a ^ b; // Step 2
		        a = a ^ b; // Step 3
		       
		       System.out.println("After swap: a = " + a + ", b = " + b);
		   
	}

}
