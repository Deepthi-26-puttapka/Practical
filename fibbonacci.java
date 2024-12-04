package javaprograms;
import java.util.*;

public class fibbonacci {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Month: ");
        int n = scanner.nextInt();
        int i = 0, j = 1;
        System.out.print("fibbonacci series:");
       for(int k=1;k<=n;k++) {
        	
            System.out.print(i+ " ");
            int next = i+ j;  
            i = j;  
            j = next;
            
        }
       
       
    }
}