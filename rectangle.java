package javaprograms;
import java.util.*;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Length of the Ground:");
		int length= sc.nextInt();
		System.out.print("Breadth of the Ground:");
		int breadth= sc.nextInt();
		
		int  area= (length*breadth);
		int Perimeter= 2*(length+breadth);
		
		System.out.println("length of the rope:"+Perimeter+" m ");
		System.out.println("Area of Carpet:"+area+" sqm ");
			}

}
