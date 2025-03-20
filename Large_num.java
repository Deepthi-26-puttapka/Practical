package javaprograms.Arrays1;

public class Large_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=120, b=20, c=80;
		System.out.println("Given Three number:"+a+" "+b+" "+c);
		if(a>b&& a>c) {
			System.out.println("largest Number:"+a);
		}
		else if(b>a&& b>c) {
			System.out.println("largest Number:"+b);
		}
		else {
			System.out.println("largest Number:"+c);
		}

	}

}
