package javaprograms;
import java.util.*;
public class table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" "+"x"+" "+i+" "+"="+" "+(n*i));
		}
	}

}
