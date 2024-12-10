package javaprograms;

public class Inheritance3 {

	public static void main(String[] args) {
		
		two ob =new two();  
		ob.a();
		
		
	}
}
class one1{    // parent class
	int p=90;
	void a() {  // parent class method a
		
		System.out.println("this is method of Class one");
		System.out.print("variable="+p);
	}
}
class two extends one1{  // Child class 
	int q=900;  // declare one variable
	
	void a() {  // child class method a
		// every time child class overrides the parent class data
		
		System.out.println("this is method of Class Two");
		System.out.println("variable="+q);
		
		
	}
}