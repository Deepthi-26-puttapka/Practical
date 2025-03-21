package javaprograms.Arrays1;
import java.util.*;

import javax.swing.Spring;
public class Stings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String A= sc.next();
		String B=sc.next();
		int total_length= A.length()+B.length();
        String compare= (A.compareTo(B)>0)?"Yes":"No";
        String CaptitalA= A.substring(0,1).toUpperCase()+A.substring(1);
        
        String CaptitalB= B.substring(0,1).toUpperCase()+B.substring(1);
        
        
        
        System.out.println(total_length);
        System.out.println(compare);
        System.out.println(CaptitalA +" "+ CaptitalB);
        
        
		

	}

}
