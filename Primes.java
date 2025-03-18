package javaprograms.Arrays1;
import java.util.Scanner;

public class Primes {

    static boolean isprime(int n) {
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }
        return true; // No divisors found, number is prime
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int b = sc.nextInt();

        System.out.print("Prime numbers from " + a + " to " + b + " are: ");
        for (int i = a; i <= b; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        
    }
}
