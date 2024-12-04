import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner my= new Scanner(System.in); 
		System.out.print("Enter any Number=");
  		int n=my.nextInt();
		int rem, rever=0;
          while(n>0)
{
		rem= n%10;
		rever=rem+(rever*10);
		n=n/10;
}
		System.out.println(rever);
		
		
		

	}

}