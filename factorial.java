
package javaprograms;

import java.util.Scanner;

public class factorial {
    // Method to calculate factorial of a digit
    public static int factor(int n) {
        int fact1 = 1;
        for (int i = 1; i <= n; i++) {
            fact1 = fact1*i; 
        }
        return fact1;
    }

    // Main method
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int originalNumber = sc.nextInt(); // Store the original input
        int n = originalNumber;

        // Find the sum of factorials of digits
        int sum = 0;
        while (n != 0) {
            int rem = n%10;
            sum =sum+ factor(rem); // Call to the factor method
            n = n/10;
        }

        // Print statements
        if (sum == originalNumber) { // Compare with the original input
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}

	    