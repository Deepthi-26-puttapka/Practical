package javaprograms;

public class Inheritancesuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		super2 obj=new super2();
		obj.key1();

	}

}

class super1{  // parent class
	String name= "Deepthi";
	int var1= 100;
	void key1() { // parent class method
		System.out.println("this parent class");
		System.out.println("name="+name);
		System.out.println("variable="+var1);
		System.out.println("---------------------");
	}
}

class super2 extends super1{
	String name= "Divya";
	int var1= 999;
	void key1() {
		super.key1();
	System.out.println("this Child class");
	System.out.println("name="+name);
	System.out.println("variable="+var1);
}}