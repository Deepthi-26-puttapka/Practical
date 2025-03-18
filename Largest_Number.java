package javaprograms.Arrays1;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {100,200,3000,4,600};
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(large<a[i]) {
				large=a[i];
				
			}
		}
		System.out.print("large element:"+large);

	}

}
