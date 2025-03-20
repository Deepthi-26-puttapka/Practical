package javaprograms.Arrays1;

public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20, b=101,c=100;
		
		int small,temp;
		temp=a<b?a:b;  
		small=c<temp?c:temp;
		System.out.println("The smallest number is: "+small);  
	}

}
