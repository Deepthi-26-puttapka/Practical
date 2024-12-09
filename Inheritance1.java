package javaprograms;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.display();
		obj.show();
		obj.hide();

	}

}

class A{
	 void display() {
		System.out.println("Parent class A");
	}
}
class B extends A{
	void show() {
		System.out.println("Child class B / parent of Class C ");
	}
}
class C extends B{
	void hide() {
		System.out.println("Child class C ");
	}
}