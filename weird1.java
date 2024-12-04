package javaprograms;

import java.util.Scanner;

public class weird1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("enter n value:");
         int n=sc.nextInt();
         if(n%2!=0) {
        	 System.out.println("Weird");
         }
         else if(n>=2 && n<=5) {
        	 System.out.println("Not Weird");
         }
         
         else if(n>=6 && n<=20) {
        	 System.out.println("Weird");
         }
         else {
        	 System.out.println("Not Weird");
         }
         sc.close();
         
	}

}
