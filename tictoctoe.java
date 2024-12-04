package javaprograms;
import java.util.*;
public class tictoctoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter one integer ");
		int n =sc.nextInt();
		System.out.println("row number:"+(n-1)/3);
		System.out.println("column number:"+(n-1)%3);
	
		

	}

}
