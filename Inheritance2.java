package javaprograms;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divya obj=new Divya();
		obj.display();
		//obj.show();
		obj.hide();


	}

}
class Anu{
	 void display() {
		 
		System.out.println("Parent class A hiera");
	}
}
class Deepu extends Anu{
	void show() {
		System.out.println("Child class B / parent of Class C  hiera");
	}
}
class Divya extends Anu{
	void hide() {
		System.out.println("Child class C hiera");
	}
}