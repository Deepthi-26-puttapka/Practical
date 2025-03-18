package javaprograms.Arrays1;

public class Fibbonacci_Number {
	
	    public int fib(int n) {
	        
	        int n1 = 0, n2 = 1,c=0;
	        for (int i = 2; i <= n; i++) {
	            c = n1 + n2; // Calculate F(n) = F(n-1) + F(n-2)
	          
	            
	            n1 = n2;          // Update for the next iteration
	            n2 = c;
	        }
	        return c;
	        
	    }

	    public static void main(String[] args) {
	    	Fibbonacci_Number fibonacci = new Fibbonacci_Number();
	        int n = 3; // Example input
	        System.out.println("Fibonacci number F(" + n + ") is: " + fibonacci.fib(n));
	    }
	}

