package javaprograms;
import java.util.*;
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		good g=new good();
		g.display();
		System.out.println(in1.a);

	}

}
interface in1{
	final int  a=10;
	 public void display();
}
class good implements in1{
	public void display() {
		System.out.println("good will");
	}
}

