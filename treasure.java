package javaprograms;
import java.util.*;
public class treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of gold coins:");
		int total= sc.nextInt();
		
		System.out.print("Enter the Long bean share percentage : ");
		int Lb=sc.nextInt();
		
		System.out.print("Enter the Blackbeard share percentage: ");
		int Bb=sc.nextInt();
		
		
		
		int longbeanshare= (total*Lb)/100;
		System.out.println("Lb share:"+longbeanshare);
		
		int remaingold= (total-longbeanshare);
		
		int blackbeardshare= (remaingold*Bb)/100;
		System.out.println("Bb share:"+blackbeardshare);
		
		int pirates=total-(longbeanshare+blackbeardshare);
		int threepiratesshare= (pirates/3);
		
		System.out.println("pirates share:"+threepiratesshare);
		
		int leftovercoins=(total-(longbeanshare+blackbeardshare+pirates));
		
		System.out.println("leftovercoins:"+leftovercoins);
		
		
		
		
	}
}
		