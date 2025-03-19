package javaprograms.Arrays1;

public class Sunny_number {
   // Given, N=80 then N+1 will be 80+1=81, which is a perfect square
	//of the number 9. Hence 80 is a sunny number.
//Let's take another number 10.
//Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. 
	//Hence 10 is not a sunny number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=80;
		int next =n+1; // 81
		double squareNo=  Math.sqrt(next); // 9
		
		if(squareNo-Math.floor(squareNo)==0) // 9-9=0
		{
			System.out.println(n+" is a sunny number");
		}
		else {
			System.out.println(n+" is Not a sunny number");
		}
		

	}

}
